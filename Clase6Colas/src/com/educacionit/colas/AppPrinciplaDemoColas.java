package com.educacionit.colas;

import java.util.LinkedList;
import java.util.Queue;

public class AppPrinciplaDemoColas {

	//Las colas en Java no deben utilizarse para alamacenar elmentos que sean null , ya que entonces los mètodo poll() y peek()
	//no funcionaran de manera correcta 
	
	public static void main(String[] args) {
		// creamos una cola
		Queue queue = new LinkedList();

		// eliminar el primer elemento de la cola , si la cola esta vacia genera una
		// NoSuchElementException
		// System.out.println("Remove:" + queue.remove());

		// Usamos el medoto add para añadir elementos a la cola , si algo sale mal
		// lanzara una exception
		queue.add("item1");
		queue.add("item2");

		// Usamos el metodo OFFER para añadir elementos a la cola , Si algo sale mal
		// retornara un valor nulo
		queue.offer("item3");
		queue.offer("item4");

		System.out.println(queue);

		// Eliminar el primer elemento de la cola , si la cola esta vacia genera una
		// NoSuchElementException
		System.out.println("Remove:" + queue.remove());

		System.out.println(queue);

		// Obeserva que elemento esta en el primer puesto de la cola sin eliminarlo
		// si la cola esta vacia genera una NoSuchElementException
		System.out.println("Element() : " + queue.element());

		System.out.println(queue);

		// eliminar el primer elemento de la cola
		// si la cola esta vacia solo retorna un null
		System.out.println("queue.poll() : " + queue.poll());

		System.out.println(queue);
		queue.poll();
		queue.poll();
		
		// Obeserva que elemento esta en el primer puesto de la cola sin eliminarlo
		// si la cola esta vacia solo retorna un null
		System.out.println("peek: " + queue.peek());
		//System.out.println("element: " + queue.element());
		
	

	}

}
