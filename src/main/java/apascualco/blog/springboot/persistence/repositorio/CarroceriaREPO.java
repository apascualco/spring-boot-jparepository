package apascualco.blog.springboot.persistence.repositorio;

import apascualco.blog.springboot.persistence.entidades.CarroceriaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroceriaREPO extends JpaRepository<CarroceriaEntidad, Long> {
}
