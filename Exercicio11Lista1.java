import javax.swing.JOptionPane;
public class Exercicio11Lista1{
    public static void main(String[] args){
       
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês de nascimento"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento"));
       
        int anosVivo = 2018 - ano;
        int diasVivo = anosVivo * 365;
        int mesesVivo = anosVivo * 12;
        int horasVivo = diasVivo * 24;
        int minutosVivo = horasVivo * 60;
        int segundosVivo = minutosVivo * 60;

        JOptionPane.showMessageDialog(null, "Quantidade de dias vivo: "+ diasVivo+" dias"+
                                           "\nQuantidade de anos vivo "+ anosVivo+" anos"+
                                           "\nQuantidade de meses vivo: "+ mesesVivo+" meses"+
                                           "\nQuantidade de horas vivo: "+ horasVivo+" horas"+
                                           "\nQuantidades de minutos vivo: "+minutosVivo+" minutos"+
                                           "\nQuantidade de segundos vivo: "+segundosVivo+ " segundos");
    }
}