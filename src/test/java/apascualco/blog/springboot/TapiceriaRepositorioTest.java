package apascualco.blog.springboot;

import apascualco.blog.springboot.persistence.entidades.TapiceriaEntidad;
import apascualco.blog.springboot.persistence.repositorio.TapiceriaREPO;
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
public class TapiceriaRepositorioTest {

    @Autowired
    private TapiceriaREPO tapiceriaREPO;

    private long count;

    @Test
    public void buscarTodos() {
        this.count = tapiceriaREPO.count();
        assertTrue(tapiceriaREPO.findAll().size() == this.count);
    }

    @Test
    public void insertar() {
        this.count = tapiceriaREPO.count();
        TapiceriaEntidad carroceriaEntidad = PersistenciaUtils.generarTapiceriaEntidad(tapiceriaREPO);
        assertNotNull(carroceriaEntidad.getId());
        long carroceriaCount = tapiceriaREPO.count();
        assertTrue(this.count < carroceriaCount);
        this.count = carroceriaCount;
    }

    @Test
    public void borrar() {
        tapiceriaREPO.delete(tapiceriaREPO.count());
        assertTrue(this.count < tapiceriaREPO.count());
    }

}
