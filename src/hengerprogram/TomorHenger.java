/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public class TomorHenger extends MertaniHenger{
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = 1;
    }
   
    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }
    
    public double Suly() {
        return fajsuly*terfogat();
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    } 
   
}
