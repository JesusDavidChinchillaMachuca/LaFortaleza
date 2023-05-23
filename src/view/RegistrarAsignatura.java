/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Daniel
 */
public class RegistrarAsignatura extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public RegistrarAsignatura() {
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
        panelRegistrarAsignatura = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtCreditos = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblCreditos = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblCodPrigrama = new javax.swing.JLabel();
        txtCodPrograma = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidad La Fortaleza");
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(600, 450));

        bg.setBackground(new java.awt.Color(51, 51, 51));

        panelRegistrarAsignatura.setBackground(new java.awt.Color(51, 51, 51));
        panelRegistrarAsignatura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Asignatura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panelRegistrarAsignatura.setForeground(new java.awt.Color(255, 255, 255));

        lblNombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        lblCodigo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Codigo:");

        txtCodigo.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));

        txtCreditos.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtCreditos.setForeground(new java.awt.Color(0, 0, 0));

        btnAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregar.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabla.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Créditos", "Programa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        lblCreditos.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCreditos.setForeground(new java.awt.Color(255, 255, 255));
        lblCreditos.setText("Créditos");

        btnInicio.setBackground(new java.awt.Color(204, 204, 204));
        btnInicio.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setText("Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblCodPrigrama.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCodPrigrama.setForeground(new java.awt.Color(255, 255, 255));
        lblCodPrigrama.setText("Codigo de programa");

        txtCodPrograma.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtCodPrograma.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelRegistrarAsignaturaLayout = new javax.swing.GroupLayout(panelRegistrarAsignatura);
        panelRegistrarAsignatura.setLayout(panelRegistrarAsignaturaLayout);
        panelRegistrarAsignaturaLayout.setHorizontalGroup(
            panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarAsignaturaLayout.createSequentialGroup()
                .addGroup(panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRegistrarAsignaturaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegistrarAsignaturaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistrarAsignaturaLayout.createSequentialGroup()
                                .addGroup(panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblCreditos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRegistrarAsignaturaLayout.createSequentialGroup()
                                        .addGroup(panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtCreditos)))
                            .addGroup(panelRegistrarAsignaturaLayout.createSequentialGroup()
                                .addComponent(lblCodPrigrama)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodPrograma)))
                        .addGap(157, 157, 157)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(panelRegistrarAsignaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarAsignaturaLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarAsignaturaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelRegistrarAsignaturaLayout.setVerticalGroup(
            panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarAsignaturaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreditos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegistrarAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodPrigrama)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegistrarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegistrarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCodPrigrama;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblNombre;
    public javax.swing.JPanel panelRegistrarAsignatura;
    public javax.swing.JTable tabla;
    public javax.swing.JTextField txtCodPrograma;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtCreditos;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
