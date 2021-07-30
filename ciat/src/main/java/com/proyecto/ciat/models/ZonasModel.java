package com.proyecto.ciat.models;

import javax.persistence.*;
@Entity
@Table(name = "zonas")
public class ZonasModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double lat;
	private double lon;
	private double area;
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
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "ZonasModel [id=" + id + ", lat=" + lat + ", lon=" + lon + ", area=" + area + "]";
	}
		
}
