package com.kravchenko.service.convert;

import lombok.ToString;

import java.util.ArrayList;

@ToString
public class Job {
    private String name;
    private ArrayList<Deployment> deployments;
    private ArrayList<Param> params;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Deployment> getDeployments() {
        return deployments;
    }

    public void setDeployments(ArrayList<Deployment> deployments) {
        this.deployments = deployments;
    }
}
