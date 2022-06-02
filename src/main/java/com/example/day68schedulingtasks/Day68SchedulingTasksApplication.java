package com.example.day68schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Day68SchedulingTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day68SchedulingTasksApplication.class, args);
    }

}
