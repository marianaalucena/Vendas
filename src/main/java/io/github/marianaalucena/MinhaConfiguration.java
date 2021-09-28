package io.github.marianaalucena;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURACAO DE DESENVOLVIMENTO");
        };
    }

    @Bean(name = "applicationName")
    public String applicationName() {
        return "Sistema de Vendas";
    }

}

