package mx.edu.cesba;

import javax.swing.JOptionPane;

public class Matematicas {
    public static void main(String[] args) {
        
        int opcion,opcion3,numero3;
        float numero1,numero2,opcion2;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"       INGRESE UNA OPCION \n 1. FUNCIONES TRIGONOMETRICAS \n 2. RAICES \n 3. POTENCIAS \n 4. REDONDEOS \n 5. AREA DEL CIRCULO"));
        
        switch(opcion){
            
            case 1: JOptionPane.showMessageDialog(null,"FUNCIONES TRIGONOMETRICAS");
            numero3 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN ANGULO"));
            double r1 =  Math.sin(numero3);
            double r2 = Math.cos(numero3); 
            double r3 = Math.tan(numero3);
            JOptionPane.showMessageDialog(null,"SENO DE "+numero3+": "+String.format("%.4f", r1)+"\nCOSENO DE "+numero3+": "+String.format("%.4f", r2)+"\nTANGENTE DE "+numero3+": "+String.format("%.4f", r3));
            break;
            
            case 2: JOptionPane.showMessageDialog(null,"RAIZ CUADRADA Y CUBICA");
             opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "RAIZ CUADRADA = 1 \nRAIZ CUBICA = 2"));
             
             if(opcion2==1){
            numero1 = Float.parseFloat(JOptionPane.showInputDialog(null, "INGRESE UN NUMERO"));
            double resultado1 = Math.sqrt(numero1);
            JOptionPane.showMessageDialog(null,"SU RESULTADO ES: "+String.format("%.2f",resultado1));
             }else{  
                 
            numero1 = Float.parseFloat(JOptionPane.showInputDialog(null, "INGRESE UN NUMERO"));
            double resultado1 = Math.cbrt(numero1);
            JOptionPane.showMessageDialog(null,"SU RESULTADO ES: "+String.format("%.2f",resultado1));
                 
             }
            break;
            
            case 3: JOptionPane.showMessageDialog(null,"POTENCIAS");
             numero1 = Float.parseFloat(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
             numero2 = Float.parseFloat(JOptionPane.showInputDialog("INGRESE LA POTENCIA"));
             double resultado1 = Math.pow(numero1, numero2);
             JOptionPane.showMessageDialog(null,"EL NUMERO "+numero1+" A LA POTENCIA "+numero2+" ES: "+resultado1);
            break;
            
            case 4: JOptionPane.showMessageDialog(null,"REDONDEOS");
             opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"REDONDEO HACIA ARRIBA = 1 \nREDONDEO HACIA ABAJO = 2 \nREDONDEO MAS CERCANAO = 3"));
             switch(opcion3){
                 case 1: JOptionPane.showMessageDialog(null, "REDONDEO HACIA ARRIBA");
                 numero1 = Float.parseFloat(JOptionPane.showInputDialog(null,"INGRESE UN NUMERO"));
                 double resultado = Math.ceil(numero1);
                 JOptionPane.showMessageDialog(null, "EL REDONDEO HACIA ARRIBA DE SU NUMERO "+numero1+" ES: "+resultado);
                 break;
                 
                 case 2: JOptionPane.showMessageDialog(null, "REDONDEO HACIA ABAJO");
                 numero1 = Float.parseFloat(JOptionPane.showInputDialog(null,"INGRESE UN NUMERO"));
                 double resultado5 = Math.floor(numero1);
                 JOptionPane.showMessageDialog(null, "EL REDONDEO HACIA ABAJO DE SU NUMERO "+numero1+" ES: "+resultado5);
                 break;
                 
                 case 3: JOptionPane.showMessageDialog(null, "REDONDEO MAS CERCANO");
                 numero1 = Float.parseFloat(JOptionPane.showInputDialog(null,"INGRESE UN NUMERO"));
                 resultado = Math.ceil(numero1);
                 JOptionPane.showMessageDialog(null, "EL REDONDEO MAS CERCANO DE SU NUMERO "+numero1+" ES: "+resultado);
                 break;
                 
                 default: JOptionPane.showMessageDialog(null,"NO SE ENCUENTRA ESA OPCION DISPONIBLE");
            }
            break;
            
            case 5: JOptionPane.showMessageDialog(null,"AREA DEL CIRCULO");
             numero1 = Float.parseFloat(JOptionPane.showInputDialog("INGRESE EL RADIO "));
             double resultado2 = Math.PI * Math.pow(numero1,2);
             JOptionPane.showMessageDialog(null,"EL AREA DE SU CIRCULO ES: "+resultado2);
            break;
            
            default: JOptionPane.showMessageDialog(null,"NO SE ENCUENTRA ESA OPCION DISPONIBLE");
        }

    }
}

/**
 * numero aleatorio double aleatorio = Math.random(); System.out.println("Numero
 * aleatorio entre 0 y 1: "+aleatorio);
 */
/**
 * Funciones trigonometricas double angulo = Math.toRadians(45); double seno =
 * Math.sin(angulo); double coseno = Math.cos(angulo); double tangente =
 * Math.tan(angulo); System.out.println("Seno de 45 grados: "+seno);
 * System.out.println("Coseno de 45 grados: "+coseno);
 * System.out.println("Tangente de 45 grados: "+tangente);
 */
/**
 * Raiz cubica double numero = 27; double resultado = Math.cbrt(numero);
 * System.out.println("La raiz cubica del numero "+numero+" es: "+resultado);
 */
/**
 * Raiz cuadrada double numero = 25; double resultado = Math.sqrt(numero);
 * System.out.println("La raiz cuadrada del numero "+numero+" es: "+resultado);
 */
/**
 * Potencias double base = 5; double exponente = 3; double resultado =
 * Math.pow(base, exponente); System.out.println("El numero "+base+" elevado a
 * la potencia "+exponente+" es: "+resultado);
 */
/**
 * Redondeo mas cercano double numero = 5.1; double resultado =
 * Math.round(numero); System.out.println("Redondeo mas cercano del numero
 * "+numero+" es: "+resultado);
 */
/**
 * Redondeo hacia abajo double numero = 5.7; double resultado =
 * Math.floor(numero); System.out.println("Redondeo hacia abajo del numero
 * "+numero+" es: "+resultado);
 */
/**
 * Redondeo arriba double numero = 5.3; double resultado = Math.ceil(numero);
 * System.out.println("Redondeo hacia arriba del numero "+numero+" es:
 * "+resultado);
 */
/**
 * Area de un circulo double radio = 5.0; double area = Math.PI *
 * Math.pow(radio,2); System.out.println("El radio del circulo es: "+radio+" Y
 * su area es: "+area);
 */
