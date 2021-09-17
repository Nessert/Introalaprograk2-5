package data;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        //Problema #1
        String nombre= "";
        nombre= JOptionPane.showInputDialog("Ingrese su nombre");
        Integer salaSemanal= 0;
        salaSemanal= Integer.parseInt(JOptionPane.showInputDialog("Digite su salario semanal"));
        Integer salaMen= salaSemanal * 4;
        // porcentaje de deducciones= 9.34%
        double deducciones= (salaMen*9.34)/100;
        double salaDedu= salaMen - deducciones;
        JOptionPane.showMessageDialog(null,"Estimado tabajor, "+nombre+", el salario de este mes se desglosa de la siguiente manera:");
        JOptionPane.showMessageDialog(null,"Salario bruto: "+ salaMen);
        JOptionPane.showMessageDialog(null, "Deducciones: "+ deducciones);
        JOptionPane.showMessageDialog(null, "Salario neto: "+ salaDedu);
    }
}
