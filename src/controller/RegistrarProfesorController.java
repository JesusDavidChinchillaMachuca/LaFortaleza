package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == registroProfesor.btnAgregar) {

        }

    }

}
