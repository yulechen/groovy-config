println "start groovy config"
pluginManagement {
    repositories {
        maven { url 'https://repo.spring.io/plugins-release' }
	}
}

plugins {
	id "com.gradle.enterprise" version "3.2"
	id "io.spring.gradle-enterprise-conventions" version "0.0.2"
}

include "spring-aop"
include "spring-aspects"

settings{
	println "groovy setting"
}
println "end groovy config"
printHello "sb"