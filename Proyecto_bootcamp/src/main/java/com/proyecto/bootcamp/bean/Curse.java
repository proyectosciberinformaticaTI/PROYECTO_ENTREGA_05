package com.proyecto.bootcamp.bean;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "Curse")
public class Curse {
	
	
	private String _id;
	
	
	private String nombre;
	
	
	private  Profesor profesor;
	
	
	
	private List<Students> parents;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Students> getParents() {
		return parents;
	}

	public void setParents(List<Students> parents) {
		this.parents = parents;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}




	
	
	
	
	
	
	
	
}
