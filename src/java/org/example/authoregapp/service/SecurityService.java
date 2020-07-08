package org.example.authoregapp.service;

/**
 * Service for Security.
 *
 * @author Rakhat Satybaldy
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
