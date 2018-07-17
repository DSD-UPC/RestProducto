package com.food.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.food.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
	
	List<Producto> findByCodcategoria (int codCategoria);
	Producto findByCodproducto (int codproducto);

}
