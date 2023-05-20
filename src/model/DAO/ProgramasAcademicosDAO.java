
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Programa;

public class ProgramasAcademicosDAO {

    public void guardar(Connection conexion, Programa programa) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO profesor( codigo, nombre, direcctor) "
                    + "VALUES(?, ?, ?)");
            consulta.setString(1, programa.getCodigo());
            //consulta.setString(2, programa.getDirecctor());
            consulta.setString(3, programa.getNombre());

        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}
