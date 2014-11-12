package Boletin76;
// * @author dpazolopez */

import javax.swing.JOptionPane;

public class CondicionSwitch {
    public double superficie; 
    public double lado;
     public double radio;
     public double base;
     public double altura;
     public double PI = 3.14;

     public CondicionSwitch(){
}
     public void Comparar(){

         String opcion;
         opcion = JOptionPane.showInputDialog("***MENU***\n 1 -> Cuadrado.\n 2 -> Triángulo.\n 3 -> Círculo.");
         switch(opcion){
             case "1":
                 String dato = JOptionPane.showInputDialog("Introducir lado");
                 double l = Double.parseDouble(dato);
                 JOptionPane.showMessageDialog(null, "SUperficie del Cuadrado= "+(l*l));
                 break;
             case "2":
                 String dato1 = JOptionPane.showInputDialog("Introducir base");
                 double b = Double.parseDouble(dato1);
                 String dato2 = JOptionPane.showInputDialog("Introducir altura");
                 double a = Double.parseDouble(dato2);
                 JOptionPane.showMessageDialog(null, "Superficie del Triángulo= "+(b*a)/2);
                 break;
             case "3":
                 String dato3 = JOptionPane.showInputDialog("Introducir radio");
                 double r = Double.parseDouble(dato3);
                 JOptionPane.showMessageDialog(null, "Superficie del Círculo= "+ (PI*(r*r)));
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Opción no válida");
        }
}
}