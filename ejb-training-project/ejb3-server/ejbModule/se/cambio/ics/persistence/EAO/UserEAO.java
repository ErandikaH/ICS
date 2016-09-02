/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.User;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface UserEAO extends GenericEAO<User>{
    
    public User getUser(int userId) throws Exception;
    
    public User getUser(String loginName) throws Exception;

    public List<User> GetAllUsersList()throws Exception;
    
}
