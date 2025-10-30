package br.com.vizinhopet.userservice.repository;

import br.com.vizinhopet.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
