import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temperature extends JFrame implements ActionListener{

  private Container pane;
  private JButton ctf;
  private JButton ftc;
  private JTextField in;
  private JTextField out;
  private Label inputLabel;

  public static double CtoF(double t){
    return t*(9.0/5.0)+32.0;
  }

  public static double FtoC(double t){
    return (t-32.0)*(5.0/9.0);
  }

  public Temperature() {
    this.setTitle("Temperature Converter");
    this.setSize(400,100);
    this.setLocation(100,100);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    pane = this.getContentPane();
    pane.setLayout(new FlowLayout());

    ctf = new JButton("Convert to Fahrenheit");
    ctf.addActionListener(this);
    ctf.setActionCommand("CtoF");
    ftc = new JButton("Convert to Celcius");
    ftc.addActionListener(this);
    ftc.setActionCommand("FtoC");
    in = new JTextField(10);
    inputLabel = new Label("Input");
    out = new JTextField(10);

    pane.add(inputLabel);
    pane.add(in);
    pane.add(ctf);
    pane.add(ftc);
    pane.add(out);
  }

  public void actionPerformed(ActionEvent e) {
    if ("CtoF".equals(e.getActionCommand())){
      Double val = CtoF(Double.parseDouble(in.getText()));
      out.setText(Double.toString(val));
    }
    if ("FtoC".equals(e.getActionCommand())){
      Double val = FtoC(Double.parseDouble(in.getText()));
      out.setText(Double.toString(val));
    }
  }

  public static void main(String[] args) {
    Temperature g = new Temperature();
    g.setVisible(true);
  }

}

