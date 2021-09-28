package libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double salarioBruto = 0;
        int horasPorMes = 0;
        double salarioBrutoMasBono = 0;
        double salarioNetoFinal = 0;

        JOptionPane.showMessageDialog(null, "Bienvenido al sistema");

        String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre:");

        int añosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese cuántos años ha trabajado para esta empresa:"));
        int horasPorSemana = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de horas laboradas por semana:"));
        int PrecioPorHora = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el precio que se le paga por hora:"));

        horasPorMes = horasPorSemana * 4;
        salarioBruto = horasPorMes * PrecioPorHora;

        if (añosAntiguedad >= 10) {
            salarioBrutoMasBono = salarioBruto + salarioBruto * 0.20;
            salarioNetoFinal = salarioBrutoMasBono;

            if (salarioBrutoMasBono > 1000 && salarioBrutoMasBono < 2000) {
                salarioNetoFinal = salarioBrutoMasBono - salarioBrutoMasBono * 0.10;
            }
            if (salarioBrutoMasBono > 2000) {
                salarioNetoFinal = salarioBrutoMasBono - salarioBrutoMasBono * 0.15;
            }
        }
        JOptionPane.showMessageDialog(null, "Estimado " + nombre + ", su salario neto final es de: " + salarioNetoFinal);
    }
}
