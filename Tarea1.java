import javax.swing.*;

public class Tarea1 {
    public static void main(String[]args){ 

        String nombre = JOptionPane.showInputDialog("Bienvenido"+"\n"+"Ingrese su nombre: ");
        int salario  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));

        float deduccion = (float)(salario * 0.0934);
        float salarioFinal = salario - deduccion;

        JOptionPane.showMessageDialog(null,"Estimado trabajador" + nombre + ", el salario de este mes se desglosa de la siguiente manera:" + "\n" + "Salario bruto: "+ salario + "\n"+ "Deduccion:"+ deduccion + "\n"+ "Salario Neto: "+ salarioFinal);

    } 
}