import javax.swing.JOptionPane;
public class Exercicio8Lista1{
   public static void main(String[] args){
      
    double contaLuz = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta da luz"));
    double contaAgua = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta da água"));
    double valorNET = Double.parseDouble(JOptionPane.showInputDialog("Valor da NET"));
    double valorVivo = Double.parseDouble(JOptionPane.showInputDialog("Valor da Vivo"));
    double valorOi = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta da Oi"));
    double valorIPTU = Double.parseDouble(JOptionPane.showInputDialog("Valor do IPTU"));
    double valorIPVA = Double.parseDouble(JOptionPane.showInputDialog("Valor dO IPVA"));
    double valorSeguro = Double.parseDouble(JOptionPane.showInputDialog("Valor do seguro do carro"));

    //Valor das contas

    double contaTelefone =valorVivo  + valorOi + valorNET;
    double valorImpostos = valorIPTU +valorIPVA;
    double valorRestante = contaLuz + contaAgua + valorSeguro ;   
    double total = contaLuz + contaAgua + valorNET + valorVivo + valorOi + valorIPTU + valorIPVA + valorSeguro ;
    
    JOptionPane.showMessageDialog(null, "Valor das contas de telefone: "+ contaTelefone +
                                      "\nValor dos impostos: "+ valorImpostos +
                                      "\nValor do restante das contas: "+ valorRestante +
                                      "\nValor Total de todas as contas: "+ total);
        }
    }