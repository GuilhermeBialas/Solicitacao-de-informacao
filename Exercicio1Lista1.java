import javax.swing.JOptionPane;
public class Exercicio1Lista1{
    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, "Número digitado: "+ numero);
    }
}