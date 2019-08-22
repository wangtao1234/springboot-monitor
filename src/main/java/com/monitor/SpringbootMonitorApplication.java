package com.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wt
 */
@SpringBootApplication
@EnableAdminServer
public class SpringbootMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMonitorApplication.class, args);
    }

}
