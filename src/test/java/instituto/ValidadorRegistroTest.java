package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();
    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }



    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ
    /*Reto 1 (Nombre vacío): Escribe un test que envíe un nombre vacío ("").
    El sistema debería rechazarlo devolviendo false.
    */
    @Test
    @DisplayName("Reto 1: Nombre vacío debe ser rechazado")
    public void testNombreVacio() {
        // Enviamos nombre vacío, el validador debería decir que NO es válido (false)
        boolean resultado = validador.validarNombre("");
        assertFalse(resultado, "Error: El sistema permitió un nombre vacío");
    }

    /*Reto 2 (Password justa): Escribe un test que envíe una contraseña de exactamente 8 caracteres (ej. "12345678").
    El sistema debería aceptarla devolviendo true.
     */
    @Test
    @DisplayName("Reto 2: Password de 8 caracteres debe ser aceptada")
    public void testPasswordJusta() {
        // Exactamente 8 caracteres, es el límite inferior de seguridad
        boolean resultado = validador.validarPassword("12345678");
        assertTrue(resultado, "Error: El sistema rechazó una contraseña válida de 8 caracteres");
    }

    /*Reto 3 (Password corta): Escribe un test que envíe una contraseña de 5 letras (ej. "Admin").
    El sistema debería rechazarla.
     */
    @Test
    @DisplayName("Reto 3: Password corta (5 caracteres) debe ser rechazada")
    public void testPasswordCorta() {
        // Menos de 8 caracteres, debería fallar
        boolean resultado = validador.validarPassword("Admin");
        assertFalse(resultado, "Error: El sistema permitió una contraseña demasiado corta");
    }

    /*Reto 4 (Email sin arroba): Escribe un test que envíe un email falso (ej. "usuario.gmail.com").
    El sistema debería rechazarlo.
     */
    @Test
    @DisplayName("Reto 4: Email sin arroba debe ser rechazado")
    public void testEmailSinArroba() {
        // Formato incorrecto, debería devolver false
        boolean resultado = validador.validarEmail("usuario.gmail.com");
        assertFalse(resultado, "Error: El sistema aceptó un email sin símbolo '@'");
    }

    /*Reto 5 (Edad límite): Escribe un test que envíe la edad mínima legal (16 años).
    El sistema debería aceptar a un usuario de exactamente 16 años.
     */
    @Test
    @DisplayName("Reto 5: Edad de 16 años debe ser aceptada")
    public void testEdadLimite() {
        // El límite legal exacto, debería ser true
        boolean resultado = validador.validarEdad(16);
        assertTrue(resultado, "Error: El sistema debería permitir el registro a personas de 16 años");
    }

}
