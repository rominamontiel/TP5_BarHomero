package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class testBar {

	@Test
	public void testeoQueElBarSePuedaAbrirSinClientes() {
		
		BarHomero o = new BarHomero();
		o.abrirBar();
		assertTrue(o.getAbierto());
		
	}

	@Test
	public void testAgregarClientesYOrdenarNaturalmente(){
		
		BarHomero o = new BarHomero();
		
		Cliente cliente1 = new Cliente(25,"Pablo");
		Cliente cliente2 = new Cliente(22,"Juan");
		Cliente cliente3 = new Cliente(18,"Matias");
		
		o.abrirBar();
		
		o.cargarCliente(cliente1);
		o.cargarCliente(cliente2);
		o.cargarCliente(cliente3);
		
		System.out.println("ORDENADO POR NOMBRE \n" + o.getLista()); /* Compruebo por consola que esta ordenado por Nombre */
		
		int esperado = 3;
		
		assertEquals(esperado,(o.getLista().size()));
		
		assertEquals("Juan",o.getLista().first().getNombre());
		assertEquals("Pablo",o.getLista().last().getNombre());		
	}
	
	@Test
	public void testNoClientesRepetidos(){
		
		BarHomero o = new BarHomero();
		
		Cliente cliente1 = new Cliente(25,"Pablo");
		Cliente cliente2 = new Cliente(22,"Juan");
		Cliente cliente3 = new Cliente(25,"Pablo");
		
		o.abrirBar();
		
		o.cargarCliente(cliente1);
		o.cargarCliente(cliente2);
		o.cargarCliente(cliente3);
		
		
		int esperado = 2; // Solo 2 distintos
		assertEquals(esperado,(o.getLista().size()));
		
	}
	
	@Test
	public void testAgregarClientesYOrdenarPorEDAD(){
		
		ComparePorEdad comparator = new ComparePorEdad();
		BarHomero o = new BarHomero(comparator);
		
		Cliente cliente1 = new Cliente(30,"Pablo");
		Cliente cliente2 = new Cliente(20,"Juan");
		Cliente cliente3 = new Cliente(40,"Matias");
		
		
		TreeSet<Cliente> lista = new TreeSet<Cliente>(comparator);
		lista.add(cliente1);
		lista.add(cliente2);
		lista.add(cliente3);
		
		o.setLista(lista);
		
		System.out.println("ORDENADO POR EDAD \n" +o.getLista()); /* Compruebo por consola que esta ordenado por EDAD */
		
		Integer menorEdad=20;
		Integer mayorEdad=40;
		assertEquals(menorEdad,o.getLista().first().getEdad());
		assertEquals(mayorEdad,o.getLista().last().getEdad());
		
		
	}
	
	
}
