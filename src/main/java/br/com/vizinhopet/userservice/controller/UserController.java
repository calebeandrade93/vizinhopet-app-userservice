package br.com.vizinhopet.userservice.controller;

import br.com.vizinhopet.userservice.DTO.request.PartUserDTO;
import br.com.vizinhopet.userservice.DTO.common.ApiResponseDTO;
import br.com.vizinhopet.userservice.model.User;
import br.com.vizinhopet.userservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@Valid @RequestBody PartUserDTO dto) {

        User user = new User();
        user.setUserFullName(dto.getUserFullName());
        user.setDateBirth(dto.getDateBirth());
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setEmail(dto.getEmail());
        user.setWtsappNumber(dto.getWtsappNumber());

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponseDTO<>("Usuário criado com sucesso", userService.createUser(user)).getData());
    }

}
