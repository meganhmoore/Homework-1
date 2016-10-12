/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vignere;
import static com.sun.org.apache.xml.internal.dtm.Axis.getNames;
import java.util.Scanner;

/**
 *
 * @author meganmoore
 */
public class Vignere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String names=new getNames();
        String encrypted = encrypt(original, key);
        System.out.println(encrypted);
        //System.out.println(decrypt(enc, key));

    }
    pubic String getNames()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your key");
        String key=sc.nextLine();
        return key;
        System.out.println("Please enter your original phrase for encryption");
        String original=sc.nextLine();
        return original;
        
    }
    
    static String encrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
    
}
