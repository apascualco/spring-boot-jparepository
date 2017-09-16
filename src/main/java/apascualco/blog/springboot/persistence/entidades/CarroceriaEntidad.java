package apascualco.blog.springboot.persistence.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class CarroceriaEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(targetEntity = CocheEntidad.class)
    private List<CocheEntidad> coche;

    private String color;

    private String tipo;

    private int puertas;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
