public class Fraccionario {
    private int numerador;
    private int denominador;

    // Constructor
    public Fraccionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int obtenerNumerador() {
        return numerador;
    }

    public int obtenerDenominador() {
        return denominador;
    }

    public void establecerNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void establecerDenominador(int denominador) {
        this.denominador = denominador;
    }
    public static class ProgramaPrincipal {
        public static void main(String[] args) {

            Fraccionario fraccion = new Fraccionario(1, 2);


            System.out.println("Fracción: " + fraccion.obtenerNumerador() + "/" + fraccion.obtenerDenominador());


            fraccion.establecerNumerador(6);
            fraccion.establecerDenominador(8);

            System.out.println("Fracción actualizada: " + fraccion.obtenerNumerador() + "/" + fraccion.obtenerDenominador());
        }
    }

}
