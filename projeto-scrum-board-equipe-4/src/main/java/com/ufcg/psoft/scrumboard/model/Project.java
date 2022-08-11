package com.ufcg.psoft.scrumboard.model;

import java.util.UUID;

public class Project {

    private String id;
    private String nome;
    private ProjectUseres users;
    private StorySystem stories;
    private ProjectTasks tasks;

    public Project(String nome) {
        this.nome = nome;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ProjectUseres getUsers() {
        return users;
    }

    public StorySystem getStories() {
        return stories;
    }

    public ProjectTasks getTasks() {
        return tasks;
    }
}
