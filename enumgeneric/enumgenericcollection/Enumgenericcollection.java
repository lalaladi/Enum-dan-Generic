/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumgenericcollection;
/**
 *
 * @author USER
 */
public class Enumgenericcollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ENUMERATION
        AkunType account = AkunType.DEPOSIT;
        System.out.println("Type: "+account
                            + "\nCode: "+ account.getCode()
                            + "\nRate: "+ account.getRate());
    
    }
    
}
