package com.estuate.resource_allocation.service;

import com.estuate.resource_allocation.dto.ResourceRequestDTO;
import com.estuate.resource_allocation.entity.Resource;
import com.estuate.resource_allocation.repo.ResourceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ResourceFilterServiceTest {

    @Mock
    private ResourceRepository resourceRepository;

    @InjectMocks
    private ResourceFilterService resourceFilterService;

    private List<Resource> resources;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);


        resources = Arrays.asList(
                new Resource(1L, "Dennis", 4, Arrays.asList("Java", "Spring", "JMS", "Mysql", "Angular", "React", "Web services", "Nodejs")),
                new Resource(2L, "Thompson", 7, Arrays.asList("Java", "Oracle", "React", "Angular", "Javascript", "REST API")),
                new Resource(3L, "Kim", 12, Arrays.asList("Java", "JSP", "Spring", "Oracle", "Mysql", "PostgreSQL", "Mongo", "Rest API", "Web services", "Docker", "Redis")),
                new Resource(4L, "Aisha", 9, Arrays.asList("Angular", "Javascript", "Nodejs", "Rest API", "Web services", "Docker", "SQL Server", "PostgreSQL")),
                new Resource(5L, "Maya", 5, Arrays.asList("Spring", "Spring Boot", "Hibernate", "Mysql", "PostgreSQL", "Nodejs", "Python")),
                new Resource(6L, "Kumar", 3, Arrays.asList("Java", "Redis", "Mysql", "Javascript"))
        );
    }

    @Test
    void testFilterResourcesBySkillsWithoutExperience() {

        when(resourceRepository.findAll()).thenReturn(resources);

        ResourceRequestDTO request = new ResourceRequestDTO();
        request.setSkills(Arrays.asList("Java", "Redis", "Javascript"));


        List<Resource> filteredResources = resourceFilterService.filterResources( request);

        assertEquals(3, filteredResources.size(), "Expected three resources (Thompson, Kumar and kim) to match");
        assertEquals("Thompson", filteredResources.get(0).getResourceName());
        assertEquals("Kim", filteredResources.get(1).getResourceName());
        assertEquals("Kumar", filteredResources.get(2).getResourceName());
    }
    
    @Test
    void testFilterResourcesBySkillsAndExperience() {

        when(resourceRepository.findAll()).thenReturn(resources);

        ResourceRequestDTO request = new ResourceRequestDTO();
        request.setSkills(Arrays.asList("Mysql", "Docker", "Spring", "React"));
        request.setExperience(10);

        List<Resource> filteredResources = resourceFilterService.filterResources( request);

        assertEquals(2, filteredResources.size(), "Expected three resources (Thompson, Kumar and kim) to match");
        assertEquals("Dennis", filteredResources.get(0).getResourceName());
        assertEquals("Maya", filteredResources.get(1).getResourceName());

    }
    


    
}
