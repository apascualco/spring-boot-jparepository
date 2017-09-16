package apascualco.blog.springboot.persistence.entidades;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CocheEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String matricula;

    @ManyToOne(cascade=CascadeType.REMOVE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private CarroceriaEntidad carroceria;

    @ManyToOne(cascade=CascadeType.REMOVE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private MotorEntidad motor;

    @ManyToOne(cascade=CascadeType.REMOVE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private RuedasEntidad ruedas;

    @ManyToOne(cascade=CascadeType.REMOVE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private TapiceriaEntidad tapiceria;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public CarroceriaEntidad getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(CarroceriaEntidad carroceria) {
        this.carroceria = carroceria;
    }

    public MotorEntidad getMotor() {
        return motor;
    }

    public void setMotor(MotorEntidad motor) {
        this.motor = motor;
    }

    public RuedasEntidad getRuedas() {
        return ruedas;
    }

    public void setRuedas(RuedasEntidad ruedas) {
        this.ruedas = ruedas;
    }

    public TapiceriaEntidad getTapiceria() {
        return tapiceria;
    }

    public void setTapiceria(TapiceriaEntidad tapiceria) {
        this.tapiceria = tapiceria;
    }
}
