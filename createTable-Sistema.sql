-- Crear tablas

CREATE TABLE roles (
  id_rol INT PRIMARY KEY AUTO_INCREMENT,
  nombre_rol VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE permisos (
  id_permiso INT PRIMARY KEY AUTO_INCREMENT,
  modulo_permiso VARCHAR(100) NOT NULL UNIQUE,
  estado_permiso TINYINT
);

CREATE TABLE rol_permiso (
  id_rol_permiso INT PRIMARY KEY AUTO_INCREMENT,
  rol_id INT,
  permiso_id INT,
  FOREIGN KEY (rol_id) REFERENCES roles (id_rol),
  FOREIGN KEY (permiso_id) REFERENCES permisos (id_permiso)
);

CREATE TABLE usuarios (
  id_usuario INT PRIMARY KEY AUTO_INCREMENT,
  username_usuario VARCHAR(50) NOT NULL UNIQUE,
  password_usuario VARCHAR(255) NOT NULL,
  nombres_usuario VARCHAR(100) NOT NULL,
  apellidos_usuario VARCHAR(100) NOT NULL,
  cargo_usuario VARCHAR(100) NOT NULL,
  rol_id INT NOT NULL,
  f_registro_usuario DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  f_actualizado_usuario DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  estado_usuario TINYINT,
  FOREIGN KEY (rol_id) REFERENCES roles (id_rol)
);

CREATE TABLE empresas (
  id_empresa INT PRIMARY KEY AUTO_INCREMENT,
  nombre_empresa VARCHAR(100) NOT NULL,
  nit_empresa VARCHAR(20) NOT NULL,
  representante_empresa VARCHAR(100) NOT NULL,
  sucursal_empresa VARCHAR(100) NOT NULL,
  telefono_empresa VARCHAR(20) NOT NULL,
  email_empresa VARCHAR(100) NOT NULL,
  tipo_empresa VARCHAR(20) NOT NULL,
  logo_empresa LONGBLOB
);

CREATE TABLE categorias (
  id_categoria INT PRIMARY KEY AUTO_INCREMENT,
  nombre_categoria VARCHAR(100) NOT NULL
);

CREATE TABLE productos (
  id_producto INT PRIMARY KEY AUTO_INCREMENT,
  codigo_producto VARCHAR(50) NOT NULL,
  categoria_id INT NOT NULL,
  descripcion_producto TEXT NOT NULL,
  marca_producto VARCHAR(50) NOT NULL,
  procedencia_producto VARCHAR(50) NOT NULL, 
  peso_producto VARCHAR(10) NOT NULL,
  stock_inicial_producto INT NOT NULL,
  stock_actual_producto INT NOT NULL,
  stock_minimo_producto INT NOT NULL,  
  f_registro_producto DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  f_actualizado_producto DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  estado_producto TINYINT,
  usuario_id INT NOT NULL,
  FOREIGN KEY (categoria_id) REFERENCES categorias (id_categoria),
  FOREIGN KEY (usuario_id) REFERENCES usuarios (id_usuario)
);

CREATE TABLE comprobantes (
  id_comprobante INT PRIMARY KEY AUTO_INCREMENT,
  nombre_comprobante VARCHAR(50) NOT NULL
);

CREATE TABLE estados (
  id_estado INT PRIMARY KEY AUTO_INCREMENT,
  nombre_estado VARCHAR(50) NOT NULL
);

CREATE TABLE transacciones (
  id_transaccion INT PRIMARY KEY AUTO_INCREMENT,
  nombre_transaccion VARCHAR(50) NOT NULL
);

CREATE TABLE proveedores (
  id_proveedor INT PRIMARY KEY AUTO_INCREMENT,
  nombre_proveedor VARCHAR(100) NOT NULL,
  nit_proveedor VARCHAR(20),
  materiales_proveedor TEXT,
  contacto_proveedor VARCHAR(100),
  celular_contacto_proveedor VARCHAR(20),
  email_contacto_proveedor VARCHAR(100),
  estado_proveedor TINYINT,
  f_registro_proveedor DATETIME
);

CREATE TABLE compras (
  id_compra INT PRIMARY KEY AUTO_INCREMENT,
  fecha_compra DATETIME NOT NULL,
  proveedor_id INT NOT NULL,
  comprobante_id INT NOT NULL,
  num_comprobante_compra VARCHAR(50),
  estado_id INT NOT NULL,
  total_compra DECIMAL(10,2),
  usuario_id INT NOT NULL,
  FOREIGN KEY (proveedor_id) REFERENCES proveedores (id_proveedor),
  FOREIGN KEY (comprobante_id) REFERENCES comprobantes (id_comprobante),
  FOREIGN KEY (estado_id) REFERENCES estados (id_estado),
  FOREIGN KEY (usuario_id) REFERENCES usuarios (id_usuario)
);

CREATE TABLE detalles_compra (
  id_detalle_compra INT PRIMARY KEY AUTO_INCREMENT,
  compra_id INT NOT NULL,
  producto_id INT NOT NULL,
  cantidad_detalle_compra INT NOT NULL,
  costo_detalle_compra DECIMAL(10,2) NOT NULL,
  FOREIGN KEY (compra_id) REFERENCES compras (id_compra),
  FOREIGN KEY (producto_id) REFERENCES productos (id_producto)
);

CREATE TABLE cuentas_por_pagar (
  id_cuenta_por_pagar INT PRIMARY KEY AUTO_INCREMENT,
  fecha_cuenta_por_pagar DATE NOT NULL,
  proveedor_id INT NOT NULL,
  saldo_inicial_cuenta_por_pagar DECIMAL(10,2) NOT NULL,
  vencimiento_cuenta_por_pagar DATE NOT NULL,
  concepto_cuenta_por_pagar TEXT,
  usuario_id INT NOT NULL,
  FOREIGN KEY (proveedor_id) REFERENCES proveedores (id_proveedor),
  FOREIGN KEY (usuario_id) REFERENCES usuarios (id_usuario)
);

CREATE TABLE egresos (
  id_egreso INT PRIMARY KEY AUTO_INCREMENT,
  concepto_egreso TEXT NOT NULL,
  fecha_egreso DATE NOT NULL,
  importe_egreso DECIMAL(10,2) NOT NULL,
  usuario_id INT NOT NULL,
  FOREIGN KEY (usuario_id) REFERENCES usuarios (id_usuario)
);

CREATE TABLE pagos (
  id_pago INT PRIMARY KEY AUTO_INCREMENT,
  cuenta_por_pagar_id INT NOT NULL,
  fecha_pago DATE NOT NULL,
  importe_pago DECIMAL(10,2) NOT NULL,
  transaccion_id INT NOT NULL,
  egreso_id INT NOT NULL,
  FOREIGN KEY (cuenta_por_pagar_id) REFERENCES cuentas_por_pagar (id_cuenta_por_pagar),
  FOREIGN KEY (egreso_id) REFERENCES egresos (id_egreso),
  FOREIGN KEY (transaccion_id) REFERENCES transacciones (id_transaccion)
);

CREATE TABLE clientes (
  id_cliente INT PRIMARY KEY AUTO_INCREMENT,
  nombre_cliente VARCHAR(100) NOT NULL,
  nit_cliente VARCHAR(20),
  celular_cliente VARCHAR(20),
  direccion_cliente TEXT,
  estado_cliente TINYINT,
  f_registro_cliente DATETIME
);

CREATE TABLE ventas (
  id_venta INT PRIMARY KEY AUTO_INCREMENT,
  fecha_venta DATETIME NOT NULL,
  cliente_id INT NOT NULL,
  comprobante_id INT NOT NULL,
  num_comprobante_venta VARCHAR(50),
  estado_id INT NOT NULL,
  total_venta DECIMAL(10,2),
  impuesto_venta DECIMAL(10,2),
  descuento_venta DECIMAL(10,2),
  usuario_id INT NOT NULL,
  FOREIGN KEY (cliente_id) REFERENCES clientes (id_cliente),
  FOREIGN KEY (comprobante_id) REFERENCES comprobantes (id_comprobante),
  FOREIGN KEY (estado_id) REFERENCES estados (id_estado),
  FOREIGN KEY (usuario_id) REFERENCES usuarios (id_usuario)
);

CREATE TABLE detalles_venta (
  id_detalle_venta INT PRIMARY KEY AUTO_INCREMENT,
  venta_id INT NOT NULL,
  producto_id INT NOT NULL,
  cantidad_detalle_venta INT NOT NULL,
  precio_detalle_venta DECIMAL(10,2) NOT NULL,
  FOREIGN KEY (venta_id) REFERENCES ventas (id_venta),
  FOREIGN KEY (producto_id) REFERENCES productos (id_producto)
);

CREATE TABLE cuentas_por_cobrar (
  id_cuenta_por_cobrar INT PRIMARY KEY AUTO_INCREMENT,
  fecha_cuenta_por_cobrar DATE NOT NULL,
  cliente_id INT NOT NULL,
  saldo_inicial_cuenta_por_cobrar DECIMAL(10,2) NOT NULL,
  vencimiento_cuenta_por_cobrar DATETIME NOT NULL,
  concepto_cuenta_por_cobrar TEXT,
  usuario_id INT NOT NULL,
  FOREIGN KEY (cliente_id) REFERENCES clientes (id_cliente),
  FOREIGN KEY (usuario_id) REFERENCES usuarios (id_usuario)
);

CREATE TABLE ingresos (
  id_ingreso INT PRIMARY KEY AUTO_INCREMENT,
  concepto_ingreso TEXT NOT NULL,
  fecha_ingreso DATE NOT NULL,
  importe_ingreso DECIMAL(10,2) NOT NULL,
  usuario_id INT NOT NULL,
  FOREIGN KEY (usuario_id) REFERENCES usuarios (id_usuario)
);

CREATE TABLE cobros (
  id_cobro INT PRIMARY KEY AUTO_INCREMENT,
  cuenta_por_cobrar_id INT NOT NULL,
  fecha_cobro DATE NOT NULL,
  importe_cobro DECIMAL(10,2) NOT NULL,
  transaccion_id INT NOT NULL,
  ingreso_id INT NOT NULL,
  FOREIGN KEY (cuenta_por_cobrar_id) REFERENCES cuentas_por_cobrar (id_cuenta_por_cobrar),
  FOREIGN KEY (ingreso_id) REFERENCES ingresos (id_ingreso)
);
 