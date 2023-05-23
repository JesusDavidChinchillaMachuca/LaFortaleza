package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Asignatura;

public class AsignaturaDAO {

    public void guardar(Connection conexion, Asignatura asignatura) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO asignatura (codigo, nombre, creditos, codigo_programa) "
                    + "VALUES(?, ?, ?, ?)");
            consulta.setInt(1, asignatura.getCodigo());
            consulta.setString(2, asignatura.getNombre());
            consulta.setInt(3, asignatura.getCreditos());
            consulta.setInt(4, asignatura.getPrograma().getCodigo());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}