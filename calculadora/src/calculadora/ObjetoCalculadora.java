package calculadora;

import javax.swing.JOptionPane;

public class ObjetoCalculadora {
    
    //Atributos de la clase
    private double numero1,numero2;
    private double resultado = 0;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        if(numero1 <= 0){
            JOptionPane.showMessageDialog(null, "parametros incorrectos ");
            System.exit(0);
            
        }else
            this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        if(numero2 <= 0){
            JOptionPane.showMessageDialog(null, "parametros incorrectos ");
            System.exit(0);
        
        }else
            this.numero2 = numero2;
    }
    
    //Llama a la clase object
    public ObjetoCalculadora() {
        super();
    }
    
    public void calcularSuma (){
        
        JOptionPane.showMessageDialog(null,"La suma es: "+(Math.round(numero1 + numero2)));
    }
    public void calcularResta (){
    
        JOptionPane.showMessageDialog(null,"La resta es: "+(Math.round(numero1 - numero2)));
    }
    public void calcularMultiplicacion (){
    
        JOptionPane.showMessageDialog(null,"La multiplicacion es: "+Math.round(numero1 * numero2));
    }
    public void calcularDivision (){
    
        if (numero2 != 0){
        
            resultado = numero1 / numero2;
            JOptionPane.showMessageDialog(null,"La division es: "+resultado);
        }
    }
    
    public void resultados(){
        
        //muestra la suma de los numeros
        calcularSuma();
        //muestra la resta de los numeros
        calcularResta();
        //muestra la multiplicacion de los numeros
        calcularMultiplicacion();
        //Muestra la division de los numeros
        calcularDivision();
    }
}
