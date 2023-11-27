/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public class MertaniHenger {
    private static int hengerDb;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static int getHengerDb() {
        return hengerDb;
    }
    
    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    
    public double terfogat(){
        return Math.PI*Math.pow(sugar, 2)*magassag;
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
    
}
