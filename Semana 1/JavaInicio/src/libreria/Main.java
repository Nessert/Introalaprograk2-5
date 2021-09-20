package libreria;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hola mundo");
        String nombre = "Anthony Pennant Allen";

        System.out.println(nombre);

        String estado = "Bienvenido al mundo de Java.\n" +
                "\n" +
                "\n" +
                "Podrás dar solución a muchos problemas.";
        //JOptionPane.showMessageDialog(null, estado);
        String tu = "Tu direccion es: ";
        String direc = "";

        direc = JOptionPane.showInputDialog("Ingrese su direccion: ");
        JOptionPane.showMessageDialog(null,tu + direc);

        int eddad = 0;
        eddad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        JOptionPane.showMessageDialog(null,eddad);

        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite su Salario: "));
        JOptionPane.showMessageDialog(null,"Su salario es: "+ salario);



    }
}
