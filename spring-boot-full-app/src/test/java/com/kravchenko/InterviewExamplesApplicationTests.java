package com.kravchenko;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(value = "classpath:db-config-h2.properties")
public class InterviewExamplesApplicationTests {

    @Autowired
    private Environment env;

    @Test
    public void contextLoads() throws IOException {
        Map map = printAllProperties();
        map.keySet().forEach(key -> System.out.printf("K_V %-40s  : %s\n", key, map.get(key)));
    }

    public Map printAllProperties() {
        Map<String, Object> map = new HashMap<>();
        for (PropertySource<?> propertySource1 : ((AbstractEnvironment) env).getPropertySources()) {
            if (propertySource1 instanceof MapPropertySource) {
                map.putAll(((MapPropertySource) propertySource1).getSource());
            }
        }
        return map;
    }

}
