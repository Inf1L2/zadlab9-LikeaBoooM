/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class zaD4 {
       public static void main(String[] args){
       HashMap<String,String> hm = new HashMap<>();
       hm.put("Dog","Pies");
       hm.put("Cat","Kot");
       hm.put("Apple","Jablko");
       hm.put("Cherry","Wisnia");
       hm.put("Dictionary","Slownik");
       hm.put("Journalist","Dziennikarz");
       hm.put("Thing","Rzecz");
       hm.put("You","Ty");
       hm.put("Be","Byc");
       hm.put("Bee","Osa");
       hm.put("Car","Samochod");
       hm.put("Beach","Plaza");
       hm.put("Unit","Rozdzial");
       hm.put("Part","Czesc");
       hm.put("Party","Impreza");
       hm.put("Vodka","Wodka");
       hm.put("Beer","Piwo");
       hm.put("Shot","Strzal");
       hm.put("Methanol","Metanol");
       hm.put("Hand","Reka");
       hm.put("Koniec","Program stop !");
       
       Scanner x = new Scanner(System.in);
       String slowo;
           System.out.println("Podaj slowo : ");
       
       do{
            slowo = x.nextLine();
            System.out.println(slowo+"-"+hm.get(slowo));
        }while("Koniec".equals(slowo));
}
}
