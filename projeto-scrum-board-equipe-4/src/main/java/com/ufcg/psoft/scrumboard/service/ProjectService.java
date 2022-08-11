package com.ufcg.psoft.scrumboard.service;

import com.ufcg.psoft.scrumboard.dto.ProjectDTO;
import com.ufcg.psoft.scrumboard.model.Project;
import com.ufcg.psoft.scrumboard.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projRep;

    public String addProject(ProjectDTO projectDTO) {
        Project proj = new Project(projectDTO.getName());
        return this.projRep.addProject(proj);
    }
}
