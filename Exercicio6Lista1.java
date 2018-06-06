import javax.swing.JOptionPane;
public class Exercicio6Lista1{
    public static void main(String[] args){

       double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota"));
       double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota"));
       double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota"));
       double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota"));
       double media = (nota1 + nota2+ nota3+ nota4)/4;
       JOptionPane.showMessageDialog(null, "Sua média é: "+ media);
    }
}