package com.food.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TP_PRODUCTO")
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codproducto;   
	private String nomproducto;
	private long precio;
	private String descripcorta;
	private String descriplarga;
    private String foto;
	private int codcategoria;
	private int estproducto;
	
	public int getCodproducto() {
		return codproducto;
	}
	public void setCodproducto(int codproducto) {
		this.codproducto = codproducto;
	}
	public String getNomproducto() {
		return nomproducto;
	}
	public void setNomproducto(String nomproducto) {
		this.nomproducto = nomproducto;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	public String getDescripcorta() {
		return descripcorta;
	}
	public void setDescripcorta(String descripcorta) {
		this.descripcorta = descripcorta;
	}
	public String getDescriplarga() {
		return descriplarga;
	}
	public void setDescriplarga(String descriplarga) {
		this.descriplarga = descriplarga;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getCodcategoria() {
		return codcategoria;
	}
	public void setCodcategoria(int codcategoria) {
		this.codcategoria = codcategoria;
	}
	public int getEstproducto() {
		return estproducto;
	}
	public void setEstproducto(int estproducto) {
		this.estproducto = estproducto;
	}
	
	
	
}
