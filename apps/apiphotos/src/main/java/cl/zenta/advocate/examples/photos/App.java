package cl.zenta.advocate.examples.photos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class App {

    public static void main( String[] agrs ){
        SpringApplication.run(App.class, agrs);
    }



}