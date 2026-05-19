package minimas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import minimas.entity.Asset;
import minimas.entity.WorkOrder;
import minimas.repository.AssetRepository;
import minimas.repository.WorkOrderRepository;

@Service
public class WorkOrderService {

    private final WorkOrderRepository workOrderRepository;
    private final AssetRepository assetRepository;

    public WorkOrderService(WorkOrderRepository workOrderRepository,
                            AssetRepository assetRepository) {

        this.workOrderRepository = workOrderRepository;
        this.assetRepository = assetRepository;
    }

    public List<WorkOrder> getAllWorkOrders() {
        return workOrderRepository.findAll();
    }

    public WorkOrder createWorkOrder(Long assetId, WorkOrder workOrder) {

        Asset asset = assetRepository.findById(assetId)
                .orElseThrow(() -> new RuntimeException("Asset not found"));

        workOrder.setAsset(asset);

        return workOrderRepository.save(workOrder);
    }

    public WorkOrder updateWorkOrderStatus(Long id, String status) {

    WorkOrder workOrder = workOrderRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Work order not found"));

    workOrder.setStatus(status);

    return workOrderRepository.save(workOrder);
    }
}