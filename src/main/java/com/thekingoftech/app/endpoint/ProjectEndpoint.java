package com.thekingoftech.app.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.thekingoftech.app.repository.ProjectRepository;
import com.thekingoftech.xml.project.ProjectDetailsRequest;
import com.thekingoftech.xml.project.ProjectDetailsResponse;

 
@Endpoint
public class ProjectEndpoint 
{
    private static final String NAMESPACE_URI = "http://www.thekingoftech.com/xml/project";
 
    private ProjectRepository ProjectRepository;
 
    @Autowired
    public ProjectEndpoint(ProjectRepository ProjectRepository) {
        this.ProjectRepository = ProjectRepository;
    }
 
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ProjectDetailsRequest")
    @ResponsePayload
    public ProjectDetailsResponse getProject(@RequestPayload ProjectDetailsRequest request) {
        ProjectDetailsResponse response = new ProjectDetailsResponse();
        response.setProject(ProjectRepository.findProject(request.getName()));
 
        return response;
    }
}
