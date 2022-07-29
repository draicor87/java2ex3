public class App {
    public static void main(String[] args) throws Exception {
        int placa;

        System.out.print("Este aplicativo mostra o mês que seu veículo terá que\nfazer a vistoria a partir do número da placa do mesmo.");

        System.out.print("\nInforme a placa do veículo: ");
        placa = Integer.parseInt(System.console().readLine());
        
        placa = placa % 10;

        switch(placa) {

              case 0: System.out.printf("O final da placa é %d e o veículo fará a vistoria em Janeiro", placa); break;

              case 1: System.out.printf("O final da placa é %d e o veículo fará a vistoria em Fevereiro", placa); break;

              case 2: System.out.printf("O final da placa é %d e o veículo fará a vistoria em Março", placa); break;

              case 3: System.out.printf("O final da placa é %d e o veículo fará a vistoria em Abril", placa); break;

              case 4: System.out.printf("O final da placa é %d e o veículo fará a vistoria em Maio", placa); break;

              case 5: System.out.printf("O final da placa é %d e o veículo fará a vistoria em Junho", placa); break;

              case 6: System.out.printf("O final da placa é %d e o veículo fará a vistoria em Setembro", placa); break;

              case 7: System.out.printf("O final da placa é %d e o veículo fará a vistoria em Outubro", placa); break;

              case 8: System.out.printf("O final da placa é %d e o veículo fará a vistoria em Novembro", placa); break;

              case 9: System.out.printf("O final da placa é %d e o veículo fará a vistoria em Dezembro", placa); break;

              default: System.out.println("Número Inválido!");
        }
    }
}
