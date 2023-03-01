package com.example.spring_course;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EntityScan( basePackages = {"com.example.Entity"} )

class SpringCourseApplicationTests {

    @Test
    void contextLoads() {
    }

}
