package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Departamento;

public class DepartamentoDAO {

    public void guardar(Connection conexion, Departamento departamento) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO departamento ( codigo,  nombre,  ubicacion) "
                    + "VALUES(?, ?, ?)");
            consulta.setInt(1, departamento.getCodigo());
            consulta.setString(2, departamento.getNombre());
            consulta.setString(3, departamento.getUbicacion());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}
