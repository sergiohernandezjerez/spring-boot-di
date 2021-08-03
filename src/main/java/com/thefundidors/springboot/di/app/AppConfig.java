package com.thefundidors.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.thefundidors.springboot.di.app.models.service.IServicio;
import com.thefundidors.springboot.di.app.models.service.MiServicio;
import com.thefundidors.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	@Primary
	public IServicio registrarMIServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registrarMIServicioComplejo() {
		return new MiServicioComplejo();
	}
}
