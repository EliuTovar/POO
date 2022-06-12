
package eva3_practica11_throw;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Eva3_Practica11_Throw {

    
    public static void main(String[] args) {
        
        try {
            throw new Exception("Mi excepcion!!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
