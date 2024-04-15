package udla.aquishpe.colasconprioridad;

import java.util.PriorityQueue;


/// Proprity queue ... El de mayor valor tiene menos valides solo se impementa con arboles binarnio rs
// la estructutra bynerry HEAP solo para nodos con punteros
// Prioryty queue usa un array (areglos)
//Hijo de la izquierda es === a el dodle del indice del padre
// Hijo de la derecha ==== hijo de la izquierda +2
// Padre === (indice -1)/2



/// tenr en cuenta que se basa en los arboles  es decir se llena de izquiserd a derecha


public class PriorityQueueE {
    public static void main(String[] args) {

        // Declariacion de l clase priority Queue

        PriorityQueue<Integer>queue=new PriorityQueue<>();
        //Añadir (6.9.8,1,5,6,0,11,10,4)

        queue.add(6);
        queue.add(9);
        queue.add(8);
        queue.add(1);
        queue.add(5);
        queue.add(6);
        queue.add(0);
        queue.add(11);
        queue.add(10);
        queue.add(4);

        System.out.println("Los valores son     "+queue);

        System.out.println("Los valores son     "+queue.poll());


        
        System.out.printf("Los valores nuevos  "+queue);




    }


}

