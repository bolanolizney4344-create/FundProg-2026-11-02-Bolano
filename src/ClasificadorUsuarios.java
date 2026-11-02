/**
 * Clasifica usuarios segun su edad y su tipo de suscripcion.
 * Usa condicionales anidadas: primero se valida la edad y la suscripcion,
 * y luego se revisa la edad dentro de cada tipo de suscripcion.
 *
 * @author Lizney Bolano
 * @version 1.0.0
 */
public class ClasificadorUsuarios {

    /**
     * Devuelve la clasificacion y el nivel de acceso del usuario.
     *
     * @param edad edad del usuario en anios
     * @param suscripcion "gratuita" o "premium" (no distingue mayusculas)
     * @return texto con la categoria y el nivel de acceso,
     *         o un mensaje de error si los datos no son validos
     */
    public static String clasificar(int edad, String suscripcion) {
        if (edad < 0) {
            return "ERROR: edad no valida";
        }

        if (suscripcion == null) {
            return "ERROR: suscripcion no valida";
        }

        String tipo = suscripcion.trim().toLowerCase();

        if (tipo.equals("gratuita")) {
            if (edad < 12) {
                return "Nino - Acceso gratuito infantil";
            } else if (edad < 18) {
                return "Adolescente - Acceso gratuito basico";
            } else if (edad < 60) {
                return "Adulto - Acceso gratuito estandar";
            } else {
                return "Adulto mayor - Acceso gratuito preferencial";
            }
        } else if (tipo.equals("premium")) {
            if (edad < 12) {
                return "Nino - Acceso premium infantil";
            } else if (edad < 18) {
                return "Adolescente - Acceso premium completo";
            } else if (edad < 60) {
                return "Adulto - Acceso premium completo";
            } else {
                return "Adulto mayor - Acceso premium preferencial";
            }
        } else {
            return "ERROR: suscripcion no valida";
        }
    }

    /**
     * Ejemplo de uso desde la consola.
     *
     * @param args no se usa
     */
    public static void main(String[] args) {
        System.out.println(clasificar(8, "gratuita"));
        System.out.println(clasificar(70, "premium"));
    }
}
