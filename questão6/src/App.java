public class App {
    public static void main(String[] args) throws Exception {
        double precoUn, quantidade, venda = 0, fatTotal = 0, j = 1, numMerc = 0;
		String nome;
        
		System.out.println("\nEste programa recebe o nome das mercadorias,\no preço unitario de cada mercadoria e a quantidade total vendida no mes.\nO programa calcula e mostra o faturamento total mensal do armazem.\n");

        System.out.printf("\nDigite quantas mercadorias o mercado comercializa: ");
		numMerc = Double.parseDouble(System.console().readLine());
		System.out.printf("\nDigite o nome da mercadoria %.0f: ", j);
		nome = (System.console().readLine());
		System.out.printf("Digite o preço unitario da  mercadoria %.0f: ", j);
		precoUn = Double.parseDouble(System.console().readLine());
		System.out.printf("Digite a quantidade vendida no mes da mercadoria %.0f: ", j);
		quantidade = Double.parseDouble(System.console().readLine());

            do
			{			
			venda = quantidade * precoUn;
			fatTotal = fatTotal + venda;

			j = j + 1;

			System.out.printf("\nDigite o nome da mercadoria %.0f: ", j);
			nome = (System.console().readLine());
			System.out.printf("Digite o preço unitario da  mercadoria %.0f: ", j);
			precoUn = Double.parseDouble(System.console().readLine());
			System.out.printf("Digite a quantidade vendida no mes da mercadoria %.0f: ", j);
			quantidade = Double.parseDouble(System.console().readLine());
			}while (numMerc > j);
		
		System.out.printf("\nFaturamento total mensal: R$ %.2f \n", fatTotal);
    }
}
