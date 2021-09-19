package libary;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	String nombre = JOptionPane.showInputDialog("Ingres su nombre");
    float sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su salario semanal"))*4;
    double deduccion = sueldo * 0.0934;
    double sueldoNeto = sueldo - deduccion;
    JOptionPane.showMessageDialog(null,"Estimado trabajador "+nombre+", el salario de" +
            " este mes se desglosa de la siguiente manera:"+"\n Salrio bruto: "+sueldo+"\n Deduccion: "+deduccion+
            "\n Salario neto: "+sueldoNeto);

    }
}
