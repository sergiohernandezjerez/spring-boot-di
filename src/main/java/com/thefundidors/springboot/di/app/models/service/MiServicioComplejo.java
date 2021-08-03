package com.thefundidors.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("miServicioComplejo")

public class MiServicioComplejo implements IServicio{
	
	public MiServicioComplejo() {
		
	}
	
	@Override
	public String operacion() {
		return "ejecutando algún proceso importante complicado...";
	}

}
