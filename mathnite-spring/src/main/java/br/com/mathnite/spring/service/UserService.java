package br.com.mathnite.spring.service;

import br.com.mathnite.spring.dto.UserDto;
import br.com.mathnite.spring.model.User;
import br.com.mathnite.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){

        this.userRepository = userRepository;
    }
    public User save(User user){

        return userRepository.save(user);
    }

    public List<UserDto> findAll() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserDto::new).collect(Collectors.toList());
    }

    public Optional<User> findOne(long id) {
        return userRepository.findById(id);
    }

    public User update(User user) {
        Optional<User> optionalUser = this.findOne(user.getId());

        if (optionalUser.isPresent()) {
            return this.save(user);
        } else {
            return null;
        }
    }
    public void delete(Long id) {
        Optional<User> optionalUser = this.findOne(id);

        if (optionalUser.isPresent()) {
            userRepository.deleteById(id);
        }
    }
}
