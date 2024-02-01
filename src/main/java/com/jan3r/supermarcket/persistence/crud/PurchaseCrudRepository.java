package com.jan3r.supermarcket.persistence.crud;

import com.jan3r.supermarcket.persistence.entity.PurchaseEntity;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseCrudRepository  extends CrudRepository <PurchaseEntity, Integer > {
}
