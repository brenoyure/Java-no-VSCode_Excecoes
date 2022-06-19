public class Fluxo {

    public static void main(String[] args) {

        System.out.println("Inicio do Main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException e) {
            String msg = e.getMessage();
            System.out.println("Exception: " + msg);
            e.printStackTrace();
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
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            Conta c = null;
            c.deposita();
        }
        System.out.println("Fim do metodo 2");
    }

}
