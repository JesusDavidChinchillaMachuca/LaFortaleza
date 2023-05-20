package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MenuPrincipal;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class PrincipalController implements ActionListener {

    private MenuPrincipal vista;

    public PrincipalController(MenuPrincipal vista) {
        this.vista = vista;
        ActionListener(this);
    }
    
    private void ActionListener(ActionListener controller) {
        vista.btnRegistrarProfesor.addActionListener(controller);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        
        if(event.getSource() == vista.btnRegistrarProfesor){
            
        }

    }

    

}
