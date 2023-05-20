package lafortaleza;

import controller.PrincipalController;
import view.MenuPrincipal;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class LaFortaleza {

    public static void main(String[] args) {
        
        MenuPrincipal vista = new MenuPrincipal();
        PrincipalController controller = new PrincipalController(vista);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
    }
    
}
