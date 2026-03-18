package instituto;

public class ValidadorRegistro {

    public boolean validarNombre(String nombre) {
        // Reto 1: Si es nulo o está vacío (length == 0), devolvemos false
        return nombre != null && !nombre.trim().isEmpty();
    }

    public boolean validarPassword(String password) {
        // Reto 2 y 3: Comprobamos que tenga al menos 8 caracteres
        return password != null && password.length() >= 8;
    }

    public boolean validarEmail(String email) {
        // Reto 4: Verificamos que contenga el símbolo '@'
        return email != null && email.contains("@");
    }

    public boolean validarEdad(int edad) {
        // Reto 5: La edad debe ser mayor o igual a 16
        return edad >= 16;
    }
}