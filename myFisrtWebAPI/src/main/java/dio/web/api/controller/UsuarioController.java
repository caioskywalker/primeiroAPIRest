package dio.web.api.controller;

import dio.web.api.repositorio.UserReposiTory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import dio.web.api.model.Usuario;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UserReposiTory repository;

    @GetMapping()
    public List<Usuario> getUsers() {
        return repository.findAll();

    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

}