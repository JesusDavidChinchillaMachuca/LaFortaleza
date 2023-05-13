package model.VO;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Grupo {

    private String id;
    private Integer capacidad;

    public Grupo() {
    }

    public Grupo(String id, Integer capacidad) {
        this.id = id;
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

}
