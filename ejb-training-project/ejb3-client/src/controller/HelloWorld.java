/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.Message;

/**
 *
 * @author PC
 */
public class HelloWorld extends ActionSupport{
    
    private Message message;
    
    @Override
    public String execute(){
        setMessage(new Message()); // get data from model
        return SUCCESS;

    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    
}
