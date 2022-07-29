public class App {
    public static void main(String[] args) throws Exception {
        int cont, penultimo, ultimo, aux;
				
		penultimo = 0;
		ultimo = 1;
		cont = 0;
		do  {
			System.out.println(ultimo);
			aux = ultimo;
			ultimo = ultimo + penultimo;
			penultimo = aux;
			cont = cont + 1;
		}while(cont < 10);
    }
}
