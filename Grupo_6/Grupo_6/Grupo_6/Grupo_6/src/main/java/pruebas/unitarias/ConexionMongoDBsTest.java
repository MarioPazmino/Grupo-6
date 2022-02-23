package pruebas.unitarias;

import static org.junit.Assert.*;

import java.net.UnknownHostException;

import org.junit.Test;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

@SuppressWarnings("unused")
public class ConexionMongoDBsTest {
	
	DB BaseDatos;
	DBCollection coleccion;
	BasicDBObject document = new BasicDBObject();
	MongoClient mongoClient = null;

	@Test
	public void testDbConexionMongo() {
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
	}

	@Test
	public void testUpdateConexionMongo() {
		DBObject find = new BasicDBObject("edad", new BasicDBObject("$gt", 18));
		DBObject updated = new BasicDBObject().append("$inc", new BasicDBObject().append("edad", 2));
	}

	@Test
	public void testDelete() {
		DBObject findDoc = new BasicDBObject("", true);
	}

}
