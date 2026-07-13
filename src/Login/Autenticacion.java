
package Login;


public class Autenticacion {
    
     
    //el static indica que pertenece a la clase y no a un 
    //objeto por eso en el jframe se puede llamar como
    //Autenticacion.validar
     private static Usuario[] usuarios = {
        new Usuario("admin", "12345678", "ADMIN"),
        new Usuario("usuario", "12345678", "USUARIO")
    };

    public static String validar(String usuario, String contraseña) {

        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)) {
                return u.getRol();
            }
        }

        return "";
    }
}
