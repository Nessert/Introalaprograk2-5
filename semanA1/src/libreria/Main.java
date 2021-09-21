package libreria;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String elnombre = "Ana Alvarez";
        int laedad = 35;
        float elsalario = 27.0F;
        double latemperatura =  21.2;
        char lainicial = 'a';

        String minombre = "Alessandro Rozotto Pardo";
        System.out.println(minombre);

        /*String estado = "Bienvenido al mundo de Java.\n" +
                "\n" +
                "Podrás dar solución a muchos problemas."; //Espacio Direccion*/

        String salario = "";
        salario = JOptionPane.showInputDialog("Introdusca su salario");
        JOptionPane.showMessageDialog(null,salario );
        System.out.println(salario);


    }
}
