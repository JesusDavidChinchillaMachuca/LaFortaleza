
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Grupo;

public class GruposDAO {

    public void guardar(Connection conexion, Grupo grupo) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO grupo (id, capacidad) "
                    + "VALUES(?, ?)");
            consulta.setString(1, grupo.getId());
            consulta.setInt(2, grupo.getCapacidad());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}

