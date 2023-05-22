package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DAO.Conexion;
import model.DAO.ProgramaDAO;
import model.VO.Programa;
import view.RegistrarPrograma;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class RegistrarProgramaController implements ActionListener {

    private RegistrarPrograma registrarPrograma;

    public RegistrarProgramaController() {
        registrarPrograma = new RegistrarPrograma();
        registrarPrograma.setVisible(true);
        registrarPrograma.setLocationRelativeTo(null);
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        registrarPrograma.btnAgregar.addActionListener(controller);
        registrarPrograma.btnBuscar.addActionListener(controller);
        registrarPrograma.btnInicio.addActionListener(controller);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == registrarPrograma.btnAgregar) {

        }

        if (event.getSource() == registrarPrograma.btnBuscar) {

        }

        if (event.getSource() == registrarPrograma.btnInicio) {
            registrarPrograma.setVisible(false);
            PrincipalController controller = new PrincipalController();
        }

    }

    public void registrar(Programa programa) {
        try {
            ProgramaDAO us = new ProgramaDAO();
            us.guardar(Conexion.obtener(), programa);
        } catch (Exception e) {
        }
    }

}
