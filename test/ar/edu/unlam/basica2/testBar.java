package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;
//import java.util.*;

public class testBar {

	@Test
	public void testeoQueElBarSePuedaAbrirSinClientes() {
		
		BarHomero o = new BarHomero();
		o.abrirBar();
		assertTrue(o.getAbierto());
		
	}

	@Test
	public void testAgregarClientes(){
		
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
		
		BarHomero o = new BarHomero();
		ComparePorEdad compara = new ComparePorEdad();
		
		Cliente cliente1 = new Cliente(25,"Pablo");
		Cliente cliente2 = new Cliente(22,"Juan");
		Cliente cliente3 = new Cliente(18,"Matias");
		
		o.abrirBar(compara);;
		
		o.cargarCliente(cliente1);
		o.cargarCliente(cliente2);
		o.cargarCliente(cliente3);
		
		System.out.println("ORDENADO POR EDAD \n" +o.getLista()); /* Compruebo por consola que esta ordenado por Nombre */
		
		int esperado = 3;
		assertEquals(esperado,(o.getLista().size()));
		
	}
	
	
}
