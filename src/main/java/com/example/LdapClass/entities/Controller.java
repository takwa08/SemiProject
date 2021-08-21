package com.example.LdapClass.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ldap")
public class Controller {

	@Autowired
	private Service service;
	
	@PostMapping("/add")
	public String create(@RequestBody UtilisateurVO U) {
		return service.create(U);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody UtilisateurVO U) {
		return service.update(U);
	}
	
	@PostMapping("/delete/{uid}")
	public String delete(@PathVariable String uid) {
		return service.delete(uid);
	}
	
	@GetMapping("/findAll")
	public List<Utilisateur> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/findUid/{uid}")
	public Utilisateur finduid(@PathVariable String uid){
		return service.findByIud(uid);
	}
	
	@GetMapping("/findLastname/{Lname}")
	public List<Utilisateur> findlastname(@PathVariable String Lname){
		return service.findByLastName(Lname);
	}
	
	
}
