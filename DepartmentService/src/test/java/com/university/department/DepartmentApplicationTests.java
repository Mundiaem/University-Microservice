package com.university.department;

import com.university.department.config.PersistenceConfig;
import com.university.department.config.WebConfig;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {WebConfig.class, PersistenceConfig.class},
        loader = AnnotationConfigContextLoader.class)
class DepartmentApplicationTests {

    @Test
    void contextLoads() {
    }

}
