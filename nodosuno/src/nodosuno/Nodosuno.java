
package nodosuno;

import java.util.Scanner;

public class Nodosuno {

    public static void main(String[] args) {
        listas i = new listas();
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        do{
        System.out.println("1. Insertar un nodo");
        System.out.println("2. mostrar lista");
        System.out.println("3. salir\n");
            switch(opcion= sc.nextInt()){
             case 1:
                i.insertarnodo();
             break;
             case 2:
                i.imprimirlista();
                break;
            }
        }while(opcion != 3);
    }
}
        
    
    

