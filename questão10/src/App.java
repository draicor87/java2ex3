public class App {
    public static void main(String[] args) throws Exception {
        int op, n1, n2, n3;

        System.out.print("Menu de opções:\n1. Somar dois números.\n2. Número ao quadrado.");
        
        System.out.print("\nInforme a opção desejada: ");
        op = Integer.parseInt(System.console().readLine());        

        switch(op) {              

              case 1: {
                System.out.print("\nInforme o primeiro número: ");
                n1 = Integer.parseInt(System.console().readLine());

                System.out.print("\nInforme o segundo número: ");
                n2 = Integer.parseInt(System.console().readLine());

                n3 = n1 + n2;

                System.out.printf("\nA soma dos dois números é: %d", n3);
        
                break;
              }
              
              

              case 2: {
                System.out.print("\nInforme o número: ");
                n1 = Integer.parseInt(System.console().readLine());

                n3 = n1 * n1;

                System.out.printf("\nO número %d ao quadrado é: %d", n1, n3);

                break;
              } 

        }
    }
}
