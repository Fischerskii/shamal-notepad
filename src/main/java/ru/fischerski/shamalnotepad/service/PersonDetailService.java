package ru.fischerski.shamalnotepad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.fischerski.shamalnotepad.PersonDetails;
import ru.fischerski.shamalnotepad.db.dao.User;
import ru.fischerski.shamalnotepad.db.repository.UserRepository;

import java.util.Optional;

@Component
public class PersonDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public PersonDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> person = userRepository.findByLogin(username);

        if (person.isEmpty()) {
            throw new UsernameNotFoundException("User not found");
        }
        return new PersonDetails(person.get());
    }
}