package com.paulohenrique.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulohenrique.workshopmongo.domain.User;
import com.paulohenrique.workshopmongo.repository.UserRepository;

@Service
public class UserService {


	@Autowired
	private UserRepository repo;
	public List<User>findAll(){
		return repo.findAll();
	}
}
