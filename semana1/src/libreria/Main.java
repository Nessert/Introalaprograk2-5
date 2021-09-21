package libreria;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*String nombre = "Ana Alvarez";
        int edad = 35;
        float salario = 27F;
        double temperatura = 21.2;
        char inicial = 'a';

        System.out.println(nombre);

        String miNombre = "Kael Bustos Quiros";
        System.out.println(miNombre);

        String estado = "Feliz"; //Espacio Direccion
        JOptionPane.showMessageDialog(null, estado);

        String estado = "Bienvenido al mundo de Java Podrás dar solución a muchos problemas.";
        JOptionPane.showMessageDialog(null, estado);

        String direccion = "";
        direccion = JOptionPane.showInputDialog("Ingrese su direccion");
        JOptionPane.showMessageDialog(null,direccion);

        String salario = "";
        salario = JOptionPane.showInputDialog("Ingrese su salario");
        JOptionPane.showMessageDialog(null,salario);
        System.out.println(salario);*/

        //Tarea de codigo #1


        /*String nombre = "Estimado trabajador Kael, el salario de este mes se desglosa de la siguiente manera:";
        int salarioBruto = 999999;
        float deducciones = 99999.9F;
        double salarioNeto = 999999;

        System.out.println(nombre);
        System.out.println(salarioBruto);
        System.out.println(deducciones);
        System.out.println(salarioNeto);*/

        //Tarea codigo #2

        String nombre = "";
        nombre = showInputDialog("Ingrese su nombre");
        showMessageDialog(null, nombre);

        /*String apellido = "";
        apellido = showInputDialog("Ingrese su apellido");
        showMessageDialog(null, apellido);
        System.out.println(apellido);
        String salario = "";
        salario = showInputDialog("Ingrese su salario");
        showMessageDialog(null, salario);
        System.out.println(salario);*/

        String lectura;
        int apellido;
        double salario;
        lectura = JOptionPane.showInputDialog("Digite su apellido:");
        apellido=Integer.parseInt(lectura);

        lectura = JOptionPane.showInputDialog("Digite su salario:");
        salario=double.parseDouble(lectura);

        JOptionPane.showMessageDialog(null, "El nombre de la persona es:+nombre+De apellido:+apellido+Recibe un salario de:+salario)";





    }
}
