package sistema_gestion;
public class Estudiante extends Persona {
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        super(nombre, edad); 
        this.carrera = carrera;
        this.promedio = promedio;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(" | Carrera: " + carrera + " | Promedio: " + promedio);
    }

    // Getters y Setters específicos
    public String getCarrera() { return carrera; }
    public double getPromedio() { return promedio; }
}
