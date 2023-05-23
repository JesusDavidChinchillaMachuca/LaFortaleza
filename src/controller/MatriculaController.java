package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DAO.AsignaturaDAO;
import model.DAO.Conexion;
import model.VO.Asignatura;
import model.VO.Profesor;
import model.VO.Programa;
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
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == matriculaVista.btnHorario) {

        }

        if (event.getSource() == matriculaVista.btnMatricularse) {

        }

        if (event.getSource() == matriculaVista.btnInicio) {

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
