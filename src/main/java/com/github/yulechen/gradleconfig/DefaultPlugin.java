package com.github.yulechen.gradleconfig;

import groovy.lang.GroovyObjectSupport;
import groovy.lang.MetaClass;
import org.codehaus.groovy.runtime.InvokerHelper;

/**
 * @Author: chenq
 * @Date: 2020/5/8  14:52
 */
public class DefaultPlugin extends GroovyObjectSupport implements Plugin{
    @Override
    public Plugin id(String id) {
        System.out.println("id--"+id);
        return this;
    }

    @Override
    public Plugin version(String version) {
        System.out.println("version--"+version);
        return this;
    }

    @Override
    public Object invokeMethod(String name, Object args) {
        System.out.println("call method name"+ name);
        MetaClass metaClass = InvokerHelper.getMetaClass(this);
        return metaClass.invokeMethod(this, name, args);
    }
}
