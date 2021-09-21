package libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //***Guardar Varaiables e imprimir usando System.out.println***//
        //System.out.println("Hola Mundo");
        /*String nnombre = "Ana Alvarez"; // Cadena de Caracteres
        int nedad = 35; // Entero
        float nsalario = 27.0F; // Decimales
        double ntemperatura = 21.2; // Mas precisión
        char ninicial = 'a';
        System.out.println(nnombre+" "+nedad+" "+nsalario+" "+ntemperatura+" "+ninicial);
        System.out.println();

        String Minombre = "Isaac Salazar Chavarría";
        System.out.println(Minombre);*/

        //***Guardar Varaiables e imprimir usando JOptionPane***//
        //String estado = "Feliz"; //Espacio Direccion
        //JOptionPane.showMessageDialog(null, estado);

        /*String text = "Bienvenido al mundo de Java.\n" +
                "\n" +
                "Podrás dar solución a muchos problemas.";


        String estado = ""; //Espacio Direccion
        estado = JOptionPane.showInputDialog("Ingrese Texto:");
        JOptionPane.showMessageDialog(null, estado);*/

        /*String salariotxt = "";
        salariotxt = JOptionPane.showInputDialog("Ingrese su salario:");
        JOptionPane.showMessageDialog(null, salariotxt);*/

        /*String salarioxd = "";
        int salarioxs = 0;
        salarioxd = JOptionPane.showInputDialog("Ingrese su salario:");
        salarioxs = Integer.parseInt(salarioxd);
        salarioxs = salarioxs*2;
        JOptionPane.showMessageDialog(null, salarioxs);*/

        int numero1 = 0;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer número:"));
        int numero2 = 0;
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo número:"));
        JOptionPane.showMessageDialog(null, numero1+numero2);



    }
}


