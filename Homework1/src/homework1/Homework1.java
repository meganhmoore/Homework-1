/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author meganmoore
 */
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anagram<Integer>=new Anagram<Integer>();
        Integer arr=MyIntegerAnagram.generateAnagram();
        arr.MyInteger.run();
        Anagram<Character>=new Anagram<Character>();
        Character arr=MyCharacterAnagram.generateAnagram();
        arr.MyCharacterAnagram.run();
        
        BWR flag=new BWR();
        flag.instert();
        flag.run();
        
        Vignere v=new Vignere();
        v.getNames();
        v.encrypt();
    }
    
}
