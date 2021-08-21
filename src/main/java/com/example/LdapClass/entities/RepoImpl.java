package com.example.LdapClass.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;

public class RepoImpl implements RepoAdditional{

	@Autowired
	private LdapTemplate ldapTemp ;
	
	@Override
	public String create(Utilisateur U) {
		ldapTemp.create(U);
		return "// SUCCESS ...";
	}

	@Override
	public String update(Utilisateur U) {
		ldapTemp.update(U);
		return "// SUCCESS ...";
	}

}
