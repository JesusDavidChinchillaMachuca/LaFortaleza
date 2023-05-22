package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Matricula;

public class MatriculaDAO {

    public void guardar(Connection conexion, Matricula matricula) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO matricula (id_matricula, codigo_estudiante, id_grupo) "
                    + "VALUES(?, ?, ?)");
            consulta.setInt(1, matricula.getIdMatricula());
            consulta.setInt(2, matricula.getEstudiante().getCodigo());
            consulta.setString(3, matricula.getGrupo().getId());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}
