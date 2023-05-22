
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Programa;

public class ProgramaDAO {

    public void guardar(Connection conexion, Programa programa) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO programa ( codigo, nombre, ubicacion, codigo_departamento, codigo_director) "
                    + "VALUES(?, ?, ?, ?, ?)");
            consulta.setInt(1, programa.getCodigo());
            consulta.setString(2, programa.getNombre());
            consulta.setString(3, programa.getUbicacion());
            consulta.setInt(4, programa.getDepartamento().getCodigo());
            consulta.setInt(5, programa.getProfesor().getCodigo());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}
