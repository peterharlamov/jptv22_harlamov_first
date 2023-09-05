/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22_harlamov_first;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Jptv22_harlamov_first {

    public static void main(String[] args) {
        System.out.println("Hello JPTV22");
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        
        System.out.println("Здравствуй! " + firstname + " " + lastname);
    }
    
}
