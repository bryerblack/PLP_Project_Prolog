package com.ufcg.psoft.scrumboard.controller;

import com.ufcg.psoft.scrumboard.dto.ProjectDTO;
import com.ufcg.psoft.scrumboard.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/project/", method = RequestMethod.POST)
    public ResponseEntity<?> criarProjeto(@RequestBody ProjectDTO projectDTO, UriComponentsBuilder ucBuilder) {

        String projID = projectService.addProject(projectDTO);
        return new ResponseEntity<String>("Projeto criado com ID:" + projID, HttpStatus.CREATED);
    }
}
