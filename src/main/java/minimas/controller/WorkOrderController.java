package minimas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import minimas.entity.WorkOrder;
import minimas.service.WorkOrderService;

@RestController
@RequestMapping("/api/work-orders")
public class WorkOrderController {

    private final WorkOrderService workOrderService;

    public WorkOrderController(WorkOrderService workOrderService) {
        this.workOrderService = workOrderService;
    }

    @GetMapping
    public List<WorkOrder> getAllWorkOrders() {
        return workOrderService.getAllWorkOrders();
    }

    @PostMapping("/{assetId}")
    public WorkOrder createWorkOrder(@PathVariable Long assetId,
                                     @RequestBody WorkOrder workOrder) {

        return workOrderService.createWorkOrder(assetId, workOrder);
    }

    @PutMapping("/{id}/status")
    public WorkOrder updateWorkOrderStatus(@PathVariable Long id,
    @RequestParam String status) {
    return workOrderService.updateWorkOrderStatus(id, status);
    }
}