package modelo;

import java.util.Scanner;

import mundo.principal.SalonBellezaP;


public class Servicio extends SalonBellezaP{
	
	Scanner entrada = new Scanner(System.in);

	private String pedicure;
	private String manicure;
	private String lavado;
	private String corteCabello;
	
	
	public Servicio (String pPedicure, String pManicure, String pLavado, String pCorteCbello ) {
		//METODO CONSTRUCTOR SIN PARAMETROS = "";
		pedicure = pPedicure ;
		manicure = pManicure;
		lavado = pLavado;
		corteCabello = pCorteCbello;
	}
	
	public String getPedicure() {
		return pedicure;
	}

	public void setPedicure(String pedicure) {
		this.pedicure = pedicure;
	}

	public String getManicure() {
		return manicure;
	}

	public void setManicure(String manicure) {
		this.manicure = manicure;
	}

	public String getLavado() {
		return lavado;
	}

	public void setLavado(String lavado) {
		this.lavado = lavado;
	}

	public String getCorteCabello() {
		return corteCabello;
	}

	public void setCorteCabello(String corteCabello) {
		this.corteCabello = corteCabello;
	}	

}
