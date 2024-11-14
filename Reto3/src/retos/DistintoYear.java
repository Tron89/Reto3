package retos;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DistintoYear {

	
	
	public static void calcularMediaYConsonantes(String fechaInicio, String fechaFin) {
        // Calculamos la media de los días mensuales
        double mediaDias = calcularMediaDias(fechaInicio, fechaFin);
        System.out.println("Media de días mensuales: " + mediaDias);

        // Extraemos las consonantes del mes de la segunda fecha
        String mesSegundo = obtenerMesDeFecha(fechaFin);
        String consonantes = obtenerConsonantes(mesSegundo);
        System.out.println("Consonantes del mes de la segunda fecha: " + consonantes);
    }

    // Función que calcula la media de los días mensuales entre dos fechas
    public static double calcularMediaDias(String fechaInicio, String fechaFin) {
        // Definir los días de cada mes en un año no bisiesto
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  // De enero a diciembre
        
        


    }

  

}
