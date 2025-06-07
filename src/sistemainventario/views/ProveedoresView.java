package sistemainventario.views;

import java.awt.event.ActionEvent;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import sistemainventario.dto.ProveedorDTO;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.controller.ProveedorController;
import sistemainventario.util.Sesion;

public final class ProveedoresView extends javax.swing.JFrame {
    private final ProveedorController proveedorController;
    private final List<ProveedorDTO> proveedores;
    private ProveedorDTO proveedorDTO;
    
    public ProveedoresView() {
        this.proveedorController=new ProveedorController();
        this.proveedores=proveedorController.listarProveedors();
        
        initComponents();
        cargaDatos();
        
        //Codigo para el ver el Enter y el Escape
        getRootPane().setDefaultButton(btnBuscar);
        
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
            .put(KeyStroke.getKeyStroke("ESCAPE"), "cerrar");

        getRootPane().getActionMap().put("cerrar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regresar(); 
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBG = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JLabel();
        btnEntradas = new javax.swing.JLabel();
        btnCompras = new javax.swing.JLabel();
        btnProveedor = new javax.swing.JLabel();
        btnPagos = new javax.swing.JLabel();
        jpHeader3 = new javax.swing.JPanel();
        lblUserImg = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        jpContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        btnNuevo = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jpActionSave = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jpAction = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        lblNit = new javax.swing.JLabel();
        txtMateriales = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        chkEstado = new javax.swing.JCheckBox();
        txtContacto = new javax.swing.JTextField();
        lblContacto = new javax.swing.JLabel();
        lblMateriales = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpBG.setBackground(new java.awt.Color(255, 255, 255));

        jpMenu.setBackground(new java.awt.Color(51, 153, 255));

        btnRegresar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Retroceder.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setIconTextGap(50);
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        btnEntradas.setBackground(new java.awt.Color(0, 102, 204));
        btnEntradas.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnEntradas.setForeground(new java.awt.Color(255, 255, 255));
        btnEntradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/entradas.png"))); // NOI18N
        btnEntradas.setText("Entradas");
        btnEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntradas.setIconTextGap(50);

        btnCompras.setBackground(new java.awt.Color(0, 102, 204));
        btnCompras.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnCompras.setForeground(new java.awt.Color(255, 255, 255));
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Compras.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setToolTipText("");
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.setIconTextGap(50);
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasMouseClicked(evt);
            }
        });

        btnProveedor.setBackground(new java.awt.Color(0, 102, 204));
        btnProveedor.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/proveedores.png"))); // NOI18N
        btnProveedor.setText("Proveedores");
        btnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedor.setIconTextGap(50);
        btnProveedor.setOpaque(true);

        btnPagos.setBackground(new java.awt.Color(0, 102, 204));
        btnPagos.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnPagos.setForeground(new java.awt.Color(255, 255, 255));
        btnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Pagos.png"))); // NOI18N
        btnPagos.setText("Pagos");
        btnPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagos.setIconTextGap(50);

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(btnPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jpHeader3.setBackground(new java.awt.Color(255, 255, 255));
        jpHeader3.setForeground(new java.awt.Color(255, 255, 255));

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

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/btnCerrar24.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/btnMinimizar24.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpHeader3Layout = new javax.swing.GroupLayout(jpHeader3);
        jpHeader3.setLayout(jpHeader3Layout);
        jpHeader3Layout.setHorizontalGroup(
            jpHeader3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeader3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHeader3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeader3Layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(jpHeader3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUserImg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeader3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpHeader3Layout.setVerticalGroup(
            jpHeader3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeader3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHeader3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpHeader3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserImg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpHeader3Layout.createSequentialGroup()
                        .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpContainer.setBackground(new java.awt.Color(255, 255, 255));
        jpContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProveedor.setBackground(new java.awt.Color(255, 255, 255));
        tblProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblProveedor.setForeground(new java.awt.Color(51, 51, 51));
        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProveedor.setGridColor(new java.awt.Color(255, 255, 255));
        tblProveedor.setRowHeight(20);
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedor);

        jpContainer.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 48, 440, 583));

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/newProveedor.png"))); // NOI18N
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setIconTextGap(50);
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        jpContainer.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 12, -1, -1));

        jpDatos.setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jpActionSave.setOpaque(false);

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setIconTextGap(1);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setIconTextGap(1);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpActionSaveLayout = new javax.swing.GroupLayout(jpActionSave);
        jpActionSave.setLayout(jpActionSaveLayout);
        jpActionSaveLayout.setHorizontalGroup(
            jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActionSaveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(62, 62, 62))
        );
        jpActionSaveLayout.setVerticalGroup(
            jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActionSaveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar))
        );

        jpAction.setOpaque(false);

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Editar.png"))); // NOI18N
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setIconTextGap(50);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Eliminar.png"))); // NOI18N
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setIconTextGap(50);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpActionLayout = new javax.swing.GroupLayout(jpAction);
        jpAction.setLayout(jpActionLayout);
        jpActionLayout.setHorizontalGroup(
            jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addGap(54, 54, 54))
        );
        jpActionLayout.setVerticalGroup(
            jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActionLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        lblNit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNit.setForeground(new java.awt.Color(0, 153, 255));
        lblNit.setText("NIT:");

        txtMateriales.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 153, 255));
        lblEmail.setText("Email");

        lblCelular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(0, 153, 255));
        lblCelular.setText("Celular");

        txtCelular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        chkEstado.setBackground(new java.awt.Color(255, 255, 255));
        chkEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkEstado.setText("Estado");

        txtContacto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblContacto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContacto.setForeground(new java.awt.Color(0, 153, 255));
        lblContacto.setText("Contacto:");

        lblMateriales.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMateriales.setForeground(new java.awt.Color(0, 153, 255));
        lblMateriales.setText("Materiales:");

        txtNit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpActionSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContacto)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(lblCelular)
                    .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNit)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre)
                            .addComponent(lblMateriales)
                            .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpDatosLayout.createSequentialGroup()
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(chkEstado)
                            .addGap(3, 3, 3))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMateriales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpActionSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpContainer.add(jpDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 48, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setOpaque(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jpContainer.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpContainer.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 230, -1));

        javax.swing.GroupLayout jpBGLayout = new javax.swing.GroupLayout(jpBG);
        jpBG.setLayout(jpBGLayout);
        jpBGLayout.setHorizontalGroup(
            jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBGLayout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpHeader3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpBGLayout.setVerticalGroup(
            jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBGLayout.createSequentialGroup()
                .addComponent(jpHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        this.dispose();
        new MainView().setVisible(true);
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        vistaGuardar(true);
        limpiar();        
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if (proveedorDTO==null){
            proveedorDTO=new ProveedorDTO();
            proveedorDTO.setNombre(txtNombre.getText());
            proveedorDTO.setNit(txtNit.getText());
            proveedorDTO.setMateriales(txtMateriales.getText());
            proveedorDTO.setContacto(txtContacto.getText());
            proveedorDTO.setCelular(txtCelular.getText());
            proveedorDTO.setEmail(txtEmail.getText());
            proveedorDTO.setEstado(chkEstado.isSelected());
            
            if (proveedorController.nuevoProveedor(proveedorDTO)){cargarProveedores(proveedores);}            
        }else{
            proveedorDTO.setNombre(txtNombre.getText());
            proveedorDTO.setNit(txtNit.getText());
            proveedorDTO.setMateriales(txtMateriales.getText());
            proveedorDTO.setContacto(txtContacto.getText());
            proveedorDTO.setCelular(txtCelular.getText());
            proveedorDTO.setEmail(txtEmail.getText());
            proveedorDTO.setEstado(chkEstado.isSelected());
            if (proveedorController.actualizarProveedor(proveedorDTO)){
                cargarProveedores(proveedores);
            }
        }
        tblProveedor.clearSelection();
        proveedorDTO=null;
                
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        if(proveedorDTO==null){
            vista(false);
            tblProveedor.clearSelection();
        }else{
            cargaDTO();
            vistaEditDel(true);            
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
        int fila=tblProveedor.getSelectedRow();
        int id=(Integer) tblProveedor.getValueAt(fila, 0);
        proveedorDTO=proveedorController.obtenerProveedor(id);
        vistaEditDel(true);
        cargaDTO();
    }//GEN-LAST:event_tblProveedorMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        vistaGuardar(true);
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (proveedorController.eliminarProveedor(proveedorDTO.getId())){
            cargarProveedores(proveedores);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valorBuscado=txtBuscar.getText();
        cargarProveedores(buscarClientes(valorBuscado));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
        this.dispose();
        new EntradasView().setVisible(true);
    }//GEN-LAST:event_btnComprasMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        minimizar();
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        regresar();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void cargaDatos(){
        UsuarioDTO u=Sesion.getUsuario();
        
        lblNombreCompleto.setText(u.getNombres()+ " " +u.getApellidos());
        lblRol.setText(u.getRol().getNombre());
        lblTitulo.setText("Proveedores");
        
        cargarProveedores(proveedores);
    }
    
    private void cargarProveedores(List<ProveedorDTO> listaProveedores) {
        String[] columnas = {"ID", "Nombre","Materiales"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Todas las celdas no editables
            }
        };

        listaProveedores.stream()
                 .map(p -> new Object[]{p.getId(), p.getNombre(),p.getMateriales()})
                 .forEach(modelo::addRow);

        tblProveedor.setModel(modelo);
        vista(false);
    }
    
    private void limpiar(){
        txtNombre.setText("");
        txtNit.setText("");
        txtMateriales.setText("");
        txtContacto.setText("");
        txtEmail.setText("");
        txtCelular.setText("");
        chkEstado.setSelected(false);
        
        proveedorDTO=null;
        tblProveedor.clearSelection();
        
    }
    
    private void vista(Boolean bool){
        jpDatos.setVisible(bool);
        jpAction.setVisible(bool);
        jpActionSave.setVisible(bool);
    }
    
    private void vistaGuardar(Boolean bool){
        jpDatos.setVisible(bool);
        jpAction.setVisible(!bool);
        jpActionSave.setVisible(bool);
        cEditable(true);
    }
    
    private void vistaEditDel(Boolean bool){
        jpDatos.setVisible(bool);
        jpAction.setVisible(bool);
        jpActionSave.setVisible(!bool);
        cEditable(false);
    }
    
    private void cargaDTO(){
        txtNombre.setText(proveedorDTO.getNombre());
        txtNit.setText(proveedorDTO.getNit());
        txtMateriales.setText(proveedorDTO.getMateriales());
        txtContacto.setText(proveedorDTO.getContacto());
        txtCelular.setText(proveedorDTO.getCelular());
        txtEmail.setText(proveedorDTO.getEmail());
        chkEstado.setSelected(proveedorDTO.getEstado());
    }
    
    private void cEditable(Boolean value){
        txtNombre.setEditable(value);
        txtNit.setEditable(value);
        txtMateriales.setEditable(value);
        txtContacto.setEditable(value);
        txtCelular.setEditable(value);
        txtEmail.setEditable(value);
        chkEstado.setEnabled(value);
    }
    
    public void regresar(){
        this.dispose();
        new MainView().setVisible(true);
    }
    
    public void minimizar(){
        this.setState(sistemainventario.views.ProveedoresView.ICONIFIED);
    }
    
    private List<ProveedorDTO> buscarClientes(String valorBuscado){
        if (valorBuscado == null || valorBuscado.isEmpty()) {
            return proveedores;
        }
        
        return this.proveedores.stream()
                        .filter(p -> p.toString().toLowerCase().contains(valorBuscado.toLowerCase()))
                        .collect(Collectors.toList());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnCompras;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnEntradas;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JLabel btnPagos;
    private javax.swing.JLabel btnProveedor;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAction;
    private javax.swing.JPanel jpActionSave;
    private javax.swing.JPanel jpBG;
    private javax.swing.JPanel jpContainer;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpHeader3;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMateriales;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUserImg;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMateriales;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
