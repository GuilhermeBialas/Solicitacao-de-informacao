import javax.swing.JOptionPane;
public class Exercicio2Lista1{
    public static void main(String[] args){

       
        int litrosDiarios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de água que você ingere diariamente"));
        int anosIngerindo = Integer.parseInt(JOptionPane.showInputDialog("Total de anos"));
        double valorPago = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor paga pela água"));

        int totalLitros = anosIngerindo * 365 * litrosDiarios;
        double totalPago = totalLitros * valorPago;

        JOptionPane.showMessageDialog(null, "Quantidade de litros consumidos: "+ totalLitros+ " Litros" +
                                            "\nValor total pago: "+ "R$ "+ totalPago);
    }
}