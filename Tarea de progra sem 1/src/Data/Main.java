package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String Nombre = "";
        Nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        String Salario = "";
        Salario = JOptionPane.showInputDialog("Digite su salario");

        float Deduccion = 9.34F;
        float Valordeduccion = Salario * Deduccion/100;
        float Nuevovalor = Salario - Valordeduccion;     // Tuve problemas con estas operaciones y no se por que me dan error
        System.out.println(Nuevovalor);

        JOptionPane.showMessageDialog(null,"Estimado trabajador" +Nombre+ "el salario de este mes se desglosa de la siguiente manera:");
        JOptionPane.showMessageDialog(null,"Salario bruto:"+Salario);
        JOptionPane.showMessageDialog(null,"Deduccion:"+Valordeduccion);
        JOptionPane.showMessageDialog(null,"Salario neto:"+Nuevovalor);



        //Ejercicio 2

        String Nombre2 = "";
        Nombre2 = JOptionPane.showInputDialog("Ingrese su nombre:");

        String Apellido = "";
        Apellido = JOptionPane.showInputDialog("Ingrese su apellido");

        String Edad = "";
        Edad = JOptionPane.showInputDialog("Ingrese su edad");


        String Sueldo ="";
        Sueldo = JOptionPane.showInputDialog("Ingrese su sueldo");

        JOptionPane.showMessageDialog(null,"El nombre es:"+Nombre2);
        JOptionPane.showMessageDialog(null,"El apellido es:"+Apellido);
        JOptionPane.showMessageDialog(null,"La edad es:"+Edad);
        JOptionPane.showMessageDialog(null,"El sueldo es:"+Sueldo);











    }
}
