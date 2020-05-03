/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admapp;


/**
 *
 * @author henriksj
 */
public class Spiller {
   
    private String spillerNavn;
    private int spillerId;
    
    public Spiller(String spillerNavn){
        this.spillerNavn = spillerNavn;
    }
     public Spiller(int spillerId){
        this.spillerId = spillerId;
    }
    
    public String getspillerNavn(){
        return spillerNavn;
    }
    
    public int getspillerId(){
        return spillerId;
    }
    
    
}
