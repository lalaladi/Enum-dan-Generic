/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumgenericcollection;

/**
 *
 * @author USER
 */
public enum AkunType {
    CURRENT("CU",1.0),
    SAVING("SA",2.0),
    DEPOSIT("DP",0.0);
    
    private String code;
    private double rate;
    private AkunType(String code, double rate){
        this.code = code;
        this.rate = rate;
    }
    public String getCode(){
        return code;
    }
    public double getRate(){
        return rate;
    }
    
     
}

