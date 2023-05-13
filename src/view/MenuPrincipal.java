/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Daniel
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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
        panelLaFortaleza = new javax.swing.JPanel();
        txtBienvenida = new javax.swing.JTextPane();
        btnRegistrarEstudiante = new javax.swing.JButton();
        btnRegistrarAsignatura = new javax.swing.JButton();
        btnRegistrarProfesor = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidad La Fortaleza");
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

        bg.setBackground(new java.awt.Color(51, 51, 51));

        panelLaFortaleza.setBackground(new java.awt.Color(51, 51, 51));
        panelLaFortaleza.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Universidad La Fortaleza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panelLaFortaleza.setForeground(new java.awt.Color(255, 255, 255));

        txtBienvenida.setEditable(false);
        txtBienvenida.setBackground(new java.awt.Color(51, 51, 51));
        txtBienvenida.setBorder(null);
        txtBienvenida.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        txtBienvenida.setText("Bienvenido al sistema de registro de informacion de la Universidad la Fortaleza");

        btnRegistrarEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarEstudiante.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        btnRegistrarEstudiante.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarEstudiante.setText("Registrar Estudiante");
        btnRegistrarEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRegistrarAsignatura.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarAsignatura.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        btnRegistrarAsignatura.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarAsignatura.setText("Registrar Asignatura");
        btnRegistrarAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRegistrarProfesor.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarProfesor.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        btnRegistrarProfesor.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarProfesor.setText("Registrar Profesor");
        btnRegistrarProfesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnReporte.setBackground(new java.awt.Color(204, 204, 204));
        btnReporte.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte.setText("Reporte");
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelLaFortalezaLayout = new javax.swing.GroupLayout(panelLaFortaleza);
        panelLaFortaleza.setLayout(panelLaFortalezaLayout);
        panelLaFortalezaLayout.setHorizontalGroup(
            panelLaFortalezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaFortalezaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelLaFortalezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLaFortalezaLayout.createSequentialGroup()
                        .addGroup(panelLaFortalezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRegistrarProfesor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(panelLaFortalezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(44, 44, 44))
        );
        panelLaFortalezaLayout.setVerticalGroup(
            panelLaFortalezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaFortalezaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(panelLaFortalezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLaFortalezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLaFortaleza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLaFortaleza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel bg;
    public javax.swing.JButton btnRegistrarAsignatura;
    public javax.swing.JButton btnRegistrarEstudiante;
    public javax.swing.JButton btnRegistrarProfesor;
    public javax.swing.JButton btnReporte;
    public javax.swing.JPanel panelLaFortaleza;
    public javax.swing.JTextPane txtBienvenida;
    // End of variables declaration//GEN-END:variables
}