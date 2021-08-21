package com.example.LdapClass.entities;

import java.util.List;

public interface Service {
	public String create (UtilisateurVO UVO) ;
	public String update (UtilisateurVO UVO) ;
	public String delete (String Id) ;
	public List<Utilisateur> findAll();
	public List<Utilisateur> findByLastName( String LName);
	public Utilisateur findByIud (String Id);
}
