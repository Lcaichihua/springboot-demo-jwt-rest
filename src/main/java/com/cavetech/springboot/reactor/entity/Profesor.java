package com.cavetech.springboot.reactor.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;

@Entity 
@Table(name = "profesores")
public class Profesor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(length = 60 ,unique = true )
	private String email;
	
	
	private String password;
	
	@Column(length =2000)
	private String foto;
	
	@Column(name = "create-at")
	@Temporal(TemporalType.DATE)
	
	
	
	
	
	

}
