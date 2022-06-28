public class TesteConexao {
    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão...");
        }

        // Método Finaly já está criado, puxado a partir da implementação do
        // AutoClosable da classe Conta

        // Conexao con = null;

        // try (Conexao con = new Conexao()) {
        // con.leDados();
        // } catch (IllegalStateException exception) {
        // System.out.println("Deu erro na conexão.");
        // } finally {
        // con.close();
        // }
    }

}