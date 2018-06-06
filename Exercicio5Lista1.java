import javax.swing.JOptionPane;
public class Exercicio5Lista1{
    public static void main(String[] args){

       String nome = JOptionPane.showInputDialog("Nome do carro");
       double valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Valor do carro"));
       double valorParcela = Double.parseDouble(JOptionPane.showInputDialog("Valor da parcela"));
       int quantidadeParcela = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de parcelas"));

       double valorTotalFinanciamento = valorParcela * quantidadeParcela;
       double diferencaFinanciamento = valorCarro - valorTotalFinanciamento;
      
       JOptionPane.showMessageDialog(null, "Nome do carro: "+ nome +
                                        "\nValor do carro: "+ valorCarro+
                                        "\nValor de cada parcela: "+ valorParcela +
                                        "\nQuantidade de parcelas: "+quantidadeParcela+
                                        "\nValor total do financiamento: "+ valorTotalFinanciamento+
                                        "\nDiferença entre o valor total do financiamento e valor do carro: "+diferencaFinanciamento);

    }
}