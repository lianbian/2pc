package net.lianbian.tpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"net.lianbian.tpc"})
public class ABCTransactionManager {

    public static void main(String[] args) {
        SpringApplication.run(ABCTransactionManager.class, args);
    }
}