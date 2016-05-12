/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kris
 */
public class Investment implements Serializable{
    
    private double investAmount;
    private double investPayout;
    private String investType;
    private double apr;

    public Investment() {
    }

    
    public double getInvestAmount() {
        return investAmount;
    }

    public void setInvestAmount(double investAmount) {
        this.investAmount = investAmount;
    }

    public double getInvestPayout() {
        return investPayout;
    }

    public void setInvestPayout(double investPayout) {
        this.investPayout = investPayout;
    }

    public String getInvestType() {
        return investType;
    }

    public void setInvestType(String investType) {
        this.investType = investType;
    }

    public double getApr() {
        return apr;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.investAmount) ^ (Double.doubleToLongBits(this.investAmount) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.investPayout) ^ (Double.doubleToLongBits(this.investPayout) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.investType);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.apr) ^ (Double.doubleToLongBits(this.apr) >>> 32));
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
        final Investment other = (Investment) obj;
        if (Double.doubleToLongBits(this.investAmount) != Double.doubleToLongBits(other.investAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.investPayout) != Double.doubleToLongBits(other.investPayout)) {
            return false;
        }
        if (Double.doubleToLongBits(this.apr) != Double.doubleToLongBits(other.apr)) {
            return false;
        }
        if (!Objects.equals(this.investType, other.investType)) {
            return false;
        }
        return true;
    }
    
    
    
}
