/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.UserManager;
import se.cambio.ics.persistence.User;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class UserFacadeImpl
 */

@Stateless
public class UserServiceImpl implements UserService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    UserManager userService;

    @Override
    public void addUser(User user) throws Exception {
        try {
            userService.addUser(user);
               
        } catch (Exception e) {
            e.printStackTrace();
            //throw new Exception("User Can not be added");
        }
    }

    @Override
    public void updateUser(User user) throws Exception {
        try {
            userService.updateUser(user);
               
        } catch (Exception e) {
            //throw new Exception("User can not be modified");
            DefaultExceptionHandler.reportException(e, "User can not be modified ");
        }
    }

    @Override
    public void removeUserById(int userId) throws Exception {
        try {
            userService.deleteUser(userId);
        } catch (Exception e) {

            //throw new Exception("User can not be deleted");
            DefaultExceptionHandler.reportException(e, "User can not be deleted ");
        }
    }

    @Override
    public User getUserById(int userId) throws Exception {
        try {
            return userService.getUserById(userId);
        } catch (Exception e) {
            //throw new Exception("User can not be retrieved");
            DefaultExceptionHandler.reportException(e, "User can not be retrieved");
        }

        return null;
    }

	@Override
	public User getUserByName(String loginName) throws Exception {
		try {
            return userService.getUserByName(loginName);
        } catch (Exception e) {
            //throw new Exception("User can not be retrieved");
            DefaultExceptionHandler.reportException(e, "User can not be retrieved");
        }

        return null;
	}

	@Override
	public List<User> GetAllUsersList() throws Exception {
		try {
            return userService.GetAllUsersList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
    
}
