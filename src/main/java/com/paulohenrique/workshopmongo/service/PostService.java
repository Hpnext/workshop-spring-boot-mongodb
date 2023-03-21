package com.paulohenrique.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulohenrique.workshopmongo.domain.Post;
import com.paulohenrique.workshopmongo.domain.User;
import com.paulohenrique.workshopmongo.repository.PostRepository;
import com.paulohenrique.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {


	@Autowired
	private PostRepository repo;
	
	//public List<User>findAll(){
	//	return repo.findById();
	//}
	public Post findById(String id) {
		Optional<Post>obj = repo.findById(id);
		return obj.orElseThrow(() ->new ObjectNotFoundException("Objeto não encontrado"));
		}
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}
	
	
	
	}
	

