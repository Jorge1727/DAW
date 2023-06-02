import java.util.ArrayList;
import java.util.List;

import modelos.Usuario;
import utiles.UtilWS;

public class App {
    public static void main(String[] args) throws Exception {

        List<Usuario> listausuarios = UtilWS.leeUsuariosFromWS();
        Usuario usuario3 = UtilWS.leeUsuarioFromWS(3);
        
        System.out.println(listausuarios);
        System.out.println("*************************");
        System.out.println(usuario3);

    }
}
