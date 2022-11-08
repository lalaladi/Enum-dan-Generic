/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericCell;

/**
 *
 * @author USER
 */
public class CellDriver {
    public static void main(String[] args){
        Cell<Integer> intCell = new Cell();
        Cell<String> stringCell = new Cell<String>();
        intCell.setValue(1);
        stringCell.setValue("One");
        int num = intCell.getValue();
        String str = stringCell.getValue();
        System.out.println("String Value is " + str);
        System.out.println("Integer Value is " + num);
        
        GenericMethod gmc = new GenericMethod();
        Integer[] integerArray = {1,2,3};
        String[] stringArray = {"this","is","..."};
        gmc.printArray(integerArray);
        gmc.printArray(stringArray);
    }
}
