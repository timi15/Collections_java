/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iskolaiosztalyfeldolgozalistaval;

import java.util.Objects;

/**
 *
 * @author Thomas
 */
public class Tanulo {
    private String nev;
    private String nem;
    private String tanuloId;

    public Tanulo(String nev, String nem, String tanuloId) {
        this.nev = nev;
        this.nem = nem;
        this.tanuloId = tanuloId;
    }

    @Override
    public String toString() {
        return "Tanulo{" + "nev=" + nev + ", nem=" + nem + ", tanuloId=" + tanuloId + '}';
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNem() {
        return nem;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public String getTanuloId() {
        return tanuloId;
    }

    public void setTanuloId(String tanuloId) {
        this.tanuloId = tanuloId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.tanuloId);
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
        final Tanulo other = (Tanulo) obj;
        return Objects.equals(this.tanuloId, other.tanuloId);
    }
    
    
    
    
}

