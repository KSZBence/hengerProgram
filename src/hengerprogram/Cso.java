/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public class Cso extends TomorHenger{
    private double falvastagsag;

    public Cso(double falvastagsag, double sugar, double magassag) {
        super(sugar, magassag, 1);
        this.falvastagsag = falvastagsag;
    }

    
    
    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    @Override
    public double terfogat(){
        double kulsohenger = getMagassag()*Math.PI*Math.pow(getSugar(), 2);
        double belsohenger = getMagassag()*Math.PI*Math.pow(getSugar()-falvastagsag, 2);
        return kulsohenger - belsohenger;
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
    
    
}
