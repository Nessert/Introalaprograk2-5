package libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	    String nombre = "Jose Pablo"; // Cadena de Caracteres
        int edad = 18; // Integer o Entero
        float salario = 25.0F; // Decimales
        double temperatura = 25.6633337; // Más Precision
        char inicial = 'a';

        //Ana Alvarez 35 27 21.2 a

        String elNombre = "Ana Alvarez";
        int edaddeana = 35;
        float salariodeana = 27.0F;
        double temperaturdeaana = 21.2;
        char inicialdeana = 'a';

        System.out.println(elNombre);

        // Nombre completo e imprimir

        String nombreCompleto = "Jose Pablo Durán Madrigal";

        System.out.println(nombreCompleto);

        /*
         Variable espacio de memoria
         RAM Random Acces Memory
         [ OFE456767 ] Nombre String
         Java GC
        */
        String estado = "Feliz"; //Espacio Direccion
        JOptionPane.showMessageDialog(null, estado);

        String mensaje = "Bienvenido al mundo de Java.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Podrás dar solución a muchos problemas.";
        JOptionPane.showMessageDialog(null, mensaje);

        String direccion = "";
        direccion = JOptionPane.showInputDialog("Ingrese su direccion");
        JOptionPane.showMessageDialog(null, direccion);

        // Preguntar salario e imprimir

        int SalarioUsuario = 0;
        SalarioUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Salario"));
        JOptionPane.showMessageDialog(null,SalarioUsuario);
    }
}
