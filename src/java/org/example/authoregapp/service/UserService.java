package org.example.authoregapp.service;

import org.example.authoregapp.model.User;

/**
 * Service class for {@link org.example.authoregapp.model.User}
 *
 * @author Rakhat Satybaldy
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
