public class FluxoComTratamento {

    public static void main(String[] args) {

        System.out.println("Inicio do Main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException exception) {
            System.out.println("Mensagem da Exceção: " + exception.getMessage());
            exception.printStackTrace();
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
        
        throw new ArithmeticException("teste - jogando exceção do tipo Arithmetic...");

        // System.out.println("Fim do metodo 2");
    }

}