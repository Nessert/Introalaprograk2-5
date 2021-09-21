package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Bienvenido"+"\n"+"ingrese la informacion que se le solicita a continuacion: "+"\n"+"Ingrese su nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));

        JOptionPane.showMessageDialog(null,"Su nombre es: "+ nombre + "\n"+ "Su edad es: "+ edad + "\n"+"Su salario es: "+ salario );

    }
}
