package es.fjmarlop.PizzettAppBackEnd.Controllers;

import es.fjmarlop.PizzettAppBackEnd.Entities.enums.ERole;
import es.fjmarlop.PizzettAppBackEnd.Entities.RoleEntity;
import es.fjmarlop.PizzettAppBackEnd.Entities.UserEntity;
import es.fjmarlop.PizzettAppBackEnd.Models.UserModel;
import es.fjmarlop.PizzettAppBackEnd.Repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class PrincipalController {



    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World Not Secured";
    }
    @GetMapping("/hello2")
    public String hello2() {
        return "Hello World Not Secured again";
    }

    @GetMapping("/helloSeguro")
    public String helloSeguro() {
        return "Hello World secured";
    }

    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@Valid @RequestBody UserModel userModel) {

        Set<RoleEntity> roles = userModel.getRoles().stream()
                .map(rol -> RoleEntity.builder()
                        .name(ERole.valueOf(rol))
                        .build())
                .collect(Collectors.toSet());

        UserEntity userEntity = UserEntity.builder()
                .email(userModel.getEmail())
                .password(userModel.getPassword())
                .username(userModel.getUsername())
                .roles(roles)
                .build();

        userRepository.save(userEntity);

        return ResponseEntity.ok(userEntity);
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam String id){
        userRepository.deleteById(Long.parseLong(id));
        return "Se ha borrado el usuario con id ".concat(id);
    }

    @GetMapping("/users")
    public List<UserEntity> getAllUser(){
        return (List<UserEntity>) userRepository.findAll();
    }
}
