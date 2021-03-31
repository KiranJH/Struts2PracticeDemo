/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.struts2;

public class HelloWorld {

    private String message;

    private String userName;
    
    public HelloWorld() {
    }

    public String execute() {
        setMessage("Hello HI!!! " + getUserName());
        return "SUCCESS";
    }

    
    public String getMessage() {
        return message;
    }

    
    public void setMessage(String message) {
        this.message = message;
    }

    
    public String getUserName() {
        return userName;
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

}