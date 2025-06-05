package sistemainventario.controller;

import sistemainventario.dto.UsuarioDTO;
import sistemainventario.services.UsuarioService;
import sistemainventario.util.Mensajes;

public class LoginController {

    private final UsuarioService usuarioService;

    public LoginController() {
        this.usuarioService = new UsuarioService();
    }

    public UsuarioDTO realizarIngreso(String username, String password) {
        try {
            UsuarioDTO dto = usuarioService.login(username, password);
            return dto;
        } catch (IllegalArgumentException e) {
            Mensajes.errorValidaciones(e);
            return null;
        }
    }
}
