package pe.mil.ejercito.microservice.components.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * MicroServicesProperties
 * <p>
 * MicroServicesProperties class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author bacsystem.sac@gmail.com
 * @since 25/02/2024
 */
@Component("microServicesProperties")
@ConfigurationProperties
public class MicroServicesProperties {
    @Value("${spring.application.name:component name not available}")
    private String applicationName;
    @Value("${spring.application.version:component version not available}")
    private String applicationVersion;
    @Value("${spring.version:component version not available}")
    private String springVersion;
    @Value("${spring.application.log:log path not available}")
    private String logsPath;
    @Value("${server.port:8000}")
    private Integer port;
    @Value("${server.servlet.context-path:component-server-servlet-context-path-not-available}")
    private String contextPath;
    @Value("${spring.webflux.base-path:component-spring-webflux-base-path-not-available}")
    private String webFluxBasePath;
}