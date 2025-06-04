package sistemainventario.views;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.util.Sesion;

public final class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        cargaDatos();
        
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
            .put(KeyStroke.getKeyStroke("ESCAPE"), "cerrar");

        getRootPane().getActionMap().put("cerrar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salir(); 
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBG = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JLabel();
        btnReportes = new javax.swing.JLabel();
        btnEntradas = new javax.swing.JLabel();
        btnSalidas = new javax.swing.JLabel();
        btnSetup = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();
        btnInicio = new javax.swing.JLabel();
        jpHeader = new javax.swing.JPanel();
        lblUserImg = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jpContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpBG.setBackground(new java.awt.Color(255, 255, 255));

        jpMenu.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/menu.png"))); // NOI18N
        jLabel1.setText("Menu");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setIconTextGap(50);

        btnProductos.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/productos.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setIconTextGap(50);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });

        btnReportes.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/reporte.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setIconTextGap(50);

        btnEntradas.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnEntradas.setForeground(new java.awt.Color(255, 255, 255));
        btnEntradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/entradas.png"))); // NOI18N
        btnEntradas.setText("Entradas");
        btnEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntradas.setIconTextGap(50);
        btnEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntradasMouseClicked(evt);
            }
        });

        btnSalidas.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnSalidas.setForeground(new java.awt.Color(255, 255, 255));
        btnSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/salidas.png"))); // NOI18N
        btnSalidas.setText("Salidas");
        btnSalidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalidas.setIconTextGap(50);

        btnSetup.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnSetup.setForeground(new java.awt.Color(255, 255, 255));
        btnSetup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/setup.png"))); // NOI18N
        btnSetup.setText("Setup");
        btnSetup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetup.setIconTextGap(50);

        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/loguot.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setIconTextGap(50);
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(0, 52, 134));
        btnInicio.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/inicio.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setIconTextGap(50);

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSetup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReportes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntradas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSetup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jpHeader.setBackground(new java.awt.Color(255, 255, 255));
        jpHeader.setForeground(new java.awt.Color(255, 255, 255));

        lblUserImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/user.png"))); // NOI18N

        lblNombreCompleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCompleto.setForeground(new java.awt.Color(85, 96, 128));
        lblNombreCompleto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblRol.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRol.setForeground(new java.awt.Color(85, 96, 128));
        lblRol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 153, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("Titulo");

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserImg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserImg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jpContainer.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpContainerLayout = new javax.swing.GroupLayout(jpContainer);
        jpContainer.setLayout(jpContainerLayout);
        jpContainerLayout.setHorizontalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpContainerLayout.setVerticalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBGLayout = new javax.swing.GroupLayout(jpBG);
        jpBG.setLayout(jpBGLayout);
        jpBGLayout.setHorizontalGroup(
            jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBGLayout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpBGLayout.setVerticalGroup(
            jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBGLayout.createSequentialGroup()
                .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        this.dispose();
        new ProductosView().setVisible(true);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        Sesion.cerrarSesion();
        salir();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnEntradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradasMouseClicked
        this.dispose();
        new EntradasView().setVisible(true);
    }//GEN-LAST:event_btnEntradasMouseClicked

    public void cargaDatos(){
        UsuarioDTO u=Sesion.getUsuario();
        
        lblNombreCompleto.setText(u.getNombres()+ " " +u.getApellidos());
        lblRol.setText(u.getRol().getNombre());
        lblTitulo.setText("Inicio");
        
        u.getRol().getPermisos().forEach(p -> System.out.println(p.getModulo()));
    }
    
    public void salir(){
        this.dispose();
        new LoginView().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnEntradas;
    private javax.swing.JLabel btnInicio;
    private javax.swing.JLabel btnProductos;
    private javax.swing.JLabel btnReportes;
    private javax.swing.JLabel btnSalidas;
    private javax.swing.JLabel btnSetup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpBG;
    private javax.swing.JPanel jpContainer;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUserImg;
    // End of variables declaration//GEN-END:variables
}
