package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funciones {

	public static boolean esInt(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean esDoble(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static int dimeEntero(String inStart, Scanner scanner) {
		while (true) {
			System.out.println(inStart);
			String str = scanner.nextLine();
			if(esInt(str)) {
				return Integer.parseInt(str);
			}
			System.out.println("No es un numero");
		}
	}

	public static double dimeDouble(String inStart, Scanner scanner) {
		while (true) {
			System.out.println(inStart);
			String str = scanner.nextLine();
			if(esDoble(str)) {
				return Double.parseDouble(str);
			}
			System.out.println("No es un numero");
		}
	}
	
	public static LocalDate dimeFechaStr(String inStart, Scanner scanner) {
		while (true) {
			System.out.println(inStart);
			String str = scanner.nextLine();
			DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				return LocalDate.parse(str, formato1);
			} catch (Exception e) {
				System.out.println("Error, pon una fecha valida");
			}
		}
	}
	
	public static LocalDate dimeFechaInt(Scanner sc) {
		while (true) {
			int dia = Funciones.dimeEntero("Dime dia", sc);
			int mes = Funciones.dimeEntero("Dime mes", sc);
			int year = Funciones.dimeEntero("Dime año", sc);
			try {
				return LocalDate.of(year, mes, dia);
			} catch (Exception e) {
				System.out.println("Fecha no valida");
			}
		}
	}
	
}
