package br.com.Screenmatch;

import br.com.Screenmatch.models.DadosSerie;
import br.com.Screenmatch.service.ConsumoApi;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados("http://www.omdbapi.com/?t=matrix&apikey=e815e24");
        System.out.println(json);
    }

}
