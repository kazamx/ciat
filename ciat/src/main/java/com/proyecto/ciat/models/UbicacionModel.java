package com.proyecto.ciat.models;

import javax.persistence.*;

@Entity
@Table(name = "ubicacion")
public class UbicacionModel {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private double lat;
		private double lon;
		private String propietario;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public double getLat() {
			return lat;
		}
		public void setLat(double lat) {
			this.lat = lat;
		}
		public double getLon() {
			return lon;
		}
		public void setLon(double lon) {
			this.lon = lon;
		}
		public String getPropietario() {
			return propietario;
		}
		public void setPropietario(String propietario) {
			this.propietario = propietario;
		}
		@Override
		public String toString() {
			return "UbicacionModel [id=" + id + ", lat=" + lat + ", lon=" + lon + ", propietario=" + propietario + "]";
		}
		
		
	
}
