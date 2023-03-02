
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Interface extends JPanel{
  JButton convertir;
  JLabel divisaInput, divisaOutput, valorAconvertirlbl;
  JTextField valorDivisaInput;
  JTextField valorDivisaOutput;
  JComboBox divisasAElegir, divisasAElegir1;
  JFrame jFrame = new JFrame();

  GridBagConstraints gbc = new GridBagConstraints();


  public void op(double tasadeCambioEntrada, double tasadCambioSalida){
    try{
    Divisa div = new Operaciones();
    String vDO = valorDivisaOutput.getText();
    double stringTodouble1 = Double.parseDouble(vDO);
    div.setTasaDeCambioDestino(tasadeCambioEntrada);
    div.setTasaDeCambioOrigen(tasadCambioSalida);
    double resultadoBueno = stringTodouble1 / tasadeCambioEntrada * tasadCambioSalida;   
    BigDecimal bd = new BigDecimal(resultadoBueno).setScale(2, RoundingMode.HALF_UP);
    double val2 = bd.doubleValue();
    String val21 = Double.toString(val2);
    valorDivisaInput.setText(val21);
  }catch(Exception e) {
    JOptionPane.showMessageDialog(jFrame, "Solo ingresa numeros");
    valorDivisaOutput.setText(" ");
}
  }

  public Interface() {
    Divisa div = new Operaciones();
    gbc.insets = new Insets(40, 40, 40, 40); 
    setLayout(new GridBagLayout());
    valorDivisaOutput = new JTextField("");
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridwidth = 1;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    add(valorDivisaOutput, gbc);
    valorDivisaInput = new JTextField("");
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.gridwidth = 1;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    add(valorDivisaInput, gbc);
    divisasAElegir = new JComboBox<String>();
    divisasAElegir.addItem("Selecciona un valor");
    divisasAElegir.addItem("Euros");
    divisasAElegir.addItem("Pesos Mexicanos");
    divisasAElegir.addItem("Dólar");
    divisasAElegir.addItem("Libras Esterlinas");
    divisasAElegir.addItem("Yen Japonés");
    divisasAElegir.addItem("Won sur-coreano");
    divisasAElegir.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (divisasAElegir.getSelectedIndex() == 1) {
          String restoString = Double.toString(div.getValorPorDefecto());   
          valorDivisaOutput.setText(restoString);
        }
        if (divisasAElegir.getSelectedIndex() == 2) {
          String restoString = Double.toString(div.getValorPorDefecto());
          valorDivisaOutput.setText(restoString);
        }
        if (divisasAElegir.getSelectedIndex() == 3) {
          String restoString = Double.toString(div.getValorPorDefecto());
          valorDivisaOutput.setText(restoString);
        }
        if (divisasAElegir.getSelectedIndex() == 4) {
          String restoString = Double.toString(div.getValorPorDefecto());
          valorDivisaOutput.setText(restoString);
        }
        if (divisasAElegir.getSelectedIndex() == 5) {
          String restoString = Double.toString(div.getValorPorDefecto());
          valorDivisaOutput.setText(restoString);
        }
        if (divisasAElegir.getSelectedIndex() == 6) {
          String restoString = Double.toString(div.getValorPorDefecto());
          valorDivisaOutput.setText(restoString);
        }
        if (divisasAElegir.getSelectedIndex() == 0) {
          valorDivisaOutput.setText("Selecciona algun valor ");
        }
        
      } 
            
    });
    gbc.gridx = 0;
    gbc.gridy = 0;
    add(divisasAElegir, gbc);
    divisasAElegir1 = new JComboBox<String>();
    divisasAElegir1.addItem("Selecciona un valor");
    divisasAElegir1.addItem("Euros");
    divisasAElegir1.addItem("Pesos Mexicanos");
    divisasAElegir1.addItem("Dólar");
    divisasAElegir1.addItem("Libras Esterlinas");
    divisasAElegir1.addItem("Yen Japonés");
    divisasAElegir1.addItem("Won sur-coreano");
    divisasAElegir1.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (divisasAElegir1.getSelectedIndex() == 1) {
          int valorInicial = divisasAElegir.getSelectedIndex();
          if (valorInicial == 1) {
            op(div.getValorEuro(), div.getValorEuro());
            
          }
          if (valorInicial == 2) {
            op(div.getValorPMexico(), div.getValorEuro());
          }
          if (valorInicial == 3) {
            op(div.getValorDolar(), div.getValorEuro());
          }
          if (valorInicial == 4) {
            op(div.getValorLibrasEsterlinas(), div.getValorEuro());
          }
          if (valorInicial == 5) {
            op(div.getValorYenJapones(), div.getValorEuro());
          }
          if (valorInicial == 6) {
            op(div.getValorWonsulcoreano(), div.getValorEuro());
          }
        }
        if (divisasAElegir1.getSelectedIndex() == 2) {
          int valorInicial = divisasAElegir.getSelectedIndex();
          if (valorInicial == 1) {
            op(div.getValorEuro(), div.getValorPMexico());
          }
          if (valorInicial == 2) {
            op(div.getValorPMexico(), div.getValorPMexico());
          }
          if (valorInicial == 3) {
            op(div.getValorDolar(), div.getValorPMexico());
          }
          if (valorInicial == 4) {
            op(div.getValorLibrasEsterlinas(), div.getValorPMexico());
          }
          if (valorInicial == 5) {
            op(div.getValorYenJapones(), div.getValorPMexico());
          }
          if (valorInicial == 6) {
            op(div.getValorWonsulcoreano(), div.getValorPMexico());
          }
        }
        if (divisasAElegir1.getSelectedIndex() == 3) {
          int valorInicial = divisasAElegir.getSelectedIndex();
          if (valorInicial == 1) {
            op(div.getValorEuro(), div.getValorDolar());
          }
          if (valorInicial == 2) {
            op(div.getValorPMexico(), div.getValorDolar());
          }
          if (valorInicial == 3) {
            op(div.getValorDolar(), div.getValorDolar());
          }
          if (valorInicial == 4) {
            op(div.getValorLibrasEsterlinas(), div.getValorDolar());
          }
          if (valorInicial == 5) {
            op(div.getValorYenJapones(), div.getValorDolar());
          }
          if (valorInicial == 6) {
            op(div.getValorWonsulcoreano(), div.getValorDolar());
          }
        }
        if (divisasAElegir1.getSelectedIndex() == 4) {
          int valorInicial = divisasAElegir.getSelectedIndex();
          if (valorInicial == 1) {
            op(div.getValorEuro(), div.getValorLibrasEsterlinas());
          }
          if (valorInicial == 2) {
            op(div.getValorPMexico(), div.getValorLibrasEsterlinas());
          }
          if (valorInicial == 3) {
            op(div.getValorDolar(), div.getValorLibrasEsterlinas());
          }
          if (valorInicial == 4) {
            op(div.getValorLibrasEsterlinas(), div.getValorLibrasEsterlinas());
          }
          if (valorInicial == 5) {
            op(div.getValorYenJapones(), div.getValorLibrasEsterlinas());
          }
          if (valorInicial == 6) {
            op(div.getValorWonsulcoreano(), div.getValorLibrasEsterlinas());
          }
        }
        if (divisasAElegir1.getSelectedIndex() == 5) {
          int valorInicial = divisasAElegir.getSelectedIndex();
          if (valorInicial == 1) {
            op(div.getValorEuro(), div.getValorYenJapones());
          }
          if (valorInicial == 2) {
            op(div.getValorPMexico(), div.getValorYenJapones());
          }
          if (valorInicial == 3) {
            op(div.getValorDolar(), div.getValorYenJapones());
          }
          if (valorInicial == 4) {
            op(div.getValorLibrasEsterlinas(), div.getValorYenJapones());
          }
          if (valorInicial == 5) {
            op(div.getValorYenJapones(), div.getValorYenJapones());
          }
          if (valorInicial == 6) {
            op(div.getValorWonsulcoreano(), div.getValorYenJapones());
          }
        }
        if (divisasAElegir1.getSelectedIndex() == 6) {
          int valorInicial = divisasAElegir.getSelectedIndex();
          if (valorInicial == 1) {
            op(div.getValorEuro(), div.getValorWonsulcoreano());
          }
          if (valorInicial == 2) {
            op(div.getValorPMexico(), div.getValorWonsulcoreano());
          }
          if (valorInicial == 3) {
            op(div.getValorDolar(), div.getValorWonsulcoreano());
          }
          if (valorInicial == 4) {
            op(div.getValorLibrasEsterlinas(), div.getValorWonsulcoreano());
          }
          if (valorInicial == 5) {
            op(div.getValorYenJapones(), div.getValorWonsulcoreano());
          }
          if (valorInicial == 6) {
            op(div.getValorWonsulcoreano(), div.getValorWonsulcoreano());
          }
        }
        if (divisasAElegir1.getSelectedIndex() == 0) {
          valorDivisaInput.setText("Selecciona algun valor ");
        }
      } 
    });

    gbc.gridx = 1;
    gbc.gridy = 0;
    add(divisasAElegir1, gbc);


  }


  public static void main(String[] args) {
    Interface Interface = new Interface();
    JFrame jf = new JFrame();

    jf.setTitle("Conversor de divisas");
    jf.setSize(500, 500);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setVisible(true);
    jf.add(Interface);
  }


}

/*
 * el gbc grid X y Y nos indica la posicion dentro del grid
 * se majena por renctangulos como es de esperar en los grids y cada numero o
 * valor es un espacio en el
 * interior del grids
 * el gbc gridwidth es cuantos rectanglos ocupa de lado a lado y se queda en el
 * centro a menos que lo rellenes
 * para eso es el gbc.fill=GridBagConstrainsts.HORIZONTAL
 * y gridhewight es lo mismo pero verticalmente
 * y el gbc.insets = new Insets(); es un pading el ejemplo es
 */