package com.thefundidors.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
//@Primary
public class MiServicio implements IServicio{
	
	public MiServicio() {
		
	}
	
	@Override
	public String operacion() {
		return "ejecutando algún proceso importante simple...";
	}

}
