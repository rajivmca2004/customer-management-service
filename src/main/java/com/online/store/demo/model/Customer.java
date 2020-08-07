package com.online.store.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author rasrivastava
 *
 */
@SuppressWarnings("unused")
@Entity
public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;
    
    @Column
    private String email;
    
    public Customer() {
		super();
	}

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
    
}