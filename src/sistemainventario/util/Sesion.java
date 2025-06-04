package sistemainventario.util;

import sistemainventario.dto.UsuarioDTO;

public class Sesion {
    private static UsuarioDTO usuarioActual;

    public static void setUsuario(UsuarioDTO usuario) {
        usuarioActual = usuario;
    }

    public static UsuarioDTO getUsuario() {
        return usuarioActual;
    }

    public static void cerrarSesion() {
        usuarioActual = null;
    }

    public static boolean estaLogueado() {
        return usuarioActual != null;
    }
}
