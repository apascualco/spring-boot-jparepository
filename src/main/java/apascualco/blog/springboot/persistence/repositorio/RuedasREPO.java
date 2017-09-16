package apascualco.blog.springboot.persistence.repositorio;

import apascualco.blog.springboot.persistence.entidades.RuedasEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuedasREPO extends JpaRepository<RuedasEntidad, Long> {
}
