package com.estuate.resource_allocation.dto;

import java.util.List;

public class ResourceRequestDTO {
    private List<String> skills;
    private Integer experience;

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
