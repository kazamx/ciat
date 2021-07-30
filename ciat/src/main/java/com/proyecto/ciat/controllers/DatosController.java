package com.proyecto.ciat.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.ciat.models.SalidaModel;
import com.proyecto.ciat.models.UbicacionModel;
import com.proyecto.ciat.models.ZonasModel;
import com.proyecto.ciat.services.DatosService;

@RestController
@RequestMapping("/ciat")
public class DatosController {

	@Autowired
	DatosService datosService;
	
	@RequestMapping("/deforestacion")
	public ArrayList<SalidaModel> obtenerUbicacion(){
		return datosService.datosSalida();
	}
	
	@RequestMapping("/positivos")
	public ArrayList<SalidaModel> obtenerPositivos(){
		return datosService.obtenerPositivos();
	}
	
	/*
	@GetMapping()
	public ArrayList<ZonasModel> obtenerZonas(){
		return datosService.datosSalida();
	}
	*/
	
}
