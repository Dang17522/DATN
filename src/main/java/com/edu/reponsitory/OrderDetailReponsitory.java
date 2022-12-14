package com.edu.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edu.model.OrderDetail;

@Repository
public interface OrderDetailReponsitory extends JpaRepository<OrderDetail, Long>{
    @Query("select d from OrderDetail d where d.order.id = ?1")
    OrderDetail findByOrderId(Long id);
}
