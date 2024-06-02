package dio.aula.repository;

import dio.aula.model.Cara;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NomeRepository extends JpaRepository<Cara, Integer> {

}
