
package nodosuno;
import java.util.Scanner;

public class listas {
    nodo primero = new nodo(); //inicio de la lista
    nodo ultimo = new nodo(); //final de la lista
    Scanner teclado = new Scanner(System.in); //leer por consola
    
    public listas(){
        primero = null;
        ultimo = null;
    }
    
    public void insertarnodo(){ //metodo para insertar un nodo
        nodo nuevo = new nodo ();
        System.out.println("ingrese un dato para el nuevo nodo\n");
        nuevo.dato = teclado.nextInt();  //se leera y guardara en 'dato'
        if(primero == null){ //validar si la lista esta vacia o no se ha creado
            primero = nuevo;
            primero.siguiente = null; //el 1er num apunta al siguiente que es 0
            ultimo = nuevo; //el valor agregaro se convertira en el ultimo
            
        }//como el num agregado ya no es null entonces..
        else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
        System.out.println("el nodo ha sido ingresado\n");
    }
    
    public void imprimirlista(){
        nodo actual = new nodo(); //new nodo que permita recorrer la lista
        actual = primero; //que comienze a recorrer desde el inicio
        if(primero != null){ //verificar que existan nodos, para el recorrido
            while(actual !=  null){
                System.out.println(" "+ actual.dato);
                actual = actual.siguiente;
            }
        }
        else{ //si no existen nodos, entonces...
            System.out.println("la lista esta vacia\n");
        }
    }
}
