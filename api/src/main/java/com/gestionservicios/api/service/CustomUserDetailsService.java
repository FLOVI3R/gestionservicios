package com.gestionservicios.api.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gestionservicios.api.models.alumno;
import com.gestionservicios.api.models.role;

import jakarta.transaction.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private alumnoServiceInterface alumnoService;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        alumno alum = alumnoService.loadAlumnoByEmail(email);
        List authorities = getUserAuthority(alum.getRole());
        return buildUserForAuthentication(alum, authorities);
    }

    private List<GrantedAuthority> getUserAuthority(Set<role> userRoles) {
        Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
        for (role role : userRoles) {
            roles.add(new SimpleGrantedAuthority(role.getRole()));
        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
        return grantedAuthorities;
    }

    private UserDetails buildUserForAuthentication(alumno alum, List<GrantedAuthority> authorities) {
    	return new org.springframework.security.core.userdetails.User(alum.getNombre(), alum.getPassword(),
                true, true, true, true, authorities);
    }
}
