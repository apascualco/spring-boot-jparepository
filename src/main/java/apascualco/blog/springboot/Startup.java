package apascualco.blog.springboot;

import apascualco.blog.springboot.persistence.repositorio.*;
import apascualco.blog.springboot.utils.PersistenciaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class Startup implements ApplicationListener<ApplicationReadyEvent> {

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

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        this.loadDataBase();
    }

    private void loadDataBase() {
        for(int i = 0; i < 100; i++) {
            cocheREPO.save(PersistenciaUtils.generarCocheEntidad(carroceriaREPO, tapiceriaREPO, motorREPO, ruedasREPO));
        }
    }

}
