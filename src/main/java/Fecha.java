public class Fecha {
    private int año;
    private int mes;
    private int dia;

    // Constructor
    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }


    public int obtenerAño() {
        return año;
    }

    public void establecerAño(int año) {
        this.año = año;
    }

    public int obtenerMes() {
        return mes;
    }

    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public void mostrarFecha() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + año);
    }

    public static void main(String[] args) {

        Fecha miFecha = new Fecha(2024, 2, 19);
        miFecha.mostrarFecha();
    }
}

