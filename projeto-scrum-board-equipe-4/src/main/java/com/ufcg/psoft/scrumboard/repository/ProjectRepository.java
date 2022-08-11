package com.ufcg.psoft.scrumboard.repository;

import com.ufcg.psoft.scrumboard.model.Project;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProjectRepository {

    private Map<String, Project> projects;

    public ProjectRepository() {
        this.projects = new HashMap<String, Project>();
    }
    public String addProject(Project proj) {
        this.projects.put(proj.getId(), proj);
        return proj.getId();
    }
}
