package com.github.yulechen.gradleconfig;

import groovy.lang.GroovyObject;
import groovy.lang.GroovySystem;
import groovy.lang.MetaClass;
import groovy.lang.Script;
import org.codehaus.groovy.runtime.InvokerHelper;

/**
 * @Author: chenq
 * @Date: 2020/5/9  10:08
 */
public  abstract  class BaseScript  extends Script {

    private Object bean=new DefaultSetting();

    @Override
    public Object invokeMethod(String name, Object args) {
        MetaClass metaClass = getInterMetaClass();

        System.out.println("other metaClass" + metaClass);
        System.out.println("invokeMethod hook....");
       // return super.invokeMethod(name, args);
        return "haha";
    }


    private MetaClass getInterMetaClass() {
        if (bean instanceof GroovyObject) {
            return ((GroovyObject) bean).getMetaClass();
        } else {
            return GroovySystem.getMetaClassRegistry().getMetaClass(bean.getClass());
        }
    }


    public void printHello(String name){
        System.out.println("Script Innner Method.."+name);
    }


    public void customMethod(){
       // InvokerHelper.invokeMethod(new Object(), "print", new Object[]{value});
    }
  // Adapater BeanMetaClass 2 GroovyMetaClass
  // Adapter beanObj to groovyObject
}
