package modelo;

import java.util.Scanner;

import mundo.interfaz.Interfaz_Cita;
import mundo.principal.SalonBellezaP;


@SuppressWarnings("unused")
public class CitaPeluqueria extends SalonBellezaP {

	Scanner entrada = new Scanner(System.in);

		//ATRIBUTOS	
		private float turnoCita;
		private String fechaCita;  
		private String area1Cita ;

		
	//
		public CitaPeluqueria(float pTurnoCita, String pArea1Cita, String pFechaCita) {
			turnoCita = pTurnoCita;
			fechaCita=pFechaCita;
			area1Cita = pArea1Cita;
		}


		public float getTurnoCita() {
			return turnoCita;
		}

		public void setTurnoCita(float turnoCita) {
			this.turnoCita = turnoCita;
		}

		public String getFechaCita() {
			return fechaCita;
		}

		public void setFechaCita(String fechaCita) {
			this.fechaCita = fechaCita;
		}

		public void setArea1Cita(String fechaCita) {
			this.fechaCita = area1Cita;
		}
		
}
