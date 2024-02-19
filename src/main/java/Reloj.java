public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;

    // Constructor
    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int obtenerHora() {
        return hora;
    }

    public void establecerHora(int hora) {
        this.hora = hora;
    }

    public int obtenerMinutos() {
        return minutos;
    }

    public void establecerMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int obtenerSegundos() {
        return segundos;
    }

    public void establecerSegundos (int segundos) {
        this.segundos = segundos;
    }

    public void mostrarHora() {
        System.out.println("Hora: " + hora + ":" + minutos + ":" + segundos);
    }

    public static void main(String[] args) {

        Reloj miReloj = new Reloj(1, 48, 37);
        miReloj.mostrarHora();
    }
}
