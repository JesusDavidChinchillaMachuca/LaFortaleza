package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.VO.Estudiante;

public class EstudianteDAO {

    public void guardar(Connection conexion, Estudiante estudiante) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO estudiante (codigo, nombre, direccion, genero, correo) "
                    + "VALUES(?, ?, ?, ? ,?)");
            consulta.setInt(1, estudiante.getCodigo());
            consulta.setString(2, estudiante.getNombre());
            consulta.setString(3, estudiante.getDireccion());
            consulta.setString(4, estudiante.getGenero());
            consulta.setString(5, estudiante.getCorreo());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
    
    
}
