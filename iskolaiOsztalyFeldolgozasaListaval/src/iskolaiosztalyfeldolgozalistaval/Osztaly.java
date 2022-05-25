/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iskolaiosztalyfeldolgozalistaval;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Thomas
 */
public class Osztaly implements Comparable<Osztaly>{
    private String osztalyJel;
    List<Tanulo> tanulok = new ArrayList<>();

    public Osztaly(String osztalyJel) {
        this.osztalyJel = osztalyJel;
    }

    public int létszám(){
        return tanulok.size();
    }
    
    @Override
    public String toString() {
        return "A(z) "+osztalyJel+" osztály létszáma "+létszám()+ " fõ.";
    }

    public String getOsztalyJel() {
        return osztalyJel;
    }

    public void setOsztalyJel(String osztalyJel) {
        this.osztalyJel = osztalyJel;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.osztalyJel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Osztaly other = (Osztaly) obj;
        return Objects.equals(this.osztalyJel, other.osztalyJel);
    }

    @Override
    public int compareTo(Osztaly masik) {
            return this.osztalyJel.compareTo(masik.getOsztalyJel());
    }
    
    
    
}
