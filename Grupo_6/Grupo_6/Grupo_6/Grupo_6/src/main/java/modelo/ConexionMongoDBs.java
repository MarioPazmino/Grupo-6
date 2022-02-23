package modelo;

import java.net.UnknownHostException;
import java.util.ArrayList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import mundo.principal.SalonBellezaP;


public class ConexionMongoDBs extends SalonBellezaP {
	DB BaseDatos;
	DBCollection coleccion;
	BasicDBObject document = new BasicDBObject();
	MongoClient mongoClient = null;

	public DBCollection dbConexionMongo() {

		// PASO 1: Conexión al Server de MongoDB Pasandole el host y el puerto
		try {
			mongoClient = new MongoClient("localhost", 27017);
			System.out.println("Conexión con Mongo satisfactoria");
		} catch (UnknownHostException ex) {
			System.out.println("Exception encontrada: " + ex.getMessage());
		}

		// PASO 2: Conexión a la base de datos
		BaseDatos = mongoClient.getDB("Grupo_6");
		System.out.println("Conexión a la base de datos satisfactoria");

		// PASO 3: Obtenemos una colección para trabajar con ella
		coleccion = BaseDatos.getCollection("SDB");
		return coleccion;	
	}


	// PASO 4.1: "CREATE" -> Metemos los objetos Cliente (o documentos en Mongo) en la coleccion Cliente
	public void createConexionMongo(ArrayList<Cliente> cliente, DBCollection coleccion) {	
		for (Cliente cli : cliente) {
			coleccion.insert(cli.toDBObjectCliente());
		}
		System.out.println("Base de datos creada satisfactoriamente");
	}

	//PASO 4.2: "READ" -> Leemos todos los documentos de la base de datos y los imprimimos
	public void mostrar() {
		DBCursor cursor = coleccion.find();
		try {
			while (cursor.hasNext()) {
				System.out.println(cursor.next().toString());
			}
		} finally {
			cursor.close();
		}
	}

	//UPDATE
	public void updateConexionMongo(DBCollection coleccion) {
		//Actualizamos la edad de los clients. Sumamos 2 años a los jugadores que tengan mas de 18 años
		DBObject find = new BasicDBObject();
		DBObject updated = new BasicDBObject().append("", new BasicDBObject().append("edad", 0));
		coleccion.update(find, updated, false, true);
	}

	//delete	
	public static void delete(DBCollection coleccion) {
		//DELETE
		DBObject findDoc = new BasicDBObject("", true);
		coleccion.remove(findDoc);
}
}