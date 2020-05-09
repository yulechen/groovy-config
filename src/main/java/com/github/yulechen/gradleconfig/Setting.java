package com.github.yulechen.gradleconfig;

import groovy.lang.Closure;

/**
 * @Author: chenq
 * @Date: 2020/5/8  14:42
 */
public interface Setting {
    public void pluginManagement(Closure clourse);
    public void repositories(Closure clourse);
    public void maven(Closure clourse);
    public void url(String url);
    public void plugins(Closure clourse);
    public void include(String subproject);
    public void settings(Closure clourse);
}
