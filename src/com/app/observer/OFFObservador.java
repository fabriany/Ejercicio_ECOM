package com.app.observer;

import java.util.Date;
import java.util.Optional;

import com.app.vo.Mecanismos;

public class OFFObservador extends Observador{

	public OFFObservador(SubjectObservado sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {

		sujeto.getEstados().stream().forEach(x -> 	
		
			{
			
				if (x.getEstado().toUpperCase().equals("OFF") && x.getFfin() == null) {
					
					x.setFfin(new Date());
					
					Optional<Mecanismos> OptestadoOn = sujeto.getEstados().stream().filter(s -> s.getNombre().equals(x.getNombre()) && s.getEstado().toUpperCase().equals("ON")).findFirst();	
					Mecanismos estadoOn = OptestadoOn.isPresent() ? OptestadoOn.get() : null;
					
					
					System.out.println("ALARM " +  x.getNombre() + " - " + calculartiempo(estadoOn, x));
				}

		
			}); 
			
		} 
	
	
	private long calculartiempo(Mecanismos estadoOn, Mecanismos estadoOff) {
		
		long segundos;
		
		if (estadoOn != null && estadoOff != null) {
			segundos = estadoOff.getFfin().getTime() - estadoOn.getFini().getTime();
		}else {
			segundos = 0;
		}
		return segundos;
	}
	

}
