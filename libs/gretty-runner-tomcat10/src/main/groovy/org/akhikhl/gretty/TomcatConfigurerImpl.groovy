package org.akhikhl.gretty

import org.apache.catalina.Service
import org.apache.catalina.startup.Tomcat
import org.apache.tomcat.JarScanner

class TomcatConfigurerImpl extends AbstractTomcatConfigurerImpl{

    @Override
    JarScanner createJarScanner(JarScanner jarScanner, JarSkipPatterns skipPatterns) {
        return new JakartaSkipPatternJarScanner(jarScanner, skipPatterns)
    }

    @Override
    void setService(Tomcat tomcat, Service service) {

    }

    @Override
    void setEngine(Tomcat tomcat, Service service) {

    }
}
