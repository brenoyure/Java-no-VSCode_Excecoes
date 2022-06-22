public class FluxoComTratamento {

    public static void main(String[] args) {

        System.out.println("Inicio do Main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception: " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do Main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo 2");

        ArithmeticException exception = new ArithmeticException();

        System.out.println("Fim do metodo 2");
        throw exception;

    }

}