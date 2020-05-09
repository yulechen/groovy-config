package com.github.yulechen.gradleconfig;

import groovy.lang.GroovyShell;
import groovy.lang.Script;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.customizers.ImportCustomizer;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @Author: chenq
 * @Date: 2020/5/8  14:44
 */
public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException {
        URL resource = Main.class.getResource("/setting.groovy");

//        CompilerConfiguration config =new CompilerConfiguration();
//        ImportCustomizer importCustomizer = new ImportCustomizer();
//
//        importCustomizer.addImports("com.github.yulechen.gradleconfig.DefaultPlugin")
//                .addImports("com.github.yulechen.gradleconfig.DefaultSetting")
//                .addImports("com.github.yulechen.gradleconfig.Plugin")
//                .addImports("com.github.yulechen.gradleconfig.Setting");
//
//        config.addCompilationCustomizers(importCustomizer);
//        config.setScriptBaseClass(BaseScript.class.getName());

        GroovyShell shell = new GroovyShell();

        Script script = shell.parse(resource.toURI());

        Object run = script.run();
    }

}
