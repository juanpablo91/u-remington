/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //menu
        byte opcion= 0;
        
        //programa 1
        float horas,minutos,segundos;
        
        //programa 2
        float euros,dolares,pesos;
        
        //programa 3
        float kilometros,metros;
        
        
        
        
        do{
            
            opcion=Byte.parseByte(JOptionPane.showInputDialog(
             "MENU PRINCIPAL \n"
            +"1.convertir horas a minutos y segundos\n"
            +"2.convertir euros a pesos COP y Dolares\n"
            +"3.\n"
            +"4.\n"
            +"5.\n"
            +"6.\n"
            +"7.\n"
            +"8.\n"
            +"9.\n"
            ));
            
            switch(opcion){
                
                case 1 -> {
                    horas=Float.parseFloat(JOptionPane.showInputDialog("Ingrese las horas"));
                    
                    minutos=horas*60;
                    segundos=minutos*60;
                    JOptionPane.showMessageDialog(null,"Minutos: "+minutos+"m segundos: "+segundos+"s");
                }
                case 2 -> {
                    euros=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de euros"));
                    
                    dolares=(float) (euros*1.22);
                    pesos=euros*4440;
                    JOptionPane.showMessageDialog(null,"Dolares: "+dolares+" pesos COP: "+pesos);
                                         
                }
                case 3 -> {
                    kilometros=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los kilometros"));
                    
                    metros=(float) (kilometros*1000);
                    JOptionPane.showMessageDialog(null,"Espacio en metros: "+metros);
                    
                }
                case 4 -> {
                }
                    
                case 5 -> {
                }
                    
                case 6 -> {
                }
                
                case 7 -> {
                }
                
                case 8 -> {
                }
                
                case 9 -> {
                }
                
                default ->
                {
                    JOptionPane.showMessageDialog(null,"opcion incorrecta");
                }
                
                
               
                
         
            }
        
        
        }while(opcion!=9);
        
        
        
        
        
    }
    
}
