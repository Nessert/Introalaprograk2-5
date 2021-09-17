package libary;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //String nombre = "Ana Alvarez";
        //int edad = 35;
        //float salario = 27f;
        //double temperatura = 21.2;
        //char inicial = 'a';
        //System.out.println(nombre);

        //JOptionPane.showMessageDialog(null, "Bienvenido al mundo de Java."+"\n"+"Podrás dar solución a muchos problemas.");
        float salario = 0f;
        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su salario"));
        JOptionPane.showMessageDialog(null, "Su salario es:"+"\n"+salario);

    }
}
