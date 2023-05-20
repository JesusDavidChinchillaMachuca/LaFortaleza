package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Profesor;

public class ProfesoresDAO {

    public void guardar(Connection conexion, Profesor profesor) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO profesor( codigo, nombre, titulo) "
                    + "VALUES(?, ?, ?)");
            consulta.setInt(1, profesor.getCodigo());
            consulta.setString(2, profesor.getNombre());
            consulta.setString(3, profesor.getTitulo());

        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}
