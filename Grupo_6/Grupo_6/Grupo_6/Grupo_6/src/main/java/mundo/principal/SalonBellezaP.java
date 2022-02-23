package mundo.principal;

import java.util.ArrayList;

import com.mongodb.DBCollection;

import modelo.CitaPeluqueria;
import modelo.Cliente;
import modelo.ConexionMongoDBs;
import modelo.Estilista;
import modelo.Servicio;
import mundo.interfaz.InterfazSalon;

@SuppressWarnings("unused")
public class SalonBellezaP {
	
	public static void main(String[] args) {	
		
		InterfazSalon ventana=new InterfazSalon();
		ventana.setVisible(true);
		
	ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	
		cliente.add(new Cliente("Natahaly", "Pastuña", "F", 499,1515645032));
		cliente.add(new Cliente("Mario", "Pazmiño", "M", 500,1515645032));
		cliente.add(new Cliente("Dayana", "Vergara", "F", 502,1721665287));
		
		ConexionMongoDBs conexion = new ConexionMongoDBs(); 
		DBCollection coleccion = conexion.dbConexionMongo();
		conexion.createConexionMongo(cliente, coleccion);
		conexion.updateConexionMongo(coleccion);
		conexion.mostrar();
		ConexionMongoDBs.delete(coleccion);
		}
}
      