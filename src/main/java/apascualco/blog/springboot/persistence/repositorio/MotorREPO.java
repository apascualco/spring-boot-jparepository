package apascualco.blog.springboot.persistence.repositorio;

import apascualco.blog.springboot.persistence.entidades.MotorEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorREPO extends JpaRepository<MotorEntidad, Long> {
}
