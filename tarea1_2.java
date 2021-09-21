import javax.swing.*;

public class tarea1_2 {
    public static void main(String[]args){
        String nombre = JOptionPane.showInputDialog("Bienvenido"+"\n"+"Ingrese su nombre completo: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        float salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));

        JOptionPane.showMessageDialog(null,"Su nombre es: "+ nombre + "\n"+ "Su edad es: "+ edad + "\n"+"Su salario es: "+ salario );

    }
}
