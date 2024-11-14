package retos;

import java.time.LocalDate;
import java.util.Scanner;

public class MismoYear {
	
	public static void mismoYear(LocalDate fecha1, LocalDate fecha2, Scanner sc) {
		
		if(fecha1.getMonth()!=fecha2.getMonth() || fecha1.getDayOfMonth() != fecha2.getDayOfMonth() ) {
			int num = fecha1.getMonth().getValue() - fecha2.getMonth().getValue();
			num = (num<3) ? 4 : num;
			names(num, sc);
		}
	}
	
	public static void names(int num, Scanner sc) {
		
		String min = "";
		String firstAlf = "";		
		String str = "";
		
		for (int i = 0; i < num; i++) {
			System.out.println("Dime un nombre");
			str = sc.nextLine();
			if (i==0) {
				min = str;
				firstAlf = str;
			} else {
				min = (str.length() <= min.length()) ? (str) : (min);
				firstAlf = (firstAlf.compareTo(str)>0) ? (firstAlf) : (str);
			}
		
			
		}
		
		System.out.println("Nombre de tamaño mas pequeño: "+min);
		System.out.println("El primero alfabeticamente es: "+firstAlf);

		System.out.println("Las vocales son: ");
		boolean first = true;
		for (int j = 0; j < str.length(); j++) {
			char chara = str.charAt(j);
			if(chara=='a' || chara=='e' || chara=='i' || chara=='o' || chara=='u') {
				if(first) {
					System.out.print(chara);
				} else {
					System.out.println("-"+chara);
				}
			}
		}
		
	}

}
