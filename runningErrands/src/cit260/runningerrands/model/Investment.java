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
 * @author Kristopher Huffman and Kirk Brown
 */
public class Investment implements Serializable{
    
    private int investAmount;
    private int investPayout;
    private String investType;
    private int investDays;
    private double apr;
    private int investReturn;

    public int getInvestReturn() {
        return investReturn;
    }

    public int setInvestReturn(int investReturn) {
        this.investReturn = investReturn;
        return investReturn;
    }

    public int getInvestAmount() {
        return investAmount;
    }

    public void setInvestAmount(int investAmount) {
        this.investAmount = investAmount;
    }

    public int getInvestPayout() {
        return investPayout;
    }

    public void setInvestPayout(int investPayout) {
        this.investPayout = investPayout;
    }

    public String getInvestType() {
        return investType;
    }

    public void setInvestType(String investType) {
        this.investType = investType;
    }

    public int getInvestDays() {
        return investDays;
    }

    public void setInvestDays(int investDays) {
        this.investDays = investDays;
    }

    public double getApr() {
        return apr;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.investAmount;
        hash = 79 * hash + this.investPayout;
        hash = 79 * hash + Objects.hashCode(this.investType);
        hash = 79 * hash + this.investDays;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.apr) ^ (Double.doubleToLongBits(this.apr) >>> 32));
        hash = 79 * hash + this.investReturn;
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
        if (this.investAmount != other.investAmount) {
            return false;
        }
        if (this.investReturn != other.investReturn) {
            return false;
        }
        if (this.investPayout != other.investPayout) {
            return false;
        }
        if (this.investDays != other.investDays) {
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
