package apascualco.blog.springboot.persistence.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class TapiceriaEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(targetEntity = CocheEntidad.class)
    private List<CocheEntidad> coche;

    private String materiall;

    private String color;

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

    public String getMateriall() {
        return materiall;
    }

    public void setMateriall(String materiall) {
        this.materiall = materiall;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
