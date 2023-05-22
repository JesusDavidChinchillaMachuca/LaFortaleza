
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DAO.Conexion;
import model.DAO.DepartamentoDAO;
import model.VO.Departamento;
import view.RegistrarDepartamento;

/**
 *
 * @author Daniel Barrientos - 1152143
 */

public class RegistrarDepartamentoController implements ActionListener{
    
    private RegistrarDepartamento registrarDepartamento; 
    
    public RegistrarDepartamentoController() {
        registrarDepartamento = new RegistrarDepartamento();
        registrarDepartamento.setVisible(true);
        registrarDepartamento.setLocationRelativeTo(null);
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        registrarDepartamento.btnAgregar.addActionListener(controller);
        registrarDepartamento.btnBuscar.addActionListener(controller);
        registrarDepartamento.btnInicio.addActionListener(controller);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == registrarDepartamento.btnAgregar) {
            
            

        }
        
        if (event.getSource() == registrarDepartamento.btnBuscar) {
            

        }

        if (event.getSource() == registrarDepartamento.btnInicio) {
            registrarDepartamento.setVisible(false);
            PrincipalController controller = new PrincipalController();
        }

    }
    
    public void registrar(Departamento departamento) {
        try {
            DepartamentoDAO us = new DepartamentoDAO();
            us.guardar(Conexion.obtener(), departamento);
        } catch (Exception e) {
        }
    }
    
    

}
