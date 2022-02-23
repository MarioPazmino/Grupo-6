package pruebas.unitarias;

import static org.junit.Assert.*;


import java.util.Scanner;

import org.junit.Test;

@SuppressWarnings("unused")
public class EstilistaTest {
	Scanner entrada = new Scanner(System.in);
	private String datoEstlista;
	public String zona;
	
	@Test
	public void testEstilista() {
		datoEstlista=("LLENE LOS DATOS DE SU ESTILISTA PERSONAL");
	}

	@Test
	public void testSetzona() {
		this.zona= zona;
	}

	@Test
	public void testSetDatoEstlista() {
		this.datoEstlista = datoEstlista;
	}

}
