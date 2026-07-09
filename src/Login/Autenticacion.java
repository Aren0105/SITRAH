
package Login;


public class Autenticacion {
    
    //el static indica que pertenece a la clase y no a un 
    //objeto por eso en el jframe se puede llamar como
    //Autenticacion.validar
    public static boolean validar(String usuario, String contraseña) {
        return usuario.equals("admin") &&
               contraseña.equals("12345678");
    }
}
