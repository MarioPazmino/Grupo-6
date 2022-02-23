package modelo;
import java.util.Scanner;


public class Estilista extends Cliente {
	//ATRIBUTOS
	Scanner entrada = new Scanner(System.in);
			private String datoEstlista;
			public String zona;  
			
		public Estilista() {
				datoEstlista=("LLENE LOS DATOS DE SU ESTILISTA PERSONAL");
		}
		
		public Estilista(String pNombre, String pApellido, int pEdad, int pCedula) {
			super(pNombre, pApellido, pApellido, pEdad, pCedula);
			setzona(zona);
	}


	 public void setzona(String zona) {
			this.zona= zona;
		}

		public String getDatoEstlista() {
			return datoEstlista;
		}

		public void setDatoEstlista(String datoEstlista) {
			this.datoEstlista = datoEstlista;
		}	
				
}