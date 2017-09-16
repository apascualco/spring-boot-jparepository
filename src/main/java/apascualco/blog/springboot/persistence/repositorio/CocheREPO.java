package apascualco.blog.springboot.persistence.repositorio;

import apascualco.blog.springboot.persistence.entidades.CocheEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheREPO extends JpaRepository<CocheEntidad, String> {
}
