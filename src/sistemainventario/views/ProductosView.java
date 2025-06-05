package sistemainventario.views;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

import sistemainventario.controller.CategoriaController;
import sistemainventario.controller.ProductoController;
import sistemainventario.dto.CategoriaDTO;
import sistemainventario.dto.ProductoDTO;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.model.Categoria;
import sistemainventario.util.Sesion;

public final class ProductosView extends javax.swing.JFrame {
    private final CategoriaController categoriaController;
    private final ProductoController productoController;
    private ProductoDTO productoDTO=null;
    private List<CategoriaDTO> categorias;
    private List<ProductoDTO> productos;
    
    public ProductosView() {
        this.categoriaController=new CategoriaController();
        this.productoController=new ProductoController();
        this.productos=productoController.listarProductos();
        this.categorias = categoriaController.listarCategoria();
        
        initComponents();        
        cargaDatos();
        cargarCategorias();
        cargarProductos(productos);
        //Codigo para el ver el Enter y el Escape
        getRootPane().setDefaultButton(null);
        
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
        btnCategoria = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        btnItem = new javax.swing.JLabel();
        jpHeader = new javax.swing.JPanel();
        lblUserImg = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jpContainer = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jpDatos = new javax.swing.JPanel();
        jpActionSave = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jpAction = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        btnRefreshCategoria = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblStockInicial1 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblProcedencia = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtProcedencia = new javax.swing.JTextField();
        cboCategoria = new javax.swing.JComboBox<>();
        txtPeso = new javax.swing.JTextField();
        txtStockInicial = new javax.swing.JTextField();
        txtStockMinimo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblStockMinimo = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        chkEstado = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblCodigo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpBG.setBackground(new java.awt.Color(255, 255, 255));

        jpMenu.setBackground(new java.awt.Color(51, 153, 255));

        btnProductos.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/productos.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setIconTextGap(50);

        btnCategoria.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Categorias.png"))); // NOI18N
        btnCategoria.setText("Categoria");
        btnCategoria.setToolTipText("");
        btnCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategoria.setIconTextGap(50);
        btnCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoriaMouseClicked(evt);
            }
        });

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

        btnItem.setBackground(new java.awt.Color(0, 52, 134));
        btnItem.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnItem.setForeground(new java.awt.Color(255, 255, 255));
        btnItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Items.png"))); // NOI18N
        btnItem.setText("Items");
        btnItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnItem.setIconTextGap(50);
        btnItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 448, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/newProducto.png"))); // NOI18N
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setIconTextGap(50);
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        tblProducto.setBackground(new java.awt.Color(255, 255, 255));
        tblProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblProducto.setForeground(new java.awt.Color(51, 51, 51));
        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProducto.setGridColor(new java.awt.Color(255, 255, 255));
        tblProducto.setRowHeight(20);
        tblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tblProducto);

        jpDatos.setOpaque(false);
        jpDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGroup(jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpActionSaveLayout.setVerticalGroup(
            jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActionSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpDatos.add(jpActionSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

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
                .addGroup(jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(16, 16, 16))
        );
        jpActionLayout.setVerticalGroup(
            jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActionLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap())
        );

        jpDatos.add(jpAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 120, 70));

        btnRefreshCategoria.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshCategoria.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnRefreshCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/Reload.png"))); // NOI18N
        btnRefreshCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshCategoria.setIconTextGap(50);
        btnRefreshCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshCategoriaMouseClicked(evt);
            }
        });
        jpDatos.add(btnRefreshCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        lblMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(0, 153, 255));
        lblMarca.setText("Marca");
        jpDatos.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        lblStockInicial1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblStockInicial1.setForeground(new java.awt.Color(0, 153, 255));
        lblStockInicial1.setText("Stock Inicial (Unid.)");
        jpDatos.add(lblStockInicial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 153, 255));
        lblDescripcion.setText("Descripcion");
        jpDatos.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        lblProcedencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProcedencia.setForeground(new java.awt.Color(0, 153, 255));
        lblProcedencia.setText("Procedencia");
        jpDatos.add(lblProcedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, 34));

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 153, 255));
        lblCategoria.setText("Categoria");
        jpDatos.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        txtProcedencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtProcedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 260, 34));

        cboCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cboCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jpDatos.add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 260, 34));

        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 166, 34));

        txtStockInicial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtStockInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 166, 34));

        txtStockMinimo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtStockMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 166, 34));

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 153, 255));
        lblCodigo.setText("Codigo");
        jpDatos.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 166, 34));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 440, 34));

        lblStockMinimo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblStockMinimo.setForeground(new java.awt.Color(0, 153, 255));
        lblStockMinimo.setText("Stock Minimo (Unid.)");
        jpDatos.add(lblStockMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        lblPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(0, 153, 255));
        lblPeso.setText("Peso (Kg)");
        jpDatos.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        chkEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkEstado.setText("Estado");
        jpDatos.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 110, 30));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemainventario/resources/images/newProducto.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setIconTextGap(50);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblCodigo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(0, 153, 255));
        lblCodigo1.setText("Buscar");

        javax.swing.GroupLayout jpContainerLayout = new javax.swing.GroupLayout(jpContainer);
        jpContainer.setLayout(jpContainerLayout);
        jpContainerLayout.setHorizontalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContainerLayout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(95, 95, 95)
                        .addComponent(lblCodigo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jpDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)))
            .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpContainerLayout.setVerticalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(btnBuscar)
                    .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodigo1)))
                .addGap(231, 231, 231)
                .addComponent(jpDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpContainerLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addGap(366, 366, 366)))
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
            .addGroup(jpBGLayout.createSequentialGroup()
                .addGroup(jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBGLayout.createSequentialGroup()
                        .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jpBG, javax.swing.GroupLayout.PREFERRED_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        regresar();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriaMouseClicked
        this.dispose();
        new CategoriasView().setVisible(true);
    }//GEN-LAST:event_btnCategoriaMouseClicked
    
    private void btnItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItemMouseClicked
        txtBuscar.setText("");
        
        productos=productoController.listarProductos();
        cargarProductos(productos);
        vista(false);
        productoDTO=null;
    }//GEN-LAST:event_btnItemMouseClicked

    private void tblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoMouseClicked
        int fila=tblProducto.getSelectedRow();
        int id=(Integer) tblProducto.getValueAt(fila, 0);
        productoDTO=productoController.obtenerProducto(id);
        vistaEditDel(true);
        cargaDTO();
    }//GEN-LAST:event_tblProductoMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        CategoriaDTO categoria = buscarCategoria(cboCategoria.getSelectedItem().toString());
        
        if (productoDTO==null){
            productoDTO =new ProductoDTO();
            productoDTO.setCodigo(txtCodigo.getText());    
            productoDTO.setCategoria(categoria);
            productoDTO.setDescripcion(txtDescripcion.getText());
            productoDTO.setPeso(txtPeso.getText());
            productoDTO.setProcedencia(txtProcedencia.getText());
            productoDTO.setMarca(txtMarca.getText());
            productoDTO.setStockInicial(Integer.parseInt(txtStockInicial.getText()));
            productoDTO.setStockActual(Integer.parseInt(txtStockInicial.getText()));
            productoDTO.setStockMinimo(Integer.parseInt(txtStockMinimo.getText()));
                                   
            if (chkEstado.isSelected()){
                productoDTO.setEstado("Habilitado");
            }else{
                productoDTO.setEstado("Desabilitado");
            }
            
            productoDTO.setUsuario(Sesion.getUsuario());
            
            this.productos=productoController.listarProductos();
            if (productoController.nuevaProducto(productoDTO)){
                this.productos=productoController.listarProductos();
                cargarProductos(productos);
            }
        }else{
            productoDTO.setCodigo(txtCodigo.getText());
            productoDTO.setCategoria(categoria);
            productoDTO.setDescripcion(txtDescripcion.getText());
            productoDTO.setPeso(txtPeso.getText());
            productoDTO.setProcedencia(txtProcedencia.getText());
            productoDTO.setMarca(txtMarca.getText());
            productoDTO.setStockInicial(Integer.parseInt(txtStockInicial.getText()));
            productoDTO.setStockMinimo(Integer.parseInt(txtStockMinimo.getText()));
            
            if (chkEstado.isSelected()){
                productoDTO.setEstado("Habilitado");
            }else{
                productoDTO.setEstado("Desabilitado");
            }
            
            productoDTO.setUsuario(Sesion.getUsuario());
            
            
            if (productoController.actulizarProducto(productoDTO)){
                this.productos=productoController.listarProductos();
                cargarProductos(productos);
            }
        }
        
        tblProducto.clearSelection();
        productoDTO=null;

    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        if(productoDTO==null){
            vista(false);
            tblProducto.clearSelection();
        }else{
            cargaDTO();
            vistaEditDel(true);
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        vistaGuardar(true);
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (productoController.eliminarProducto(productoDTO.getId())){
            this.productos=productoController.listarProductos();
            cargarProductos(this.productos);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        vistaGuardar(true);
        limpiar();
        productoDTO=null;
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnRefreshCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshCategoriaMouseClicked
        categorias=categoriaController.listarCategoria();
        cargarCategorias();
        cboCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_btnRefreshCategoriaMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        cargarProductos(buscarProducto(txtBuscar.getText()));
    }//GEN-LAST:event_btnBuscarMouseClicked

    public void cargaDatos() {
        UsuarioDTO u = Sesion.getUsuario();

        lblNombreCompleto.setText(u.getNombres() + " " + u.getApellidos());
        lblRol.setText(u.getRol().getNombre());
        lblTitulo.setText("Productos");
    } 
    
    public void cargarCategorias(){
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        categorias.forEach(c -> modelo.addElement(c.getNombre()));        
        cboCategoria.setModel(modelo);
    }
    
    private void cargarProductos(List<ProductoDTO> listaProductos) {
        String[] columnas = {"ID", "Codigo","Categoria","Descripcion","Marca","Minimo","Estado"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Todas las celdas no editables
            }
        };

        listaProductos.stream()
                 .map(p -> new Object[]{p.getId(), p.getCodigo(), p.getCategoria().getNombre()
                                        , p.getDescripcion(), p.getMarca(), p.getStockMinimo(), p.getEstado()})
                 .forEach(modelo::addRow);

        tblProducto.setModel(modelo);
        vista(false);
    }
       
    private void limpiar(){
        txtCodigo.setText("");        
        cboCategoria.setSelectedItem(0);
        txtDescripcion.setText("");
        txtMarca.setText("");
        txtProcedencia.setText("");
        txtPeso.setText("");
        txtStockInicial.setText("");
        txtStockMinimo.setText("");
                
        productoDTO=null;
        tblProducto.clearSelection();
        
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
        txtCodigo.setText(productoDTO.getCodigo());
        cboCategoria.setSelectedItem(productoDTO.getCategoria().getNombre());
        txtDescripcion.setText(productoDTO.getDescripcion());
        txtMarca.setText(productoDTO.getMarca());
        txtProcedencia.setText(productoDTO.getProcedencia());
        txtPeso.setText(productoDTO.getPeso());
        txtStockInicial.setText(""+productoDTO.getStockInicial());
        txtStockMinimo.setText(""+productoDTO.getStockMinimo());
        chkEstado.setSelected(productoDTO.getEstado().equals("Habilitado"));
    }
    
    private void cEditable(Boolean value){
        txtCodigo.setEditable(value);
        cboCategoria.setEnabled(value);
        txtDescripcion.setEditable(value);
        txtMarca.setEditable(value);
        txtProcedencia.setEditable(value);
        txtPeso.setEditable(value);
        txtStockInicial.setEditable(value);
        txtStockMinimo.setEditable(value);
        chkEstado.setEnabled(value);
    }
    
    public void regresar(){
        this.dispose();
        new MainView().setVisible(true);
    }
    
    public CategoriaDTO buscarCategoria(String Nombre){
        return categorias.stream()
        .filter(c -> c.getNombre().equalsIgnoreCase(Nombre))
        .findFirst()
        .orElse(null);
    }
    
    private List<ProductoDTO> buscarProducto(String valorBuscardo){
        List<ProductoDTO> productosFiltrado;
        if(valorBuscardo.equals("")){
            return productos;                        
        }else{
            productosFiltrado=this.productos.stream()
                            .filter(p -> p.toString().toLowerCase().contains(valorBuscardo.toLowerCase()))
                            .collect(Collectors.toList());
            return productosFiltrado;
        }
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnCategoria;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnItem;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JLabel btnProductos;
    private javax.swing.JLabel btnRefreshCategoria;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel jpAction;
    private javax.swing.JPanel jpActionSave;
    private javax.swing.JPanel jpBG;
    private javax.swing.JPanel jpContainer;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblProcedencia;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblStockInicial1;
    private javax.swing.JLabel lblStockMinimo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUserImg;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtProcedencia;
    private javax.swing.JTextField txtStockInicial;
    private javax.swing.JTextField txtStockMinimo;
    // End of variables declaration//GEN-END:variables
}
