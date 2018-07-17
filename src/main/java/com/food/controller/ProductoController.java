package com.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.entity.Producto;
import com.food.repository.ProductoRepository;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@GetMapping("/categoria/{id}")
	public List<Producto> ProductosbyCategoria(@PathVariable("id") int codCategoria){	    		    	
		return productoRepository.findByCodcategoria(codCategoria);
	}	
	 
	@GetMapping("/id/{id}")
	public Producto ProductobyCodigo(@PathVariable("id") int codProducto){
	  	return productoRepository.findByCodproducto(codProducto);
	}

}
