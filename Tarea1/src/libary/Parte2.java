package libary;
import javax.swing.JOptionPane;

public class Parte2 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null,"Ingrese su Nombre completo");
        String edad = JOptionPane.showInputDialog(null,"Ingrese su edad");
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su salario"));
        JOptionPane.showMessageDialog(null,nombre+" de edad "+edad+" tiene un sueldo de "+sueldo);

    }
}
