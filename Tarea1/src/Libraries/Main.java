package Libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String Nombre =JOptionPane.showInputDialog(null, "Digite su nombre: ") ;
        int Salario = 0;
        Salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su salario semanal: "));

        System.out.println("Estimado Trbajador " + Nombre + " el salario de este mes se deslglosa de la siguiente manera:");
        int Salario_B = Salario;
        float Deduccion = (Salario*9.34F/100);
        float Salario_N =  Salario - Deduccion;

        System.out.println("Su salario bruto es de: " + Salario_B);
        System.out.println("La deduccion es de: " + Deduccion);
        System.out.println("El salario nuevo es de: " + Salario_N);


    }
}
