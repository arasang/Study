package park.sangeun.codestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CodeStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeStudyApplication.class, args);
    }

}
