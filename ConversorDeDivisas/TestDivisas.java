import java.util.Scanner;

public class TestDivisas {

  public TestDivisas() {
  }

  public static void main(String[] args) {
    Divisa divisa = new Operaciones();
    /*
     * divisa.setValorDivisaAcambiar(5678);
     * divisa.setCantidaAcambiar(1);
     * divisa.setValorInicialDivisa(18.40);
     * divisa.setDivisa("Dolar");
     * divisa.setRes(divisa.getValorDivisaAcambiar(), divisa.getCantidaAcambiar(),
     * divisa.getValorInicialDivisa());
     */
    // System.out.println(divisa.getRes());
    // System.out.println(divisa.getDivisa());
    // double cantidadDestino = cantidad / tasaDeCambioOrigen * tasaDeCambioDestino;
    // divisa.setRes(50, 18.44, 0.95);
    // System.out.println(divisa.getRes());
    /*Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número: ");

    String input = scanner.nextLine();
    for (int i = 0; i < input.length(); i++) {
      if (!Character.isDigit(input.charAt(i))) {
        System.out.println("Error: Ha ingresado letras en vez de números.");
        break;
      }
    }*/
    char[] alphabet = new char[26];
    for (int i = 0; i < 26; i++) {
      alphabet[i] = (char) ('a' + i);
    }
    System.out.println(alphabet);
  }
}
