package libreria;


import  javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*System.out.println("Hola mundo");

        String nombre = "Ana Alvarez";
        int edad = 35;
        float salario = 27.0F;
        double temperatura = 21.2;
        char inicial = 'a';
        System.out.println(nombre);*/

        /*String MiNombre = "Ismael Fabian Valverde Artavia";
        String Estado = "Feliz";
        System.out.println(MiNombre);
        JOptionPane.showMessageDialog(null, Estado);*/

        //String mensajeDefault = "Bienvenido al mundo de Java. Podrás dar solución a muchos problemas";
        //JOptionPane.showMessageDialog(null, mensajeDefault);

        /*String direccion = "";
        direccion = JOptionPane.showInputDialog("Ingrese su direccion");
        JOptionPane.showMessageDialog(null, direccion);*/

        String salario1 = "";
        int ElSalario = 0;
        salario1 = JOptionPane.showInputDialog("Ingrese el precio");
        ElSalario = Integer.parseInt(salario1);
        JOptionPane.showMessageDialog(null, salario1);



    }
}
