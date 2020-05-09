import com.github.yulechen.gradleconfig.DefaultPlugin
import com.github.yulechen.gradleconfig.DefaultSetting
import com.github.yulechen.gradleconfig.Plugin
import com.github.yulechen.gradleconfig.Setting

println "start groovy config"

Setting setting =new DefaultSetting();
Plugin p =new DefaultPlugin();

setting.pluginManagement {
    setting.repositories {
        setting.maven { setting.url 'https://repo.spring.io/plugins-release' }
	}
}

setting.plugins {
	p.id "com.gradle.enterprise" version "3.2"
	p.id "io.spring.gradle-enterprise-conventions" version "0.0.2"
}

setting.include "spring-aop"
setting.include "spring-aspects"

setting.settings{
	println "groovy setting"
}
println "end groovy config"
