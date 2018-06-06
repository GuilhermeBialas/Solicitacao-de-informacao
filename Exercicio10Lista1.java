import javax.swing.JOptionPane;
public class Exercicio10Lista1{
    public static void main(String[] args){
        
        int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Seu ano de nascimento"));
        int idade = 2018 - nascimento;

        JOptionPane.showMessageDialog(null, "Sua idade é: "+ idade);

    }
}