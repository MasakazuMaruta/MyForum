package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Form {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Long number;
	String userId;
	String name;
	String text;
	String date;
}
