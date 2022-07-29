public class App {
    public static void main(String[] args) throws Exception {
        int dia, mes, ano;

        System.out.print("Informe o dia, de 1 a 31: ");
        dia = Integer.parseInt(System.console().readLine());

        System.out.print("Informe o mês, de 1 a 12: ");
        mes = Integer.parseInt(System.console().readLine());

        System.out.print("Informe o ano com 4 números: ");
        ano = Integer.parseInt(System.console().readLine());

        switch(mes) {              

              case 1: System.out.printf("%d De Janeiro De %d", dia, ano); break;

              case 2: System.out.printf("%d De Fevereiro De %d", dia, ano); break;

              case 3: System.out.printf("%d De Março De %d", dia, ano); break;

              case 4: System.out.printf("%d De Abril De %d", dia, ano); break;

              case 5: System.out.printf("%d De Maio De %d", dia, ano); break;

              case 6: System.out.printf("%d De Junho De %d", dia, ano); break;

              case 7: System.out.printf("%d De Julho De %d", dia, ano); break;

              case 8: System.out.printf("%d De Agosto De %d", dia, ano); break;

              case 9: System.out.printf("%d De Setembro De %d", dia, ano); break;

              case 10: System.out.printf("%d De Outubro De %d", dia, ano); break;

              case 11: System.out.printf("%d De Novembro De %d", dia, ano); break;

              case 12: System.out.printf("%d De Dezembro De %d", dia, ano); break;

              default: System.out.println("Número Inválido!");

        }
    }
}
