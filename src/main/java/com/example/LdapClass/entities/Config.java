package com.example.LdapClass.entities;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import org.springframework.data.ldap.repository.config.EnableLdapRepositories;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;


@Configuration
@EnableLdapRepositories
@PropertySource("classpath:application.properties")
public class Config {

	 @Autowired
	  

	  

	    @Bean
	    public LdapContextSource contextSource() {
	        LdapContextSource contextSource = new LdapContextSource();
	        contextSource.setUrl("ldap://localhost:10381");
	        contextSource.setBase("dc=exemple,dc=com");
	        contextSource.setUserDn("uid=admin,ou=system");
	        contextSource.setPassword("secret");
	        return contextSource;
	    }

	    @Bean
	    public LdapTemplate ldapTemplate() {
	        return new LdapTemplate(contextSource());
	    }
 
	
	
	@Bean
	public RepoAdditional repoAdditional() {
		return new RepoImpl();
	}
	
	@Bean
	public Service service() {
		return new ServiceImpl();
	}
}
