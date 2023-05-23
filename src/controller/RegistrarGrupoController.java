package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DAO.Conexion;
import model.DAO.GrupoDAO;
import model.DAO.HorarioDAO;
import model.DAO.MatriculaDAO;
import model.VO.Grupo;
import model.VO.Horario;
import model.VO.Matricula;
import view.RegistrarGrupo;

/**
 *
 * @author Daniel Barrientos - 1152143
 */

public class RegistrarGrupoController implements ActionListener {

    private RegistrarGrupo registrarGrupo;

    public RegistrarGrupoController() {
        registrarGrupo = new RegistrarGrupo();
        registrarGrupo.setVisible(true);
        registrarGrupo.setLocationRelativeTo(null);
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        registrarGrupo.btnHorario.addActionListener(controller);
        registrarGrupo.btnMatricularse.addActionListener(controller);
        registrarGrupo.btnInicio.addActionListener(controller);
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

    public void registrarGrupo(Grupo grupo) {
        try {
            GrupoDAO us = new GrupoDAO();
            us.guardar(Conexion.obtener(), grupo);
        } catch (Exception e) {
        }
    }
    
    public void registrarHorario(Horario horario) {
        try {
            HorarioDAO us = new HorarioDAO();
            us.guardar(Conexion.obtener(), horario);
        } catch (Exception e) {
        }
    }

}
