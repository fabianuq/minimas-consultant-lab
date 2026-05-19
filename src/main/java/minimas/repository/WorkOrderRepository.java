package minimas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import minimas.entity.WorkOrder;

public interface WorkOrderRepository extends JpaRepository<WorkOrder, Long> {

}