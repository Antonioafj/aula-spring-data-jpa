package dio.aula;

import dio.aula.model.Cara;
import dio.aula.repository.NomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private NomeRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Cara cara = new Cara();
        cara.setName("Antonio");
        cara.setUserName("tiny");
        cara.setPassword("dio123");

        repository.save(cara);

        for (Cara u: repository.findAll()){
            System.out.println(u);
        }
    }
}
