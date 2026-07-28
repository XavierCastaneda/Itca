public class Estudiante {

    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void mostrarInformacion() {
        System.out.println("===== INFORMACIÓN DEL ESTUDIANTE =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
            "Xavier Castaneda",
            20,
            "Ingeniería de Software"
        );

        estudiante.mostrarInformacion();
    }
}