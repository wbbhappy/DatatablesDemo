package com.alibaba.dubbo.demo.impl;

import java.io.Serializable;

public class Entity implements Serializable{
    private String service;

    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }
}
