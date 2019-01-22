package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.DemoService;
import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }

    public String SayDubbo() {
        System.out.println("---SayDubbo----服务被调用----------");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Dubbo say:Hello!!!!!");
        //Entity entity = new Entity();
        //entity.setService("hello");
        return stringBuffer.toString();
    }

    public String say(String name) {
        System.out.println("----say---服务被调用----------");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name + " say:Hello!!!!!");
        return stringBuffer.toString();
    }
}
