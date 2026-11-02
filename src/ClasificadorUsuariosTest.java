import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias del metodo clasificar, con JUnit 5.
 * Cubren los limites de cada rango de edad y los casos de error.
 */
public class ClasificadorUsuariosTest {

    @Test
    void caso01_ninoGratuito() {
        assertEquals("Nino - Acceso gratuito infantil",
                ClasificadorUsuarios.clasificar(5, "gratuita"));
    }

    @Test
    void caso02_limiteNinoPremium11() {
        assertEquals("Nino - Acceso premium infantil",
                ClasificadorUsuarios.clasificar(11, "premium"));
    }

    @Test
    void caso03_limiteAdolescenteGratuito12() {
        assertEquals("Adolescente - Acceso gratuito basico",
                ClasificadorUsuarios.clasificar(12, "gratuita"));
    }

    @Test
    void caso04_adolescentePremium17() {
        assertEquals("Adolescente - Acceso premium completo",
                ClasificadorUsuarios.clasificar(17, "premium"));
    }

    @Test
    void caso05_limiteAdultoGratuito18() {
        assertEquals("Adulto - Acceso gratuito estandar",
                ClasificadorUsuarios.clasificar(18, "gratuita"));
    }

    @Test
    void caso06_limiteAdultoPremium59() {
        assertEquals("Adulto - Acceso premium completo",
                ClasificadorUsuarios.clasificar(59, "premium"));
    }

    @Test
    void caso07_limiteAdultoMayorGratuito60() {
        assertEquals("Adulto mayor - Acceso gratuito preferencial",
                ClasificadorUsuarios.clasificar(60, "gratuita"));
    }

    @Test
    void caso08_adultoMayorPremium75() {
        assertEquals("Adulto mayor - Acceso premium preferencial",
                ClasificadorUsuarios.clasificar(75, "premium"));
    }

    @Test
    void caso09_edadNegativa() {
        assertEquals("ERROR: edad no valida",
                ClasificadorUsuarios.clasificar(-1, "gratuita"));
    }

    @Test
    void caso10_suscripcionInvalida() {
        assertEquals("ERROR: suscripcion no valida",
                ClasificadorUsuarios.clasificar(20, "VIP"));
    }
}
