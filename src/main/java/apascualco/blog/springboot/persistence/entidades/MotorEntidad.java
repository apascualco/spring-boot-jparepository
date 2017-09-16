package apascualco.blog.springboot.persistence.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class MotorEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(targetEntity = CocheEntidad.class)
    private List<CocheEntidad> coche;

    private int valvulas;

    private String fabricante;

    private String CV;

    private String tipo;

    private String consumo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CocheEntidad> getCoche() {
        return coche;
    }

    public void setCoche(List<CocheEntidad> coche) {
        this.coche = coche;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }
}
