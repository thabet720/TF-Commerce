package com.ecommerce.authentificationService.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User   {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@JsonIgnore
    private String username;
	@JsonIgnore
    private String password;
	@JsonIgnore
    private String role;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }
    
 
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }


    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
               
                '}';
    }
}
