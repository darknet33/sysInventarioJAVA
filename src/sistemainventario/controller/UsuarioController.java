package sistemainventario.controller;

import java.util.List;
import javax.swing.JOptionPane;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.services.UsuarioService;
import sistemainventario.util.Mensajes;


public class UsuarioController {

    private final UsuarioService usuarioService;


    public UsuarioController() {
        this.usuarioService = new UsuarioService();
    }

    public void mostrarUsuarios() {
        List<UsuarioDTO> usuarios = usuarioService.listarTodos();
        
        usuarios.forEach(u->{System.out.println("Usuario: " + u.getUsername() + " - Rol: " + u.getRol());});
                
    }
    
    public void eliminarUsuario(int id){        
        if (Mensajes.confirmar("Seguro que desea eliminar el Usuario")==0){
            usuarioService.eliminar(id);
            
            Mensajes.info("Se elimino correctamente el usuario");
        }
    }
    
    public void cambiarEstado(int id){
        usuarioService.cambiarEstado(id);
        
        Mensajes.info("Se cambio el estado");
    }
    
}