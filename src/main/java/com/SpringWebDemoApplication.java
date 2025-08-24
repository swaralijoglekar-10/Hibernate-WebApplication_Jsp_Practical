package com;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
public class SpringWebDemoApplication {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8090);
        tomcat.getConnector(); // Create default connector
        tomcat.addWebapp("/", System.getProperty("user.dir") + "/src/main/webapp");
        tomcat.start();
        tomcat.getServer().await();
    }
}
