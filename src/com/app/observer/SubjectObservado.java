package com.app.observer;


import java.util.ArrayList;
import java.util.List;

import com.app.vo.EstadosMecanismos;

public class SubjectObservado extends Subject {

	
	private List<Observador> observadores = new ArrayList<Observador>();
	private List<EstadosMecanismos> estados = new ArrayList<EstadosMecanismos>();
	

	public void AgregarEstado(String nombre, String estado) {
		
		EstadosMecanismos newEstado = new EstadosMecanismos(nombre,estado);
		this.estados.add(newEstado);
		AlarmaDispositivo();
	}
	
	public List<EstadosMecanismos> getEstados() {
		return estados;
	}

	public void agregar(Observador observador) {
		observadores.add(observador);
	}
	
	public void AlarmaDispositivo() {
		
		observadores.forEach(x -> x.actualizar());
	}
}
