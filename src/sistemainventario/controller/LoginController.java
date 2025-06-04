package sistemainventario.controller;

import sistemainventario.dto.UsuarioDTO;
import sistemainventario.services.UsuarioService;
import sistemainventario.util.Mensajes;
import sistemainventario.util.Sesion;
import sistemainventario.views.LoginView;
import sistemainventario.views.MainView;

public class LoginController {
    private final LoginView loginView;
    private final UsuarioService usuarioService;

    public LoginController(LoginView LoginView) {
        this.usuarioService = new UsuarioService();
        this.loginView = LoginView;
    }

    public void hacerLogin(String username, String password) {
        try {
            UsuarioDTO dto = usuarioService.login(username, password);
            Sesion.setUsuario(dto);
            new MainView().setVisible(true);
            loginView.dispose();
        } catch (IllegalArgumentException e) {
            Mensajes.errorValidaciones(e);
        }
    }
}
