package com.estuate.resource_allocation.repo;

import com.estuate.resource_allocation.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
