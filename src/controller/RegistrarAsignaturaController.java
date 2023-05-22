package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.RegistrarAsignatura;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class RegistrarAsignaturaController implements ActionListener {

    RegistrarAsignatura registroAsignatura;

    public RegistrarAsignaturaController() {
        registroAsignatura = new RegistrarAsignatura();
        registroAsignatura.setVisible(true);
        registroAsignatura.setLocationRelativeTo(null);
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        registroAsignatura.btnAgregar.addActionListener(controller);
        registroAsignatura.btnBuscar.addActionListener(controller);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == registroAsignatura.btnAgregar) {

        }

    }

}
