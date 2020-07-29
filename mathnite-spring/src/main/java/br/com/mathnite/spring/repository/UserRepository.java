package br.com.mathnite.spring.repository;

import br.com.mathnite.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
