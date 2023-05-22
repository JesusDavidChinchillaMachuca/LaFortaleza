package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DAO.AsignaturaDAO;
import model.DAO.Conexion;
import model.VO.Asignatura;
import view.RegistrarAsignatura;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class RegistrarAsignaturaController implements ActionListener {

    private RegistrarAsignatura registroAsignatura;

    public RegistrarAsignaturaController() {
        registroAsignatura = new RegistrarAsignatura();
        registroAsignatura.setVisible(true);
        registroAsignatura.setLocationRelativeTo(null);
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        registroAsignatura.btnAgregar.addActionListener(controller);
        registroAsignatura.btnBuscar.addActionListener(controller);
        registroAsignatura.btnInicio.addActionListener(controller);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == registroAsignatura.btnAgregar) {

        }

        if (event.getSource() == registroAsignatura.btnBuscar) {

        }

        if (event.getSource() == registroAsignatura.btnInicio) {
            registroAsignatura.setVisible(false);
            PrincipalController controller = new PrincipalController();
        }

    }

    public void registrar(Asignatura asignatura) {
        try {
            AsignaturaDAO us = new AsignaturaDAO();
            us.guardar(Conexion.obtener(), asignatura);
        } catch (Exception e) {
        }
    }

}
