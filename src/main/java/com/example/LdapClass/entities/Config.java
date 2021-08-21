package com.example.LdapClass.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

@Configuration
@EnableLdapRepositories
public class Config {

	@Bean
	public LdapContextSource ldapContextSource() {
		LdapContextSource LCS = new LdapContextSource();
		LCS.setUrl("ldap://localhost:10389");
		LCS.setBase("dc=MAKTAKM,dc=tn");
		return LCS;
	}
	
	@Bean
	public LdapTemplate ldapTemplate() {
		return new LdapTemplate(ldapContextSource());
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
