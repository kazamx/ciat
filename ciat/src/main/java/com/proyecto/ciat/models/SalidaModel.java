package com.proyecto.ciat.models;

public class SalidaModel {

	private Long idZonas;
	private String propietario;
	private double diferencia;
	public Long getIdZonas() {
		return idZonas;
	}
	public void setIdZonas(Long idZonas) {
		this.idZonas = idZonas;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public double getDiferencia() {
		return diferencia;
	}
	public void setDiferencia(double diferencia) {
		this.diferencia = diferencia;
	}
	@Override
	public String toString() {
		return "SalidaModel [idZonas=" + idZonas + ", propietario=" + propietario + ", diferencia=" + diferencia + "]";
	}
	
}
