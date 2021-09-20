package libreria;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	 String nombre = "";
     int salario = 0;

     nombre = JOptionPane.showInputDialog("Ingrese su nombre");
     System.out.println("estimado trabajador" + nombre + ", el salario de este mes se desglosa de la siguiente manera:");
     salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario semanal"));
     System.out.println("Salario bruto "+ salario);

     //JOptionPane.showMessageDialog(null, "Estimado trabajador " + nombre + ", el salario de este mes se desglosa de la siguiente manera:");
        double Deduccion = salario * 9.34 / 100;
        double SalarioNeto = salario - Deduccion;
        System.out.println("Deducciones " + Deduccion);
        System.out.println("Salario neto " + SalarioNeto);
    }
}
