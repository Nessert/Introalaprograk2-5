package libraries;

import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {

        // Problema 1

        String nombre = "";
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del trabajador:");

        float salario = 0;
        salario = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el salario semanal del trabajador:"));

        float SalarioMensual = salario * 4;

        double Deducciones = SalarioMensual * 9.34 / 100;

        double SalarioNeto = SalarioMensual - Deducciones;

        String mensaje = "Estimado trabajador " + nombre + " el salario de este mes se desglosa de la siguiente manera:\n" +
                "\n"+
                "Salario Bruto: " + SalarioMensual + "\n"+
                "Deducciones: " + Deducciones + "\n"+
                "Salario Neto: " + SalarioNeto;

        JOptionPane.showMessageDialog(null, mensaje);

        // Problema 2

        String PrimerNombre = "";
        PrimerNombre = JOptionPane.showInputDialog("Ingrese su primer nombre:");

        String Apellido = "";
        Apellido = JOptionPane.showInputDialog("Ingrese su apellido:");

        float sueldo = 0;
        sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su sueldo:"));

        String Dialogo = "El nombre es: " + PrimerNombre + " el apellido es: " + Apellido + " y el sueldo es: " + sueldo;

        JOptionPane.showMessageDialog(null, Dialogo);

    }
}
