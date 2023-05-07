
package semana1;

import java.util.Scanner;

public class Contadorrec {
	public static void main(String[] args) {
		
		int i, tiempohor, tiempomin, tiemposeg, /*segundos=0, minutos=0, horas=0*/segcont;
		Scanner lec= new Scanner(System.in);
		System.out.println("INGRESE LA HORA LIMITE: ");
		tiempohor=lec.nextInt();
		System.out.println("INGRESE EL MINUTO LIMITE: ");
		tiempomin=lec.nextInt();
		System.out.println("INGRESE EL SEGUNDO LIMITE: ");
		tiemposeg=lec.nextInt();
		int segundos=tiemposeg,minutos=tiempomin,horas=tiempohor;
		segcont=(tiempohor*60)+tiempomin;
		segcont=(segcont*60)+tiemposeg;
		/*
		for(i=0;i<segcont;i++) {
				if(segundos>=60) {
						if(minutos>=60) {
							horas=horas+1;
							minutos=0;	
						}
				   segundos=0;
				   minutos=minutos+1;	
				   
				}
			segundos=segundos+1;
			System.out.println(horas+"-"+minutos+"-"+segundos);
		}
		*/
		for(i=0;i<segcont;i++) {
			System.out.println(horas+"-"+minutos+"-"+segundos);
			if(segundos==0) {
					if(minutos==0) {
						horas=horas-1;
						minutos=60;	
					}
			   segundos=60;
			   minutos=minutos-1;	
			   
			}
		segundos=segundos-1;
		
	    }
		
	}

}
