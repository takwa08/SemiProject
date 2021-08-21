package com.example.LdapClass.entities;

import javax.naming.Name;
import javax.persistence.Id;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;

@Entry(objectClasses={"intOrgPerson","organisationalPerson","person","top"})
public class Utilisateur {

	@Id
	private Name dn;
	
	@Attribute(name="cn")
	private String fullname;
	
	@Attribute(name="cn")
	private String lastname;
	
	@Attribute(name="cn")
	private String lastname_ar;
	
	@Attribute(name="cn")
	private String fullname_ar;
	
	@Attribute(name="sn")
	private String givenname;
	
	@Attribute(name="description")
	private String description;
	
	@Attribute(name="mail")
	private String mail;
	
	@Attribute(name="uid")
	private String uid;
	
	@Attribute(name="telephoneNumber")
	private String TelephoneNumber;
	
	
	public Name getDn() {
		return dn;
	}
	public String getFullname() {
		return fullname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getLastname_ar() {
		return lastname_ar;
	}
	public String getFullname_ar() {
		return fullname_ar;
	}
	public String getGivenname() {
		return givenname;
	}
	public String getDescription() {
		return description;
	}
	public String getMail() {
		return mail;
	}
	public String getUid() {
		return uid;
	}
	public String getTelephoneNumber() {
		return TelephoneNumber;
	}
	public void setDn(Name dn) {
		this.dn = dn;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setLastname_ar(String lastname_ar) {
		this.lastname_ar = lastname_ar;
	}
	public void setFullname_ar(String fullname_ar) {
		this.fullname_ar = fullname_ar;
	}
	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		TelephoneNumber = telephoneNumber;
	}

	
	
}
