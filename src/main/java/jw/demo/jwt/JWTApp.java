package jw.demo.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class JWTApp {
    public static void main(String[] args) {
        System.out.println("SpringBootApplication Started!");
        SpringApplication.run(JWTApp.class, args);
    }
}
