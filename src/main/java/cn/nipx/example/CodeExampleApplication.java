package cn.nipx.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.nipx.example.mapper")
public class CodeExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeExampleApplication.class, args);
    }

}
