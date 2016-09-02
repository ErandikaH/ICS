/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.persistence.User;
import se.cambio.ics.persistence.EAO.UserEAO;


/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class UserManagerBean implements UserManager {

    /**
     * Default constructor. 
     */
	
    @EJB
    UserEAO userDAO;
	
    public UserManagerBean() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void addUser(User user) throws Exception {
        //create(user);
        userDAO.create(user);
    }

    @Override
    public void updateUser(User user) throws Exception {
        userDAO.update(user);
    }

    @Override
    public void deleteUser(int userId) throws Exception {
        User user = new User();
        user.setUserId(userId);
        userDAO.delete(user);
       
    }

    @Override
    public User getUserById(int userId) throws Exception {
        return (User)userDAO.getUser(userId);
    }

	@Override
	public User getUserByName(String loginName) throws Exception {
		return (User)userDAO.getUser(loginName);
	}
	
	 @Override
	    public List<User> GetAllUsersList() throws Exception {
	        return userDAO.GetAllUsersList();
	    }
    
}
