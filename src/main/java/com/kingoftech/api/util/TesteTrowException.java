package com.kingoftech.api.util;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.kingoftech.api.entities.Projetos;



public class TesteTrowException {
	
	
	
	public static void main(String[] args) {
		
		
		LocalDateTime dataInicio = LocalDateTime.now().with(LocalTime.MIN);
		LocalDateTime dataFim = LocalDateTime.now().with(LocalTime.MAX);
		
		
		dataInicio.atZone(ZoneId.systemDefault());
		dataFim.atZone(ZoneId.systemDefault());
		
		System.out.println("Data de Inicio:"+dataInicio);
		System.out.println("Data de Fim:"+dataFim);
		
		
	}

}
