package model.VO;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Asignatura {

    private int codigo;
    private String nombre;
    private Integer creditos;
    private Programa programa;
    private Profesor profesor;

    public Asignatura() {
    }

    public Asignatura(int codigo, String nombre, Integer creditos, Programa programa, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.programa = programa;
        this.profesor = profesor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

}
