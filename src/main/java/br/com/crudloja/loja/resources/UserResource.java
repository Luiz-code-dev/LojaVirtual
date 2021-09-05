package br.com.crudloja.loja.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crudloja.loja.entities.User;




@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	/*Controladores Rest */
	
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Luiz", "luiz.dev.melo@gmail.com", "99999999", "123456");
		return ResponseEntity.ok().body(u);
	}

}
