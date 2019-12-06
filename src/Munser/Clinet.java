/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Munser;

/**
 *
 * @author abdo
 */
public class Clinet {

    private long id;
    private String name;
    private String phoneNumber;
    private  static long initID;

    public Clinet() {
        this.id = Clinet.initID;
        Clinet.initID++;
    }
    
    
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     * @return 
     */
    public Clinet setName(String name) {
        this.name = name;
        return this;

    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     * @return 
     */
    public Clinet setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public String toString() {
        return "Clinet{" + "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + '}';
    }

    
        
}
