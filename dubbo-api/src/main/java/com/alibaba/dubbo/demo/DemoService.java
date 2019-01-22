package com.alibaba.dubbo.demo;

import java.util.List;

public interface DemoService {
    public String SayDubbo();
    public String say(String name);
    List<String> getPermissions(Long id);
}
