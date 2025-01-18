package com.estuate.resource_allocation.service;

import com.estuate.resource_allocation.dto.ResourceRequestDTO;
import com.estuate.resource_allocation.entity.Resource;
import com.estuate.resource_allocation.repo.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResourceFilterService {

    @Autowired
    private ResourceRepository repository;
    
    public List<Resource> filterResources(ResourceRequestDTO request) {

        List<Resource> allResources = repository.findAll();

        return allResources.stream()
                .filter(resource -> (request.getExperience() == null || resource.getExperience() < request.getExperience()) 
                        && countMatchingSkills(resource.getSkills(), request.getSkills()) >= 2) // At-least 2 skills match
                .collect(Collectors.toList());
    }
   
    private long countMatchingSkills(List<String> resourceSkills, List<String> requestSkills) {
        return requestSkills.stream()
                .filter(resourceSkills::contains)
                .count();
    }
  
    public List<Resource> getAllResources() {
        return repository.findAll(); 
    }
}
