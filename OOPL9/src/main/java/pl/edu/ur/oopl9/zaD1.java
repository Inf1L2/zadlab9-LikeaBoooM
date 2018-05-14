/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Mati
 */
public class zaD1 {
    public static void main(String[] args){
    Random losujLiczby = new Random(); 
    int[] a = new int[100];
    for(int i=0; i<100;i++){
    
    a[i]=losujLiczby.nextInt(100);
 
    }
    Arrays.sort(a);
    for(int i=0;i<a.length;i++){
        System.out.println(i+"."+a[i]);
}
}
}