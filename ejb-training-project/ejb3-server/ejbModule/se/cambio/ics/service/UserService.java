/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;

import javax.ejb.Remote;

import se.cambio.ics.persistence.User;

/**
 *
 * @author PC
 */

@Remote
public interface UserService {
    
    public void addUser(User user) throws Exception;
	
    public void updateUser(User user) throws Exception;

    public void removeUserById(int userId) throws Exception;

    public User getUserById(int userId) throws Exception;
    
    public User getUserByName(String loginName) throws Exception;
    
    public List<User> GetAllUsersList()throws Exception;
    
}
