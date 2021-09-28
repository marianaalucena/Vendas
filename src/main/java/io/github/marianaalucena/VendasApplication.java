package io.github.marianaalucena;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Value("${application.name}")
    private String name;

    @Gato
    private Animal animal;

    @Bean(name="executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
          this.animal.fazerBarulho();
        };
    }

    @Autowired
    @Qualifier("applicationName")
    private String applicationName; //injeta a string do configuration nessa variavel

    @GetMapping("/hello")
    public String helloWorld(){
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
