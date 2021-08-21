package com.example.LdapClass.entities;

import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends LdapRepository<Utilisateur> , RepoAdditional{

}
