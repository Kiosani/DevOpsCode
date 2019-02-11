package com.kravchenko.service.convert;

import lombok.ToString;

@ToString
public class Deployment {
    private String type;
    private String name;
    private String userName;
    private String sshCredentials;
    private String host;
    private String deploymentType;
    private String targetDir;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSshCredentials() {
        return sshCredentials;
    }

    public void setSshCredentials(String sshCredentials) {
        this.sshCredentials = sshCredentials;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDeploymentType() {
        return deploymentType;
    }

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    public String getTargetDir() {
        return targetDir;
    }

    public void setTargetDir(String targetDir) {
        this.targetDir = targetDir;
    }
}
