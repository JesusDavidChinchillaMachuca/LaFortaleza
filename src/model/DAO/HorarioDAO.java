package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Horario;

public class HorarioDAO {

    public void guardar(Connection conexion, Horario horario) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO horario (codigo_salon, hora_inicio, hora_fin,  dia_semana) "
                    + "VALUES(?, ?, ?, ?)");
            consulta.setString(1, horario.getCodigoSalon());
            consulta.setString(2, horario.getHoraInicio());
            consulta.setString(3, horario.getHoraFin());
            consulta.setString(4, horario.getDiaSemana());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

}
