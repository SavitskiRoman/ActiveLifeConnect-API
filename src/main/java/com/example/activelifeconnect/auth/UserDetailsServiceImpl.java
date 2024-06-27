package com.example.activelifeconnect.auth;

import com.example.activelifeconnect.exceptions.NotFoundException;
import com.example.activelifeconnect.user.User;
import com.example.activelifeconnect.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws NotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        if(user.isEmpty()){
            throw new NotFoundException(404L, "User not founded");
        }
        return new CustomUserDetails(user.get());
    }
}
