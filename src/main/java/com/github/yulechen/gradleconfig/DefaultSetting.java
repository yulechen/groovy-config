package com.github.yulechen.gradleconfig;

import groovy.lang.Closure;

/**
 * @Author: chenq
 * @Date: 2020/5/8  14:52
 */
public class DefaultSetting implements Setting {

    @Override
    public void pluginManagement(Closure clourse) {
        System.out.println("pluginManagement clourse"+clourse);
        clourse.setDelegate(this);
        clourse.call();
    }

    @Override
    public void repositories(Closure clourse) {
        clourse.setDelegate(this);
        clourse.call();
    }

    @Override
    public void maven(Closure clourse) {
        System.out.println("maven clourse"+clourse);
    }

    @Override
    public void url(String url) {
        System.out.println(url);
    }

    @Override
    public void plugins(Closure clourse) {
        clourse.setDelegate(this);
        clourse.call();
    }

    @Override
    public void include(String subproject) {
        System.out.println("include.."+subproject);
    }

    @Override
    public void settings(Closure clourse) {
        clourse.setDelegate(this);
        clourse.call();
    }
}
