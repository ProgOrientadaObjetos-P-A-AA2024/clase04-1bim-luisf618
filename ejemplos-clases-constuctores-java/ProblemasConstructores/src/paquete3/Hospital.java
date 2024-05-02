package paquete3;

public class Hospital {

    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;

    public Hospital() {
        nombre = "na";
        ciudad = "ciu";
        numeroDoctores = 100;
        numeroEnfermeros = 400;
    }

    public Hospital(String n, String ciu, int doctores, int enfermeros) {

        nombre = n;
        ciudad = ciu;
        numeroDoctores = doctores;
        numeroEnfermeros = enfermeros;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public void establecerNumeroDoctores(int n) {
        numeroDoctores = n;
    }

    public void establecerNumeroEnfermeros(int n) {
        numeroEnfermeros = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroDoctores() {
        return numeroDoctores;
    }

    public int obtenerNumeroEnfermeros() {
        return numeroEnfermeros;
    }

    @Override
    public String toString() {

        String cadena = String.format("Nombre: %s\nCiudad: %s\nNumero de "
                + "Doctores: %d\nNumero de Enfermeros: %d\n", obtenerNombre(),
                ciudad, obtenerNumeroDoctores(),
                obtenerNumeroEnfermeros());
        // Podemos ocupar el metodo y el atributo porque ambos guardan el valor
        // que se ocupa en el metodo main y al estar en la misma clase no
        // influye si es publico o privado, dejandonos ocupar el atributo.
        return cadena;
    }

}
