public class Proyectil {
    private double velocidad;
    private double angulo;

    // Constructor
    public Proyectil(double velocidad, double angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public static void main(String[] args) {

        Proyectil miProyectil = new Proyectil(60.0, 35.5);
        System.out.println("Velocidad: " + miProyectil.getVelocidad());
        System.out.println("Ángulo: " + miProyectil.getAngulo());
    }
}
