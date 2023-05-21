package model.VO;

/**
 *
 * @author JUAN D MELENDEZ
 */
public class Matricula {

    private int idMatricula;
    private Estudiante estudiante;
    private Grupo grupo;

    public Matricula() {
    }

    public Matricula(int idMatricula, Estudiante estudiante, Grupo grupo) {
        this.idMatricula = idMatricula;
        this.estudiante = estudiante;
        this.grupo = grupo;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

}
