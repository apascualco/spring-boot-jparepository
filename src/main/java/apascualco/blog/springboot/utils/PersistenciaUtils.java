package apascualco.blog.springboot.utils;

import apascualco.blog.springboot.persistence.entidades.*;
import apascualco.blog.springboot.persistence.repositorio.CarroceriaREPO;
import apascualco.blog.springboot.persistence.repositorio.MotorREPO;
import apascualco.blog.springboot.persistence.repositorio.RuedasREPO;
import apascualco.blog.springboot.persistence.repositorio.TapiceriaREPO;
import org.apache.commons.lang.RandomStringUtils;

import java.util.Random;

public class PersistenciaUtils {

    public static CocheEntidad generarCocheEntidad(CarroceriaREPO carroceriaREPO, TapiceriaREPO tapiceriaREPO, MotorREPO motorREPO, RuedasREPO ruedasREPO) {
        CocheEntidad cocheEntidad = new CocheEntidad();
        cocheEntidad.setCarroceria(PersistenciaUtils.generarCarroceriaEntidad(carroceriaREPO));
        cocheEntidad.setMotor(PersistenciaUtils.generarMotorEntidad(motorREPO));
        cocheEntidad.setRuedas(PersistenciaUtils.generarRuedadEntidad(ruedasREPO));
        cocheEntidad.setTapiceria(PersistenciaUtils.generarTapiceriaEntidad(tapiceriaREPO));
        return cocheEntidad;
    }

    public static CarroceriaEntidad generarCarroceriaEntidad(CarroceriaREPO carroceriaREPO) {
        CarroceriaEntidad carroceriaEntidad = new CarroceriaEntidad();
        carroceriaEntidad.setColor(PersistenciaUtils.generateString());
        carroceriaEntidad.setTipo(PersistenciaUtils.generateString());
        carroceriaEntidad.setPuertas(PersistenciaUtils.generateInt());
        return carroceriaREPO.save(carroceriaEntidad);
    }

    public static MotorEntidad generarMotorEntidad(MotorREPO motorREPO) {
        MotorEntidad motorEntidad = new MotorEntidad();
        motorEntidad.setValvulas(PersistenciaUtils.generateInt());
        motorEntidad.setFabricante(PersistenciaUtils.generateString());
        motorEntidad.setCV(PersistenciaUtils.generateString());
        motorEntidad.setTipo(PersistenciaUtils.generateString());
        motorEntidad.setConsumo(PersistenciaUtils.generateString());
        return motorREPO.save(motorEntidad);
    }

    public static RuedasEntidad generarRuedadEntidad(RuedasREPO ruedasREPO) {
        RuedasEntidad ruedasEntidad = new RuedasEntidad();
        ruedasEntidad.setTamanyo(PersistenciaUtils.generateInt());
        ruedasEntidad.setPerfil(PersistenciaUtils.generateString());
        return ruedasREPO.save(ruedasEntidad);
    }

    public static TapiceriaEntidad generarTapiceriaEntidad(TapiceriaREPO tapiceriaREPO) {
        TapiceriaEntidad tapiceriaEntidad = new TapiceriaEntidad();
        tapiceriaEntidad.setMateriall(PersistenciaUtils.generateString());
        tapiceriaEntidad.setColor(PersistenciaUtils.generateString());
        return tapiceriaREPO.save(tapiceriaEntidad);
    }

    private static String generateString() {
        return RandomStringUtils.randomAlphanumeric(17);
    }

    private static int generateInt() {
        return  new Random().nextInt(100);
    }

}
