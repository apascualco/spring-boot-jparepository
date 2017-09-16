package apascualco.blog.springboot;

import apascualco.blog.springboot.persistence.entidades.RuedasEntidad;
import apascualco.blog.springboot.persistence.repositorio.RuedasREPO;
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
public class RuedasRepositorioTest {

    @Autowired
    private RuedasREPO ruedasREPO;

    private long count;

    @Test
    public void buscarTodos() {
        this.count = ruedasREPO.count();
        assertTrue(ruedasREPO.findAll().size() == this.count);
    }

    @Test
    public void insertar() {
        this.count = ruedasREPO.count();
        RuedasEntidad carroceriaEntidad = PersistenciaUtils.generarRuedadEntidad(ruedasREPO);
        assertNotNull(carroceriaEntidad.getId());
        long carroceriaCount = ruedasREPO.count();
        assertTrue(this.count < carroceriaCount);
        this.count = carroceriaCount;
    }

    @Test
    public void borrar() {
        ruedasREPO.delete(ruedasREPO.count());
        assertTrue(this.count < ruedasREPO.count());
    }
}
