package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Bienvenido"+"\n"+"Ingrese su nombre: ");
        int salarioSemanal  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario semanal"));
        int salarioMensual = salarioSemanal * 4;
        float deduccion = (int)(salarioMensual * 0.0934);
        float salarioConDeduccion = salarioMensual - deduccion;

        JOptionPane.showMessageDialog(null,"Estimado trabajador " + nombre + ", el salario de este mes se desglosa de la siguiente manera:" + "\n" + "Salario bruto: "+ salarioMensual + "\n"+ "Deduccion:"+ deduccion + "\n"+ "Salario Neto: "+ salarioConDeduccion);

    }
}