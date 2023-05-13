package model.VO;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Programa {

    private String codigo;
    private String nombre;
    private Profesor direcctor;

    public Programa() {
    }

    public Programa(String codigo, String nombre, Profesor direcctor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direcctor = direcctor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getDirecctor() {
        return direcctor;
    }

    public void setDirecctor(Profesor direcctor) {
        this.direcctor = direcctor;
    }

}
