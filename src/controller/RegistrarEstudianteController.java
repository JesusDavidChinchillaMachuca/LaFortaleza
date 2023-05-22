package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DAO.Conexion;
import model.DAO.EstudianteDAO;
import model.VO.Estudiante;
import view.RegistrarEstudiante;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class RegistrarEstudianteController implements ActionListener {

    RegistrarEstudiante registroEstudiante;

    public RegistrarEstudianteController() {
        registroEstudiante = new RegistrarEstudiante();
        registroEstudiante.setVisible(true);
        registroEstudiante.setLocationRelativeTo(null);
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        registroEstudiante.btnAgregar.addActionListener(controller);
        registroEstudiante.btnBuscar.addActionListener(controller);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == registroEstudiante.btnAgregar) {

            int codigo = Integer.parseInt(registroEstudiante.txtCodigo.getText());
            String nombre = registroEstudiante.txtNombre.getText();
            String direccion = registroEstudiante.txtDireccion.getText();
            String genero = (String) registroEstudiante.cmbGenero.getSelectedItem();
            String correo = registroEstudiante.txtCorreo.getText();

            Estudiante estudiante = new Estudiante(codigo, nombre, direccion, genero, correo);

            registrar(estudiante);

            JOptionPane.showMessageDialog(registroEstudiante, "Se ha registrado correctamente");
            
            registroEstudiante.txtCodigo.setText("");
            registroEstudiante.txtNombre.setText("");
            registroEstudiante.txtDireccion.setText("");
            registroEstudiante.txtCorreo.setText("");

        }

    }

    //metodo para guardar el estudiante en la base de datos
    public void registrar(Estudiante estudiante) {
        try {
            EstudianteDAO us = new EstudianteDAO();
            us.guardar(Conexion.obtener(), estudiante);
        } catch (Exception e) {
        }
    }
}
