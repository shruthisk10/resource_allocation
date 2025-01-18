package com.estuate.resource_allocation.controller;

import com.estuate.resource_allocation.dto.ResourceRequestDTO;
import com.estuate.resource_allocation.entity.Resource;
import com.estuate.resource_allocation.service.ResourceFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {

    @Autowired
    private ResourceFilterService service;

    @PostMapping
    public List<Resource> getResourcesForProject(@RequestBody ResourceRequestDTO request) {
        return service.filterResources(request);
    }
    
    @GetMapping
    public List<Resource> getAllResources() {
        return service.getAllResources();
    }
}
