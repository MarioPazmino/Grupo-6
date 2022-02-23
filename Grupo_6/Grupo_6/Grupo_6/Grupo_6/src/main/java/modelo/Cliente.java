package modelo;

import java.util.Scanner;

import com.mongodb.BasicDBObject;

import mundo.principal.SalonBellezaP;

public class Cliente extends SalonBellezaP {
	//ATRIBUTOS
	Scanner entrada = new Scanner(System.in);
	public String datoCliente;
	public String nombre ;
	public String apellido  ;
	private String genero;  
	private int edad;
	private int cedula;

	public Cliente () { 
		datoCliente = "LOS DATOS A LLENAR SON LOS SIGUIENTES";
	}


	public Cliente ( String pNombre, String pApellido, String pGenero, int pEdad, int pCedula) {
		this.nombre = pNombre;
		this.apellido = pApellido;
		this.genero = pGenero;
		this.edad = pEdad;
		this.cedula = pCedula;
	}

	//Transformo un objecto que me da MongoDB a un Objecto Java
	public Cliente(BasicDBObject dBObjectCliente) {
		this.nombre = dBObjectCliente.getString("nombre");
		this.apellido = dBObjectCliente.getString("apellidos");
		this.genero = dBObjectCliente.getString("genero");
		this.edad = dBObjectCliente.getInt("edad");
		this.cedula = dBObjectCliente.getInt("cedula");
	}

	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public BasicDBObject toDBObjectCliente() {

		// Creamos una instancia BasicDBObject
		BasicDBObject dBObjectCliente = new BasicDBObject();

		dBObjectCliente.append("nombre", this.getNombre());
		dBObjectCliente.append("apellidos", this.getApellido());
		dBObjectCliente.append("edad", this.getEdad());
		dBObjectCliente.append("genero", this.getGenero());
		dBObjectCliente.append("cedula", this.getCedula());

		return dBObjectCliente;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", edad=" + edad
				+ ", cedula=" + cedula + "]";
	}

}