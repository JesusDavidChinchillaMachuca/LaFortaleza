package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DAO.Conexion;
import model.DAO.ProfesorDAO;
import model.VO.Profesor;
import view.RegistrarProfesor;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class RegistrarProfesorController implements ActionListener {

    RegistrarProfesor registroProfesor;

    public RegistrarProfesorController() {
        registroProfesor = new RegistrarProfesor();
        registroProfesor.setVisible(true);
        registroProfesor.setLocationRelativeTo(null);
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        registroProfesor.btnAgregar.addActionListener(controller);
        registroProfesor.btnBuscar.addActionListener(controller);
        registroProfesor.btnInicio.addActionListener(controller);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == registroProfesor.btnAgregar) {

        }

        if (event.getSource() == registroProfesor.btnBuscar) {

        }

        if (event.getSource() == registroProfesor.btnInicio) {
            registroProfesor.setVisible(false);
            PrincipalController controller = new PrincipalController();
        }

    }

    public void registrar(Profesor profesor) {
        try {
            ProfesorDAO us = new ProfesorDAO();
            us.guardar(Conexion.obtener(), profesor);
        } catch (Exception e) {
        }
    }

}
