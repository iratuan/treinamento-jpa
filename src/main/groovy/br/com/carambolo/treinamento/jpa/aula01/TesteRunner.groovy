package br.com.carambolo.treinamento.jpa.aula01


import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class TesteRunner implements CommandLineRunner{

    @Override
    void run(String... args) throws Exception {
        println("Teste")
    }
}
