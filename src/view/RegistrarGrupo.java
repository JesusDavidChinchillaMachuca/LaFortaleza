/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Daniel
 */
public class RegistrarGrupo extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarGrupo
     */
    public RegistrarGrupo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelRegistrarEstudiante = new javax.swing.JPanel();
        panelRegistrarEstudiante1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(51, 51, 51));

        panelRegistrarEstudiante.setBackground(new java.awt.Color(51, 51, 51));
        panelRegistrarEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Grupo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panelRegistrarEstudiante.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRegistrarEstudianteLayout = new javax.swing.GroupLayout(panelRegistrarEstudiante);
        panelRegistrarEstudiante.setLayout(panelRegistrarEstudianteLayout);
        panelRegistrarEstudianteLayout.setHorizontalGroup(
            panelRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        panelRegistrarEstudianteLayout.setVerticalGroup(
            panelRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        panelRegistrarEstudiante1.setBackground(new java.awt.Color(51, 51, 51));
        panelRegistrarEstudiante1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Horario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panelRegistrarEstudiante1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRegistrarEstudiante1Layout = new javax.swing.GroupLayout(panelRegistrarEstudiante1);
        panelRegistrarEstudiante1.setLayout(panelRegistrarEstudiante1Layout);
        panelRegistrarEstudiante1Layout.setHorizontalGroup(
            panelRegistrarEstudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        panelRegistrarEstudiante1Layout.setVerticalGroup(
            panelRegistrarEstudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRegistrarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRegistrarEstudiante1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRegistrarEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel bg;
    public javax.swing.JPanel panelRegistrarEstudiante;
    public javax.swing.JPanel panelRegistrarEstudiante1;
    // End of variables declaration//GEN-END:variables
}
