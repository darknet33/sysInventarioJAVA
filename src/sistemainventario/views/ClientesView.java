package sistemainventario.views;

import java.awt.event.ActionEvent;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import sistemainventario.dto.ClienteDTO;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.controller.ClienteController;
import sistemainventario.util.Sesion;

public final class ClientesView extends javax.swing.JFrame {
    private final ClienteController clienteController;
    private final List<ClienteDTO> clientes;
    private ClienteDTO clienteDTO;
    
    public ClientesView() {
        this.clienteController=new ClienteController();
        this.clientes=clienteController.listarClientes();
        initComponents();
        cargaDatos();
        cargarClientes(clientes);
        
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
        btnProductos = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        btnClientes = new javax.swing.JLabel();
        btnVentas = new javax.swing.JLabel();
        btnCobros = new javax.swing.JLabel();
        jpHeader = new javax.swing.JPanel();
        lblUserImg = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        jpContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
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
        lblNombre1 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        chkEstado = new javax.swing.JCheckBox();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpBG.setBackground(new java.awt.Color(255, 255, 255));

        jpMenu.setBackground(new java.awt.Color(51, 153, 255));

        btnProductos.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/salidas.png"))); // NOI18N
        btnProductos.setText("Salidas");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setIconTextGap(50);

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

        btnClientes.setBackground(new java.awt.Color(0, 102, 255));
        btnClientes.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/clientes.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setIconTextGap(50);
        btnClientes.setOpaque(true);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(0, 102, 255));
        btnVentas.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Ventas.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setToolTipText("");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setIconTextGap(50);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });

        btnCobros.setBackground(new java.awt.Color(0, 52, 134));
        btnCobros.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnCobros.setForeground(new java.awt.Color(255, 255, 255));
        btnCobros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Cobros.png"))); // NOI18N
        btnCobros.setText("Cobros");
        btnCobros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobros.setIconTextGap(50);

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCobros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCobros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/btnMinimizar24.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/btnCerrar24.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUserImg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserImg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jpContainer.setBackground(new java.awt.Color(255, 255, 255));

        tblCliente.setBackground(new java.awt.Color(255, 255, 255));
        tblCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblCliente.setForeground(new java.awt.Color(51, 51, 51));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCliente.setGridColor(new java.awt.Color(255, 255, 255));
        tblCliente.setRowHeight(20);
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/newCliente.png"))); // NOI18N
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setIconTextGap(50);
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

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

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre1.setText("NIT:");

        txtNit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtCelular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblNombre2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre2.setText("Celular:");

        lblNombre3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre3.setText("Direccion");

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        chkEstado.setBackground(new java.awt.Color(255, 255, 255));
        chkEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkEstado.setText("Estado");

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
                .addGap(22, 22, 22)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre3)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre2)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(chkEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(lblNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jpAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpActionSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setOpaque(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpContainerLayout = new javax.swing.GroupLayout(jpContainer);
        jpContainer.setLayout(jpContainerLayout);
        jpContainerLayout.setHorizontalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContainerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpContainerLayout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jpContainerLayout.setVerticalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jpBGLayout = new javax.swing.GroupLayout(jpBG);
        jpBG.setLayout(jpBGLayout);
        jpBGLayout.setHorizontalGroup(
            jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBGLayout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpBGLayout.setVerticalGroup(
            jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBGLayout.createSequentialGroup()
                .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
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

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        this.dispose();
        new MainView().setVisible(true);
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        vistaGuardar(true);
        limpiar();        
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if (clienteDTO==null){
            clienteDTO=new ClienteDTO();
            clienteDTO.setNombre(txtNombre.getText());
            clienteDTO.setNit(txtNit.getText());
            clienteDTO.setCelular(txtCelular.getText());
            clienteDTO.setDireccion(txtDireccion.getText());
            clienteDTO.setEstado(chkEstado.isSelected());
            
            if (clienteController.nuevoCliente(clienteDTO)){cargarClientes(clientes);}            
        }else{
            clienteDTO.setNombre(txtNombre.getText());
            clienteDTO.setNit(txtNit.getText());
            clienteDTO.setCelular(txtCelular.getText());
            clienteDTO.setDireccion(txtDireccion.getText());
            clienteDTO.setEstado(chkEstado.isSelected());
            if (clienteController.actualizarCliente(clienteDTO)){
                cargarClientes(clientes);
            }
        }
        tblCliente.clearSelection();
        clienteDTO=null;
                
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        if(clienteDTO==null){
            vista(false);
            tblCliente.clearSelection();
        }else{
            cargaDTO();
            vistaEditDel(true);            
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        int fila=tblCliente.getSelectedRow();
        int id=(Integer) tblCliente.getValueAt(fila, 0);
        clienteDTO=clienteController.obtenerCliente(id);
        vistaEditDel(true);
        cargaDTO();
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        vistaGuardar(true);
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (clienteController.eliminarCliente(clienteDTO.getId())){
            cargarClientes(clientes);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        this.dispose();
        new ClientesView().setVisible(true);
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        this.dispose();
        new SalidasView().setVisible(true);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valorBuscado=txtBuscar.getText();
        cargarClientes(buscarClientes(valorBuscado));
    }//GEN-LAST:event_btnBuscarActionPerformed

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
        lblTitulo.setText("Clientes");
        
    }
    
    private void cargarClientes(List<ClienteDTO> listaClientes) {
        String[] columnas = {"ID", "Nombre","Celular"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Todas las celdas no editables
            }
        };

        listaClientes.stream()
                 .map(c -> new Object[]{c.getId(), c.getNombre(),c.getCelular()})
                 .forEach(modelo::addRow);

        tblCliente.setModel(modelo);
        vista(false);
    }
    
    private void limpiar(){
        txtNombre.setText("");
        txtNit.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
        chkEstado.setSelected(false);
        
        clienteDTO=null;
        tblCliente.clearSelection();
        
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
        txtNombre.setText(clienteDTO.getNombre());
        txtNit.setText(clienteDTO.getNit());
        txtCelular.setText(clienteDTO.getCelular());
        txtDireccion.setText(clienteDTO.getDireccion());
        chkEstado.setSelected(clienteDTO.getEstado());
    }
    
    private void cEditable(Boolean value){
        txtNombre.setEditable(value);
        txtNit.setEditable(value);
        txtCelular.setEditable(value);
        txtDireccion.setEditable(value);
        chkEstado.setEnabled(value);
    }
    
    public void regresar(){
        this.dispose();
        new MainView().setVisible(true);
    }
    
    public void minimizar(){
        this.setState(sistemainventario.views.ClientesView.ICONIFIED);
    }
    
    private List<ClienteDTO> buscarClientes(String valorBuscado){
        if (valorBuscado == null || valorBuscado.isEmpty()) {
            return clientes;
        }
        
        return this.clientes.stream()
                        .filter(c -> c.toString().toLowerCase().contains(valorBuscado.toLowerCase()))
                        .collect(Collectors.toList());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnClientes;
    private javax.swing.JLabel btnCobros;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JLabel btnProductos;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel btnVentas;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAction;
    private javax.swing.JPanel jpActionSave;
    private javax.swing.JPanel jpBG;
    private javax.swing.JPanel jpContainer;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUserImg;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
