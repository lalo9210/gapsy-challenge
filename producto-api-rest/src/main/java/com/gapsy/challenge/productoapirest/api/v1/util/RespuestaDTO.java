package com.gapsy.challenge.productoapirest.api.v1.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RespuestaDTO {

	private String estatus;
	private String codigo;
	private Object mensaje;
	private Object resultado;
	
	public void separarMensaje(String codigoConstante) {
		try {
			List<Object> palabras = new ArrayList<>();

			StringTokenizer stringToken = new StringTokenizer(codigoConstante, "|");
			Integer i = 0;
			while (stringToken.hasMoreElements()) {
				palabras.add(i, stringToken.nextElement().toString());
				i += 1;
			}									
			
			this.setMensaje(palabras.get(0).toString());
			this.setEstatus(palabras.get(1).toString());
			this.setCodigo(palabras.get(2).toString());	
						
		} catch (Exception e) {	
			errordefault();
		}
	}

	public void errordefault() {
		this.mensaje = "Fallo al devolver respuesta ADS-API";
		this.estatus = "ERROR";
		this.codigo = "ADSCORE_ERR000";
		this.resultado ="NULL";
	}
	
	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Object getMensaje() {
		return mensaje;
	}

	public void setMensaje(Object mensaje) {
		this.mensaje = mensaje;
	}

	public Object getResultado() {
		return resultado;
	}

	public void setResultado(Object resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "RespuestaDTO [estatus=" + estatus + ", codigo=" + codigo + ", mensaje=" + mensaje + ", resultado="
				+ resultado + "]";
	}

}
