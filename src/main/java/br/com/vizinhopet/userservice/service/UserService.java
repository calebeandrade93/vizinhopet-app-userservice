package br.com.vizinhopet.userservice.service;

import br.com.vizinhopet.userservice.model.User;
import br.com.vizinhopet.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {

        return userRepository.save(user);
    }

}
