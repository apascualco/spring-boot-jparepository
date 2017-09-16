package apascualco.blog.springboot;

import apascualco.blog.springboot.persistence.entidades.CarroceriaEntidad;
import apascualco.blog.springboot.persistence.repositorio.CarroceriaREPO;
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
public class CarroceriaRepositorioTests {

    @Autowired
    private CarroceriaREPO carroceriaREPO;

    private long count;

    @Test
    public void buscarTodos() {
        this.count = carroceriaREPO.count();
        assertTrue(carroceriaREPO.findAll().size() == this.count);
    }

    @Test
    public void insertar() {
        this.count = carroceriaREPO.count();
        CarroceriaEntidad carroceriaEntidad = PersistenciaUtils.generarCarroceriaEntidad(carroceriaREPO);
        assertNotNull(carroceriaEntidad.getId());
        long carroceriaCount = carroceriaREPO.count();
        assertTrue(this.count < carroceriaCount);
        this.count = carroceriaCount;
    }

    @Test
    public void borrar() {
        carroceriaREPO.delete(carroceriaREPO.count());
        assertTrue(this.count < carroceriaREPO.count());
    }

}
