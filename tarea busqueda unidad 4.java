/*
 * Tarea Unidad 3 
 * 
 * 14/08/2021
 * Uniremington-Desarrollo de sofware 
 */
package tarea_busqueda;

import static java.io.FileDescriptor.in;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 * @author Juan pablo Gonzalez Rodriguez
 */

public class Tarea_busqueda {
    
    //metho 1
    public static boolean counterHash(String word,int option,char a){
        
        HashMap diccionary=new HashMap();
        int suma = 0,numberw=0;
        String vowels="aeiouáéíóúü";
        boolean result=false;
        
        int aux = 0,aux2=0;
        
        //filter
        String word_;
   
        word_=word.toLowerCase();
        
        if(option==1){ 
            diccionary.put(a,0);
            counterHash(word,0,'b');
        }
 
        for(int i=0;i<word.length();i++){
            
            char c = word.charAt (i);
            
            diccionary.put('a',0);
            diccionary.put('e',0);
            diccionary.put('i',0);
            diccionary.put('o',0);
            diccionary.put('u',0);

            boolean isavailable = diccionary.containsKey(c);
            
            if(isavailable){
                
                aux++;             
                
            }else{
                aux2++;
                //diccionary.put(c,0);
            
            }
     
        }
 
        
        if(aux>aux2){
            result=true;
        }
         
        return result;
    };
    
    //method 2
    @SuppressWarnings("empty-statement")
    public static boolean counterI(  String word_){
        
        boolean result=false;
        //int result;
        int numberv,aux,numberw;
        numberv=0;
        numberw=0;
        
        String word,vowels;
        vowels="aeiouáéíóúü";
         
        //filter
        word=word_.toLowerCase();
        
        numberw=word.length();
       
        for (int i=0;i<word.length();i++)
            
            for(int j=0;j<vowels.length();j++)
                
                if(word.charAt(i)==vowels.charAt(j)){
                    numberv++;
               };
            ; 
            
        ;
        
        aux=numberw-numberv;
        
        if(numberv>aux){
          result=true;
        }
       
        return result;
    };
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        //Scanner entrada=new Scanner(System.in);
        
        HashMap diccionary=new HashMap();
        
        //variable menu
        byte option=0;
        String word;
        
        int numberw;
        numberw=0;

        boolean result=false;
        int result2 = 0;
        
        
        char c;
        
        //menu
         do{
             try{
                 
                 option=Byte.parseByte(JOptionPane.showInputDialog("------Menu contador vocales------------\n"
                 +"1.Metodo 1 (con diccionario Hash)\n"
                 +"2.Metodo 2 (con ciclo iterativo)\n"
                 +"0 para salir"
                 ));
                 
                 switch(option){
                     
                     //method  diccionary hash
                     case 1:
                         
                         
                         word=(JOptionPane.showInputDialog("------Menu contador vocales------------\n"
                         +"ingrese la palabra\n"
                         ));
                         
                         numberw=word.length();
                         
                         option=Byte.parseByte(JOptionPane.showInputDialog("------Menu contador vocales------------\n"
                         +"1.buscar las vocales\n"
                         +"2.añadir una palabra a la busqueda\n"
                         ));
                         
                         if(option==1){ 
                             
                            result=counterHash(word,0,'c');  
                         }
                         
                         if(option==2){
                             
                             c=JOptionPane.showInputDialog("------Menu contador vocales------------\n"
                             +"digite la letra a agregar"
                             ).charAt(0);
                             
                            result=counterHash(word,1,c);
                         
                         }
                         
                         JOptionPane.showMessageDialog(null,"-----Menu contador vocales(ciclo iterativo)------\n"
                         +"La palabra o frase "+word+" con "+numberw+" letras en total\n"
                         +"¿Tiene mas vocales que consonantes?: "+result
                         );
                         
                         break;
                      
                     //method 2  iterative cycle 
                     case 2:
                         
                         word=(JOptionPane.showInputDialog("------Menu contador vocales------------\n"
                         +"Ingrese la palabra u oracion\n"
                         ));
                         
                         numberw=word.length();
                         result=counterI(word);
                         
                         JOptionPane.showMessageDialog(null,"-----Menu contador vocales(ciclo iterativo)------\n"
                         +"La palabra o frase "+word+" con "+numberw+" letras en total\n"
                         +"¿Tiene mas vocales que consonantes?: "+result
                         );
                          
                     break;
                 
                 
                 }
                
                 
             }catch(NumberFormatException n){
                 
                JOptionPane.showMessageDialog(null,"error "+n.getMessage(),"error",JOptionPane.ERROR_MESSAGE);
                 
             }
             
         }while(option!=0);
        
        
        
    }
    
    public static int counterfull(String word){
      
        return 0;
   
    };
    
}
