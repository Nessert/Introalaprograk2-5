package Data;

import javax.swing.*;

public class Tarea {
    //Nombre
    String nombre = "";
    nombre = JOptionPane.showInputDialog("Ingrese su nombre");

    //salario
    String salario = "";
    int elsalario = 0;
    int salporcuatro = 0;
    int dedu = 0;
    int porce = 0;
    salario = JOptionPane.showInputDialog("Ingrese el Salario Semanal")
    elsalario = Integer.parseInt(salario);
    salporcuatro = elsalario * 4;
    porce = salporcuatro * 0.0934;
    dedu = salporcuatro - porce;
    JOptionPane.showMessageDialog(null, "Hola"(nombre));




}
