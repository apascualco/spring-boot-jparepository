package apascualco.blog.springboot.persistence.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class RuedasEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(targetEntity = CocheEntidad.class)
    private List<CocheEntidad> coche;

    private int tamanyo;

    private String perfil;

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

    public int getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(int tamanyo) {
        this.tamanyo = tamanyo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
