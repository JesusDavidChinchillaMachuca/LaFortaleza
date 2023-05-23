package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DAO.Conexion;
import model.DAO.MatriculaDAO;
import model.VO.Matricula;
import view.MatriculaVista;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class MatriculaController implements ActionListener {

    private MatriculaVista matriculaVista;

    public MatriculaController() {
        matriculaVista = new MatriculaVista();
        matriculaVista.setVisible(true);
        matriculaVista.setLocationRelativeTo(null);
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        matriculaVista.btnHorario.addActionListener(controller);
        matriculaVista.btnMatricularse.addActionListener(controller);
        matriculaVista.btnInicio.addActionListener(controller);
       matriculaVista.btnBuscar.addActionListener(controller);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == matriculaVista.btnHorario) {

        }

        if (event.getSource() == matriculaVista.btnMatricularse) {

        }

        if (event.getSource() == matriculaVista.btnInicio) {

        }
        
        if (event.getSource() == matriculaVista.btnBuscar) {

        }

    }

    public void registrar(Matricula matricula) {
        try {
            MatriculaDAO us = new MatriculaDAO();
            us.guardar(Conexion.obtener(), matricula);
        } catch (Exception e) {
        }
    }

}
