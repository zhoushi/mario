package com.zhou.mariocore.route;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * Created by zhou on 2016/2/3.
 * 路由：用于封装一个请求的最小单元
 */
public class Route {
    //路由path
    private String path;
    //执行路由的方法
    private Method action;
    //路由所在的控制器
    private Object controller;

    public Route(){

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Object getController() {
        return controller;
    }

    public void setController(Object controller) {
        this.controller = controller;
    }

    public Method getAction() {
        return action;
    }

    public void setAction(Method action) {
        this.action = action;
    }
}
