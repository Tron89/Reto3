package retos;

import java.time.LocalDate;
import java.util.Scanner;

import util.Funciones;

public class Reto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		LocalDate fecha1;
		LocalDate fecha2;
		
		while (true) {
			fecha1 = Funciones.dimeFechaStr("Introduce la primera fecha (día/mes/año): ", sc); 
			fecha2 = Funciones.dimeFechaStr("Introduce la segunda fecha (día/mes/año):", sc);
			if (fecha1.isBefore(fecha2)) {
				break;
			} System.out.println("Incorrecto, intentálo de nuevo.");
		}
		
		if(fecha1.getYear() == fecha1.getYear()) {
			MismoYear.mismoYear(fecha1, fecha2, sc);
		} else {
			// aqui se llamaria a Distinto year
		}
	}

}
