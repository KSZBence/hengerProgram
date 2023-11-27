/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hengerprogram;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public class HengerProgram {

    /**
     * @param args the command line arguments
     */
    private ArrayList<MertaniHenger> hengerek;
    
    public static void main(String[] args) {
        new HengerProgram().run();
    }

    public HengerProgram() {
        
    }
    
    public double atlagTerfogat(){
        double osszterfogat = 0;
        for (MertaniHenger mertaniHenger : hengerek) {
            osszterfogat += mertaniHenger.terfogat();
        }
        return osszterfogat/MertaniHenger.getHengerDb();
    }
    
    public double csovekSulya(){
        return 1.0;
    }
    
    private ArrayList<MertaniHenger> lista(){
        hengerek = new ArrayList<>();
        hengerek.add(new MertaniHenger(1, 2));
        hengerek.add(new TomorHenger(1, 2));
        hengerek.add(new Cso(1, 2, 3));
        hengerek.add(new Cso(1, 2, 3, 4));
        
        return hengerek;
    }
    
    public void run(){
        lista();
    }
}
