package com.giantdwarf.dockerjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinsApplication.class, args);
        System.out.println("슬랙에 메세지가 과연..");

    }

}
