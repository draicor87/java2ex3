public class App {
    public static void main(String[] args) throws Exception {
        int quadrado = 0, j = 15;
        
		System.out.println("\nEste programa apresenta os quadrados dos numeros inteiros de 15 a 200.\n");

		do
			{			
			quadrado = j * j;

			System.out.printf("\nO quadrado de %d eh: %d", j, quadrado);

			j = j + 1;
			}while (j > 14 && j < 201);
    }
}
