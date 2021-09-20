package Data;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        /*String nombre = "Ana Alvarez";
        int edad = 35;
        float salario = 27F;
        double temperatura = 21.2;
        char inicial = 'a';
        String nomb = "Manuel Len Alvarado";
        System.out.println(nomb);*/

        //Variable espacio de memoria
        // RAM Ramdom Access Memory
        String estado = "Feliz"; // Espacio Direccion
        JOptionPane.showMessageDialog(null, estado);
        String bienvenido = "Bienvenido al mundo de Java.";
        String podras = "Podrás dar solución a muchos problemas.";
        JOptionPane.showMessageDialog(null, bienvenido);
        JOptionPane.showMessageDialog(null, podras);
        String direccion = "";
        direccion = JOptionPane.showInputDialog("Ingrese su direccion");
        JOptionPane.showMessageDialog(null, direccion);
        String salario = "";
        int elsalario = 0;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
        //Float.parseFloat
        //Double.parseDouble
        JOptionPane.showMessageDialog(null,salario);
        System.out.println(salario);



    }
}
