package apascualco.blog.springboot;

import apascualco.blog.springboot.persistence.entidades.MotorEntidad;
import apascualco.blog.springboot.persistence.repositorio.MotorREPO;
import apascualco.blog.springboot.utils.PersistenciaUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MotorRepositorioTests {

    @Autowired
    private MotorREPO motorREPO;

    private long count;

    @Test
    public void buscarTodos() {
        this.count = motorREPO.count();
        assertTrue(motorREPO.findAll().size() == this.count);
    }

    @Test
    public void insertar() {
        this.count = motorREPO.count();
        MotorEntidad carroceriaEntidad = PersistenciaUtils.generarMotorEntidad(motorREPO);
        assertNotNull(carroceriaEntidad.getId());
        long carroceriaCount = motorREPO.count();
        assertTrue(this.count < carroceriaCount);
        this.count = carroceriaCount;
    }

    @Test
    public void borrar() {
        motorREPO.delete(motorREPO.count());
        assertTrue(this.count < motorREPO.count());
    }

}
