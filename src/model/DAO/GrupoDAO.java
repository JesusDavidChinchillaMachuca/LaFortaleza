package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Grupo;

public class GrupoDAO {

    public void guardar(Connection conexion, Grupo grupo) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO grupo (id_grupo, capacidad, codigo_profesor, codigo_salon, codigo_asignatura) "
                    + "VALUES(?, ?, ?, ?, ?)");
            consulta.setString(1, grupo.getId());
            consulta.setInt(2, grupo.getCapacidad());
            consulta.setInt(3, grupo.getProfesor().getCodigo());
            consulta.setString(4, grupo.getHorario().getCodigoSalon());
            consulta.setInt(5, grupo.getAsignatura().getCodigo());

            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}
