package com.app.observer;


import java.util.ArrayList;
import java.util.List;

import com.app.vo.Mecanismos;

public class SubjectObservado extends Subject {

	
	private List<Observador> observadores = new ArrayList<Observador>();
	private List<Mecanismos> estados = new ArrayList<Mecanismos>();
	

	public void AgregarEstado(String nombre, String estado) {
		
		Mecanismos newEstado = new Mecanismos(nombre,estado);
		this.estados.add(newEstado);
		AlarmaDispositivo();
	}
	
	public List<Mecanismos> getEstados() {
		return estados;
	}

	public void agregar(Observador observador) {
		observadores.add(observador);
	}
	
	public void AlarmaDispositivo() {
		
		observadores.forEach(x -> x.actualizar());
	}
}
