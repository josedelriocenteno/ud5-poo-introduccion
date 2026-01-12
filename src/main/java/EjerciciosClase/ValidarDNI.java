package EjerciciosClase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarDNI {
    public boolean validarDni(String dni){
        Pattern pat = Pattern.compile("[0-9]{8}[A-Z]");
        Matcher mat = pat.matcher(dni);
        return mat.matches();
    }
}