package com.jan3r.supermarcket.persistence.crud;

import com.jan3r.supermarcket.persistence.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository <CategoryEntity, Integer> {
}
