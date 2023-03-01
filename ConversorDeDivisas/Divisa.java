
public abstract class Divisa {
  private String divisa;
  private double tasaDeCambioOrigen;
  private double cantidad;
  private double tasaDeCambioDestino;
  private double valorDolar = 1;
  private double valorPMexico = 18.44;
  private double valorEuro = 0.95;
  private double valorLibrasEsterlinas = 0.84;
  private double valorYenJapones = 136.26;
  private double valorWonsulcoreano = 1314.61;
  private double valorPorDefecto = 1;
  private double res = 0;

  public double getTasaDeCambioOrigen() {
    return tasaDeCambioOrigen;
  }

  public void setTasaDeCambioOrigen(double tasaDeCambioOrigen) {
    this.tasaDeCambioOrigen = tasaDeCambioOrigen;
  }

  public double getCantidad() {
    return cantidad;
  }

  public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
  }

  public double getTasaDeCambioDestino() {
    return tasaDeCambioDestino;
  }

  public void setTasaDeCambioDestino(double tasaDeCambioDestino) {
    this.tasaDeCambioDestino = tasaDeCambioDestino;
  }

  public double getValorPorDefecto() {
    return valorPorDefecto;
  }

  public void setValorPorDefecto(double valorPorDefecto) {
    this.valorPorDefecto = valorPorDefecto;
  }

  public double getValorDolar() {
    return valorDolar;
  }

  public void setValorDolar(double valorDolar) {
    this.valorDolar = valorDolar;
  }

  public double getValorPMexico() {
    return valorPMexico;
  }

  public void setValorPMexico(double valorPMexico) {
    this.valorPMexico = valorPMexico;
  }

  public double getValorEuro() {
    return valorEuro;
  }

  public void setValorEuro(double valorEuro) {
    this.valorEuro = valorEuro;
  }

  public double getValorLibrasEsterlinas() {
    return valorLibrasEsterlinas;
  }

  public void setValorLibrasEsterlinas(double valorLibrasEsterlinas) {
    this.valorLibrasEsterlinas = valorLibrasEsterlinas;
  }

  public double getValorYenJapones() {
    return valorYenJapones;
  }

  public void setValorYenJapones(double valorYenJapones) {
    this.valorYenJapones = valorYenJapones;
  }

  public double getValorWonsulcoreano() {
    return valorWonsulcoreano;
  }

  public void setValorWonsulcoreano(double valorWonsulcoreano) {
    this.valorWonsulcoreano = valorWonsulcoreano;
  }

  public void setRes(double cantidad, double tasaDeCambioOrigen, double tasaDeCambioDestino) {
    this.res = cantidad / tasaDeCambioOrigen * tasaDeCambioDestino;
  }

  public double getRes() {
    return res;
  }

  public String getDivisa() {
    return divisa;
  }

  public void setDivisa(String divisa) {
    this.divisa = divisa;
  }

  /*
   * public double getValorInicialDivisa() {
   * return valorInicialDivisa;
   * }
   * 
   * public void setValorInicialDivisa(double valorInicialDivisa) {
   * this.valorInicialDivisa = valorInicialDivisa;
   * }
   * 
   * public double getValorDivisaAcambiar() {
   * return valorDivisaAcambiar;
   * }
   * 
   * public void setValorDivisaAcambiar(double valorDivisaAcambiar) {
   * this.valorDivisaAcambiar = valorDivisaAcambiar;
   * }
   * public double getCantidaAcambiar() {
   * return cantidaAcambiar;
   * }
   * 
   * public void setCantidaAcambiar(double cantidaAcambiar) {
   * this.cantidaAcambiar = cantidaAcambiar;
   * }
   * 
   * 
   * public double getDolar() {
   * return Dolar;
   * }
   * 
   * public void setDolar(double dolar) {
   * Dolar = dolar;
   * }
   * 
   * public double getPeso() {
   * return peso;
   * }
   * 
   * public void setPeso(double peso) {
   * this.peso = peso;
   * }
   * 
   * public double getEur() {
   * return eur;
   * }
   * 
   * public void setEur(double eur) {
   * this.eur = eur;
   * }
   * 
   * public void setRes(double res) {
   * this.res = res;
   * }
   */

}
