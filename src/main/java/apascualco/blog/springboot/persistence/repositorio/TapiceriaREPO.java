package apascualco.blog.springboot.persistence.repositorio;

import apascualco.blog.springboot.persistence.entidades.TapiceriaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TapiceriaREPO extends JpaRepository<TapiceriaEntidad, Long> {
}
