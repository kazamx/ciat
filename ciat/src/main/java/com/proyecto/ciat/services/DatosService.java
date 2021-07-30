package com.proyecto.ciat.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.ciat.models.SalidaModel;
import com.proyecto.ciat.models.UbicacionModel;
import com.proyecto.ciat.models.ZonasModel;
import com.proyecto.ciat.repositories.UbicacionRepository;
import com.proyecto.ciat.repositories.ZonasRepository;

@Service
public class DatosService {
	@Autowired
	ZonasRepository zonasRepository;
	
	@Autowired
	UbicacionRepository ubicacionRepository;
	
	ZonasModel productoModel = new ZonasModel();
	UbicacionModel ubicacionModel = new UbicacionModel();
	
	
	public ArrayList<ZonasModel> obtenerZonas(){
		return (ArrayList<ZonasModel>)zonasRepository.findAll();
	}
	
	public ArrayList<UbicacionModel> obtenerUbicacion(){
		return (ArrayList<UbicacionModel>)ubicacionRepository.findAll();
	}
	
	public ArrayList<SalidaModel> datosSalida(){
		//double radioZona = 0;
		//double radioUbicacion = 0;
		
		ArrayList<ZonasModel> retornarZonas = (ArrayList<ZonasModel>) zonasRepository.findAll();
		
		ArrayList<UbicacionModel> retornarUbicacion = (ArrayList<UbicacionModel>) ubicacionRepository.findAll();
		
		ArrayList<SalidaModel> listaSalida = new ArrayList<SalidaModel>();
		
		double x = 0;
		double y = 0;
		double radioUbicacion = 0;
		
		for(ZonasModel zona: retornarZonas) {
			
			double radioZonas = Math.sqrt(zona.getArea()/3.14);
			
			for(UbicacionModel ubicacion: retornarUbicacion) {
				x = Math.pow(ubicacion.getLat()-zona.getLat(),2);
				y = Math.pow(ubicacion.getLon()-zona.getLon(),2);
				radioUbicacion = Math.sqrt(x+y);
				
				if(radioZonas>=radioUbicacion) {
					System.out.println("El propietario: " +ubicacion.getPropietario()+ 
							" se encuentra en la zona con id: " + zona.getId());
					SalidaModel salidaModel = new SalidaModel();
					salidaModel.setDiferencia(radioZonas-radioUbicacion);
					salidaModel.setIdZonas(zona.getId());
					salidaModel.setPropietario(ubicacion.getPropietario());
					listaSalida.add(salidaModel);
					
				}
				System.out.println("ZONA RADIO: "+ radioZonas + "; UBICACIÓN RADIO: "+ 
						radioUbicacion + "; Para la ubicación: "+ubicacion.getPropietario());
			}
		}
		
		return listaSalida;
	}
	
	public ArrayList<SalidaModel> obtenerPositivos(){
		//double radioZona = 0;
		//double radioUbicacion = 0;
		
		ArrayList<ZonasModel> retornarZonas = (ArrayList<ZonasModel>) zonasRepository.findAll();
		
		ArrayList<UbicacionModel> retornarUbicacion = (ArrayList<UbicacionModel>) ubicacionRepository.findAll();
		
		ArrayList<SalidaModel> listaSalida = new ArrayList<SalidaModel>();
		
		double x = 0;
		double y = 0;
		double radioUbicacion = 0;
		
		for(ZonasModel zona: retornarZonas) {
			
			double radioZonas = Math.sqrt(zona.getArea()/3.14);
			
			for(UbicacionModel ubicacion: retornarUbicacion) {
				x = Math.pow(ubicacion.getLat()-zona.getLat(),2);
				y = Math.pow(ubicacion.getLon()-zona.getLon(),2);
				radioUbicacion = Math.sqrt(x+y);
				
				if(radioZonas<radioUbicacion) {
					System.out.println("El propietario: " +ubicacion.getPropietario()+ 
							" se encuentra en la zona con id: " + zona.getId());
					SalidaModel salidaModel = new SalidaModel();
					salidaModel.setDiferencia(radioZonas-radioUbicacion);
					salidaModel.setIdZonas(zona.getId());
					salidaModel.setPropietario(ubicacion.getPropietario());
					listaSalida.add(salidaModel);
					
				}
				System.out.println("ZONA RADIO: "+ radioZonas + "; UBICACIÓN RADIO: "+ 
						radioUbicacion + "; Para la ubicación: "+ubicacion.getPropietario());
			}
		}
		
		return listaSalida;
	}
		
}
