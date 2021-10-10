package com.thekingoftech.app.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.thekingoftech.xml.project.Project;


 
@Component
public class ProjectRepository {
    private static final Map<String, Project> projects = new HashMap<>();
 
    @PostConstruct
    public void initData() {
         
    	Project project = new Project();
        project.setName("Sajal");
        project.setStandard(5);
        project.setAddress("Pune");
        projects.put(project.getName(), project);
         
        project = new Project();
        project.setName("Kajal");
        project.setStandard(5);
        project.setAddress("Chicago");
        projects.put(project.getName(), project);
         
        project = new Project();
        project.setName("Kaio");
        project.setStandard(6);
        project.setAddress("Delhi");
        projects.put(project.getName(), project);
         
        project = new Project();
        project.setName("Sukesh");
        project.setStandard(7);
        project.setAddress("Noida");
        projects.put(project.getName(), project);
    }
 
    public Project findProject(String name) {
        Assert.notNull(name, "The Project name must not be null");
        return projects.get(name);
    }
}
