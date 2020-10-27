package com.app.vo;

import java.util.Date;

/**
 * @author fabri
 *
 */

public class Mecanismos {

	public Mecanismos(String nombre, String estado) {
		super();
		this.estado = estado;
		this.nombre = nombre;
		this.fini = new Date();
	}
	private String estado;
	private String nombre;
	private Date fini;
	private Date ffin;
	

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFini() {
		return fini;
	}
	public void setFini(Date fini) {
		this.fini = fini;
	}
	public Date getFfin() {
		return ffin;
	}
	public void setFfin(Date ffin) {
		this.ffin = ffin;
	}
	
	
	
	
}
