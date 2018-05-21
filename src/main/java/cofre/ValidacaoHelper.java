package cofre;

/**
 *
 * @author andreendo
 */
public class ValidacaoHelper {
    
    private ValidacaoHelper() {
         throw new IllegalStateException("Utility class");
    }    
    public static boolean ehNumero(String senha) {
        try {
            Integer.parseInt(senha);
            return true;
        }
        catch(NumberFormatException e){
            // ...
        }
        return false;    
    }
    
    public static boolean ehSenhaValida(String senha) {
        if(senha.length() != 6)
            return false;
        
        return ehNumero(senha);
    }
}
