import javax.swing.JOptionPane;
public class Exercicio3Lista1{
    public static void main(String[] args){
        
       int N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
       int N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));

       int soma = N1 + N2;
       int subtracao = N1 - N2;
       int multiplicacao = N1 * N2;
       double divisao = N1 / N2;
      

       JOptionPane.showMessageDialog(null, "Números solicitados: " + N1+ " e "+ N2 +
                                           "\nSoma: " +soma +
                                           "\nSubtração: " + subtracao+
                                           "\nmultiplicação: " +  multiplicacao +
                                           "\nDivisão: "+ divisao);



    }
}