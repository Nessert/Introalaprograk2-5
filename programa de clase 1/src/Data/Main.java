package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
            String nombre="joemama";// cadena de caracteres
            int edad=31;// Integer o Entero
            Float salario=25.0F;// Decimales
            char inicial='J';

            //Ana Alvarez 35 27 21.2 a

            String Nombre2="Ana";
            String Apellido="Alvarez";
            int edad2=35;
            float salario2=27.0F;
            char inicial2 = 'A';

            System.out.println("holo");
            System.out.println(nombre);
            System.out.println(edad);
            System.out.println(salario);
            System.out.println(inicial);

            String estado = "Feliz";
            JOptionPane.showMessageDialog( null , estado);

            String direccion = "";
            direccion = JOptionPane.showInputDialog("Ingrese su direccion");
            System.out.print("direccion");
            JOptionPane.showMessageDialog(null , direccion);

            String salario3 = "";
            salario3 = JOptionPane.showInputDialog("ingrese su salario");
            System.out.print("salario3");
            JOptionPane.showMessageDialog(null,direccion);

            String precio = "";
            int elprecio = 0;
            elprecio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio"));
            System.out.print("precio");
            JOptionPane.showMessageDialog(null,precio);
    }
}
