package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Form;
import com.example.demo.repository.FormRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/form")
public class FormController {
	@Autowired
	FormRepository formRepository;
	
	@GetMapping
	public List<Form> getAllForm(){
		return formRepository.findAll();
	}
	
	@PostMapping
	public Form addForm(@RequestBody Form form) {
		return formRepository.save(form);
	}
	
	@DeleteMapping("/{id}")
	public void deleteForm(@PathVariable Long id) {
	    formRepository.deleteById(id);
	}
}
