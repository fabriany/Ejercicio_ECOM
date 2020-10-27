package com.app;

import java.util.Scanner;

import com.app.observer.OFFObservador;
import com.app.observer.SubjectObservado;

public class App {

	public static void main(String[] args) {

		SubjectObservado sub = new SubjectObservado();
		String x = "1";
		String nombre;
		String estado;
		
		new OFFObservador(sub);
	
		
        while(x.equals("1")) {
        	
        	Scanner entradaEscaner = new Scanner (System.in);
        	
			System.out.println ("Nombre: ");
			nombre = entradaEscaner.nextLine (); 	
			
			System.out.println ("Estado: ");
			estado = entradaEscaner.nextLine ();

			sub.AgregarEstado(nombre, estado);
			
			System.out.println ("Ingresar otro estado? Si = 1 o No = 0");
			x =  entradaEscaner.nextLine ();
        }


	}

}
