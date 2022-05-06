package com.starter.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author tzxx
 */
@ConfigurationProperties(prefix = "com.zl.starter")
public class ZlProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
