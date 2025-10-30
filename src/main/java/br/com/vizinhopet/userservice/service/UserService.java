package br.com.vizinhopet.userservice.service;

import br.com.vizinhopet.userservice.exception.EmailAlreadyExistsException;
import br.com.vizinhopet.userservice.model.User;
import br.com.vizinhopet.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new EmailAlreadyExistsException("E-mail já cadastrado");
        }

        return userRepository.save(user);
    }



}
