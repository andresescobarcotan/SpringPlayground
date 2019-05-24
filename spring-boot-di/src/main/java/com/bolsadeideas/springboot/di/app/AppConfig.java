package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto pr1 = new Producto("Camara Sony", 100);
		Producto pr2 = new Producto("Bicicleta BMX", 200);
		
		ItemFactura linea1 = new ItemFactura(pr1, 2);
		ItemFactura linea2 = new ItemFactura(pr2, 4);
		
		return Arrays.asList(linea1, linea2);
	}

	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina(){
		Producto pr1 = new Producto("Monitor LG LCD 24", 250);
		Producto pr2 = new Producto("Notebook Asus", 500);
		Producto pr3 = new Producto("Impresora HP Multifuncional", 80);
		Producto pr4 = new Producto("Escritorio Oficina", 300);
		
		ItemFactura linea1 = new ItemFactura(pr1, 2);
		ItemFactura linea2 = new ItemFactura(pr2, 1);
		ItemFactura linea3 = new ItemFactura(pr3, 1);
		ItemFactura linea4 = new ItemFactura(pr4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}

}
