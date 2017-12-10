package com.edu.elte.alkfejl.todolist.services;

import com.edu.elte.alkfejl.todolist.models.User;
import com.edu.elte.alkfejl.todolist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class UserService {
    
    private User user;
    
    @Autowired
    private UserRepository userRepository;
    
    public User register(User user) {
        return this.user = userRepository.save(user);
    }

    public User login(User user) throws UserNotValidException {
        if (isValid(user)) {
            return this.user = userRepository.findByUsername(user.getUsername()).get();
        }
        throw new UserNotValidException();
    }

    private boolean isValid(User user) {
    	return userRepository.findByUsernameAndPassword(user.getUsername(),
    										user.getPassword()).isPresent();
	}

	public boolean isLoggedIn() {
        return user != null;
    }
    
    public User getLoggedInUser() {
        return user;
    }
    
    public void logout() {
        user = null;
    }
}