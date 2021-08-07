import java.util.*;
import java.util.Scanner;



public class ListasDoblementeEnlazadas {

    
    /**
     * Nodo de la lista.
     */
    static class Nodo {
        int num;
        Nodo LLink; // Enlace izquierdo
        Nodo RLink; // Enlace derecho
    }
    
    static Nodo ptr; // Primer elemento de la lista o raiz/first element in the list
    
     public static void main(String[] args) throws Exception{
        // Mostrar lista inicial
        mostrarLista();
        System.out.println("");
        // Añadir elementos de prueba (0, 2, 3, 4)
        addElem(0);
        addElem(2);
        addElem(3);
        addElem(4);
        
        
        //añadit numeros 
        Scanner entrada=new Scanner(System.in);
        
        int opcion=5;
        int elemento;
        
        do{
            try{
                System.out.println("---menu princpal lista doblemente enlazada------\n"
                +"1.agregar elemento a la lista\n"
                +"2.mostrar la lista fin \n"
                +"3.buscar la lista\n"
                +"4.borrar elemento de la lista(todavia no disponible\n"
                +"4.salir"
                );
                opcion=entrada.nextInt();
                
                switch(opcion){
                    
                    case 1:
                        //agregar elemento /set element in the list
                        System.out.println("escriba el elemento a agregar");
                        elemento=entrada.nextInt();
                        addElem(elemento);
                        break;
                        
                    case 2:
                        //mostrar la lista/ write the list
                        System.out.println("la lista actual es:");
                        mostrarLista();
                        break;
                        
                    case 3:
                        //buscar un elemento/search  for an item
                        System.out.println("Escriba el elemento que quiere buscar");
                        elemento=entrada.nextInt();
                        String resultado=buscarElem(elemento);
                        System.out.println(resultado);
                        break;
                        
                        
                    /*case 4:
                        //eliminar el ultimo elemento/remove the last item
                        System.out.println("Escriba el elemento que quiere eliminar");
                        elemento=entrada.nextInt();
                        resultado=eliminarElem(elemento);
                        System.out.println(resultado);
                        break;
                        
                    */
            
                
                
                };
                
                
            }catch(NumberFormatException n){
                System.out.println("error-opcion incorrecta"+n.getMessage());
            }
            
        }while(opcion!=5);
        
        System.out.println("XXXXXXXX");

        
        // Mostrar de nuevo la lista
      	/**
        * $ 0
        * $ 2
        * $ 3
        * $ 4
        */
        mostrarLista();
    }


    /**
     * Añadir elemento a la lista.
     * @param elem Elemento que sera añadido.
     */
    static void addElem(int elem) {
        Nodo nuevo = new Nodo(); // Crear nuevo nodo

        if (ptr == null) { // Si la lista esta vacía
            nuevo.num = elem;
            ptr = nuevo;
        } else {
          // Si la lista no está vacía la recorremos hasta llegar al final, para agregar el nuevo elemento de último.
            Nodo ant = ptr;
            Nodo p = ptr.RLink;

            while (p!= null) {
                ant = p;
                p = p.RLink;
            }
			
          /**
          * null <-|n|=|ant|-> null
          * =|ant|<-|nuevo|
          * -|nuevo|-> null
          * =|ant|=|nuevo|->null
          */
            if (p == null) {
                nuevo.num = elem;
                nuevo.LLink = ant;
                nuevo.RLink = null;
                ant.RLink = nuevo;
            }
        }
    }

    /**
     * Mostrar en consola los elementos de la lista.
     */
    static void mostrarLista() {
        if (ptr == null) {
            System.out.println("No hay elementos en la lista");
        } else {
            Nodo p = ptr;
            while (p != null) {
                System.out.print(p.num+"<=>");
                
                p=p.RLink;
            }
        
        }
    }
    
    /**
     * Buscar un elemento en la lista.
     * @param elem Elemento que sera buscado.
     * @return Falso si no fue encontrado. Verdadero si fue encontrado.
     */
    static String buscarElem(int elem) {
        Nodo temp = ptr;
        while (temp != null) {
            if (temp.num == elem)
                return "el elemento SI esta en la lista ";
            temp = temp.RLink;
        }
        
        return "el elemento NO esta en la lista";
    }
    
    


    
    
}

    
