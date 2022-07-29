public class App {
    public static void main(String[] args) throws Exception {
        double senha;

        System.out.printf("\nDigite a senha: ");
		senha = Double.parseDouble(System.console().readLine());

        do {
            System.out.printf("A senha está incorreta.\n");

            System.out.printf("Digite a senha: ");
		    senha = Double.parseDouble(System.console().readLine());
        }while (senha != 1234);

        System.out.printf("\nSenha correta, Acesso liberado.");
    }    
}
