package model.VO;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Grupo {

    private String id;
    private int capacidad;
    private Profesor profesor;
    private Asignatura asignatura;
    private Horario horario;

    public Grupo() {
    }

    public Grupo(String id, int capacidad, Profesor profesor, Asignatura asignatura, Horario horario) {
        this.id = id;
        this.capacidad = capacidad;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

}
