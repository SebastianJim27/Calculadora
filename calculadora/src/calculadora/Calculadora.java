package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

        //Crea el objeto
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
        //Se asignan valores a los atributos de la clase
        calculadora.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1")));
        calculadora.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2")));
        //Se ejecutan las operaciones
        calculadora.resultados();
    }
    
}
