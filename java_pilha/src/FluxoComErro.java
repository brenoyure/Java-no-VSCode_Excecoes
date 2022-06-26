public class FluxoComErro {

    public static void main(String[] args) {

        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException exception) {
            System.out.println("Mensagem da Exceção: " + exception.getMessage());
            exception.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Chamando metodo2");
        metodo2();
        System.out.println("Fim da chamada do metodo2");
    }
}