
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Horario;

public class HorarioDAO {

    public void guardar(Connection conexion, Horario horario) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO usuario (hora_ini, hora_fin, salon) "
                    + "VALUES(?, ?, ?)");
            consulta.setString(1, horario.getHora_ini());
            consulta.setString(2, horario.getHora_fin());
            consulta.setString(3, horario.getSalon());

            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

}
