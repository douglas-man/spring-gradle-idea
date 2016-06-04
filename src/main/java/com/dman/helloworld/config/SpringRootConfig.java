package com.dman.helloworld.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dman on 6/4/16.
 */

@Configuration
@ComponentScan({"com.dman.helloworld.service"})
public class SpringRootConfig {
}
