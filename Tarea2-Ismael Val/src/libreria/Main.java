package libreria;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String nombre = "";
        String apellido = "";
        int edad = 0;
        int sueldo = 0;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo"));

        JOptionPane.showMessageDialog(null,"El nombre es "+ nombre + " "+ apellido);
        JOptionPane.showMessageDialog(null,"La edad es "+ edad);
        JOptionPane.showMessageDialog(null,"El sueldo es "+ sueldo);
        JOptionPane.showMessageDialog(null,"El salario lo puse int por simplicidad, se puede los otros solo es cambiar el parse");
    }
}
