package com.estuate.resource_allocation.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resourceId;

    private String resourceName;
    private int experience; 
    
    @ElementCollection
    @CollectionTable(name = "resource_skills", joinColumns = @JoinColumn(name = "resource_id"))
    @Column(name = "skill")
    private List<String> skills;

    public Resource() {
    }

    public Resource(Long resourceId, String resourceName, int experience, List<String> skills) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.experience = experience;
        this.skills = skills;
    }
}
