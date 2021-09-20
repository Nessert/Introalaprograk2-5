package Libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String Nombre = JOptionPane.showInputDialog(null, "Digite su nombre: ") ;
        String Apellido = JOptionPane.showInputDialog(null, "Digite su apellido: ") ;
        int Salario = 0;
        Salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su salario : "));

        JOptionPane.showMessageDialog(null, "El nombre es: " + Nombre);
        JOptionPane.showMessageDialog(null, "El apellido es: " + Apellido);
        JOptionPane.showMessageDialog(null, "El salario es de: " + Salario);


    }
}
