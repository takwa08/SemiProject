package com.example.LdapClass.entities;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.ldap.support.LdapNameBuilder;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {

	@Autowired
	private Repo Rp;

	@Override
	public String create(UtilisateurVO UVO) {
		Utilisateur U = new Utilisateur();
		U.setDn(LdapNameBuilder.newInstance(UVO.getDn()).build());
		U.setFullname(UVO.getFullname());
		U.setFullname_ar(UVO.getFullname_ar());
		U.setLastname(UVO.getLastname());
		U.setLastname_ar(UVO.getLastname_ar());
		U.setGivenname(UVO.getGivenname());
		U.setMail(UVO.getMail());
		U.setTelephoneNumber(UVO.getTelephoneNumber());
		U.setUid(UVO.getUid());
		System.out.println("1) The operation of creation done successfully ...");
		return Rp.create(U);
	}

	@Override
	public String update(UtilisateurVO UVO) {
		Utilisateur U = new Utilisateur();
		U.setDn(LdapNameBuilder.newInstance(UVO.getDn()).build());
		U.setFullname(UVO.getFullname());
		U.setFullname_ar(UVO.getFullname_ar());
		U.setLastname(UVO.getLastname());
		U.setLastname_ar(UVO.getLastname_ar());
		U.setGivenname(UVO.getGivenname());
		U.setMail(UVO.getMail());
		U.setTelephoneNumber(UVO.getTelephoneNumber());
		U.setUid(UVO.getUid());
		System.out.println("2) The operation of update done successfully ...");
		return Rp.update(U);
	}

	@Override
	public String delete(String Id) {
		Optional<Utilisateur> U = Rp.findOne(LdapQueryBuilder.query().where("uid").is(Id));
		Utilisateur UFound = U.isPresent() ? U.get() : new Utilisateur();
		Rp.delete(UFound);
		System.out.println("3) The delete operation performed successfully ...");
		return "SUCCESS ..";
	}

	@Override
	public List<Utilisateur> findAll() {
		Iterable<Utilisateur> IterCol = Rp.findAll();
		List<Utilisateur> LU = new ArrayList<>();
		for (Utilisateur U : IterCol) {
			LU.add(U);
		}
		System.out.println("4) The findAll operation performed successfully ...");
		return LU;
	}

	@Override
	public List<Utilisateur> findByLastName(String LName) {
		Iterable<Utilisateur> IterCol = Rp.findAll(LdapQueryBuilder.query().where("sn").is(LName));
		List<Utilisateur> LU = new ArrayList<>();
		for (Utilisateur U : IterCol) {
			LU.add(U);
		}
		System.out.println("5) The findByLastName operation performed successfully ...");
		return LU;
	}

	@Override
	public Utilisateur findByIud(String Id) {
		Optional<Utilisateur> U = Rp.findOne(LdapQueryBuilder.query().where("uid").is(Id));
		Utilisateur UFound = U.isPresent() ? U.get() : new Utilisateur();
		System.out.println("6) The findByIud operation performed successfully ...");
		return UFound;
	}

}
