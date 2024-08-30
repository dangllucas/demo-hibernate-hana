package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@SpringBootTest
class DemoRepoTest {

    @Autowired
    DemoRepo demoRepo;

    @Test
    void test() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> {
            DemoEntity entity = new DemoEntity();
            entity.setHans("dsgofnhusdfobnug");
            demoRepo.save(entity);
        });
    }

}