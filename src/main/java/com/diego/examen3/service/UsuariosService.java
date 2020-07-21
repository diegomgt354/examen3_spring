package com.diego.examen3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.diego.examen3.modelo.Usuarios;
import com.diego.examen3.repo.IUsuarioRepo;

@Service
public class UsuariosService implements UserDetailsService{

	@Autowired
	private IUsuarioRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuarios user = repo.findByUsuario(username);
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		UserDetails userDetails = new User(user.getUsuario(), user.getPassword(), roles);
		return userDetails;
	}

}
