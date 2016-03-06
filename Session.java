/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary;


public class Session {
    private String user;
    private String password;
    public void identi(String user, String password){
        this.password = password;
    }
    public String getUser(){
        return this.user;
    }
    public String getPassword(){
        return this.password;
    }
}
