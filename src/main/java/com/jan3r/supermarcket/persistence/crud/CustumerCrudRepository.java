package com.jan3r.supermarcket.persistence.crud;

import com.jan3r.supermarcket.persistence.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustumerCrudRepository extends CrudRepository <CustomerEntity, String > {
}
