import javax.swing.JOptionPane;
public class Exercicio9Lista1{
    public static void main(String[] args){
        
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));          

       System.out.println("Anterior"+
                          "\nnumero: "+numero1+
                          "\nnumero: "+numero2+
                          "\nDepois de iverter"+
                          "\nnumero: " +numero2+
                          "\nnumero: "+numero1);
    }
}