package apascualco.blog.springboot;

import apascualco.blog.springboot.persistence.entidades.*;
import apascualco.blog.springboot.persistence.repositorio.*;
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
public class CocheRepositorioTests {

    @Autowired
    private CocheREPO cocheREPO;

    @Autowired
    private CarroceriaREPO carroceriaREPO;

    @Autowired
    private TapiceriaREPO tapiceriaREPO;

    @Autowired
    private MotorREPO motorREPO;

    @Autowired
    private RuedasREPO ruedasREPO;

    @Test
    public void buscarTodos() {
        long count = cocheREPO.count();
        assertTrue(cocheREPO.findAll().size() == count);
    }

    @Test
    public void insertarCoche() {
        long cocheCount = this.cocheREPO.count();
        long carroceriaCount = this.carroceriaREPO.count();
        long tapiceriaCount = this.tapiceriaREPO.count();
        long motorCount = this.motorREPO.count();
        long ruedas = this.ruedasREPO.count();

        CocheEntidad cocheEntidad = PersistenciaUtils.generarCocheEntidad(carroceriaREPO, tapiceriaREPO, motorREPO, ruedasREPO);
        CarroceriaEntidad carroceriaEntidad = cocheEntidad.getCarroceria();
        TapiceriaEntidad tapiceriaEntidad = cocheEntidad.getTapiceria();
        MotorEntidad motorEntidad = cocheEntidad.getMotor();
        RuedasEntidad ruedasEntidad = cocheEntidad.getRuedas();

        assertNotNull(carroceriaEntidad.getId());
        assertNotNull(tapiceriaEntidad.getId());
        assertNotNull(motorEntidad.getId());
        assertNotNull(ruedasEntidad.getId());

        assertTrue(carroceriaREPO.count() > carroceriaCount);
        assertTrue(tapiceriaREPO.count() > tapiceriaCount);
        assertTrue(motorREPO.count() > motorCount);
        assertTrue(ruedasREPO.count() > ruedas);

        assertTrue(cocheREPO.count() == cocheCount);
        cocheREPO.save(cocheEntidad);
        assertTrue(cocheREPO.count() > cocheCount);
    }

    @Test
    public void deleteCoche() {
        long cocheCount = this.cocheREPO.count();
        long carroceriaCount = this.carroceriaREPO.count();
        long tapiceriaCount = this.tapiceriaREPO.count();
        long motorCount = this.motorREPO.count();
        long ruedas = this.ruedasREPO.count();

        cocheREPO.delete(String.valueOf(this.cocheREPO.count()));
        assertTrue(cocheCount > cocheREPO.count());

        assertTrue(carroceriaREPO.count() < carroceriaCount);
        assertTrue(tapiceriaREPO.count() < tapiceriaCount);
        assertTrue(motorREPO.count() < motorCount);
        assertTrue(ruedasREPO.count() < ruedas);
    }

}
