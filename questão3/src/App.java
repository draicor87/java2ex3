public class App {
    public static void main(String[] args) throws Exception {
        int numero, soma = 0;
        
		System.out.println("\nEste programa calcula a SOMA de DEZ numeros.\n");

            for (int i = 1; i <= 10; i++)
			{
			System.out.printf("Digite o numero %d: ", i);
			numero = Integer.parseInt(System.console().readLine());
			soma = soma + numero;
			}

		System.out.printf("\nResultado da soma = %d", soma);
    }
}
