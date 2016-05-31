/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import java.io.Serializable;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class Gambling implements Serializable{
    
    private double cost;
    private double payout;
    private double odds;
    private double lotteryNbr1;
    private double lotteryNbr2;
    private double lotteryNbr3;
    private double lotteryNbr4;
    private double lotteryNbr5;
    private double winningNbr1;
    private double winningNbr2;
    private double winningNbr3;
    private double winningNbr4;
    private double winningNbr5;

    public Gambling() {
    }

    
    
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPayout() {
        return payout;
    }

    public void setPayout(double payout) {
        this.payout = payout;
    }

    public double getOdds() {
        return odds;
    }

    public void setOdds(double odds) {
        this.odds = odds;
    }

    public double getLotteryNbr1() {
        return lotteryNbr1;
    }

    public void setLotteryNbr1(double lotteryNbr1) {
        this.lotteryNbr1 = lotteryNbr1;
    }

    public double getLotteryNbr2() {
        return lotteryNbr2;
    }

    public void setLotteryNbr2(double lotteryNbr2) {
        this.lotteryNbr2 = lotteryNbr2;
    }

    public double getLotteryNbr3() {
        return lotteryNbr3;
    }

    public void setLotteryNbr3(double lotteryNbr3) {
        this.lotteryNbr3 = lotteryNbr3;
    }

    public double getLotteryNbr4() {
        return lotteryNbr4;
    }

    public void setLotteryNbr4(double lotteryNbr4) {
        this.lotteryNbr4 = lotteryNbr4;
    }

    public double getLotteryNbr5() {
        return lotteryNbr5;
    }

    public void setLotteryNbr5(double lotteryNbr5) {
        this.lotteryNbr5 = lotteryNbr5;
    }

    public double getWinningNbr1() {
        return winningNbr1;
    }

    public void setWinningNbr1(double winningNbr1) {
        this.winningNbr1 = winningNbr1;
    }

    public double getWinningNbr2() {
        return winningNbr2;
    }

    public void setWinningNbr2(double winningNbr2) {
        this.winningNbr2 = winningNbr2;
    }

    public double getWinningNbr3() {
        return winningNbr3;
    }

    public void setWinningNbr3(double winningNbr3) {
        this.winningNbr3 = winningNbr3;
    }

    public double getWinningNbr4() {
        return winningNbr4;
    }

    public void setWinningNbr4(double winningNbr4) {
        this.winningNbr4 = winningNbr4;
    }

    public double getWinningNbr5() {
        return winningNbr5;
    }

    public void setWinningNbr5(double winningNbr5) {
        this.winningNbr5 = winningNbr5;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.payout) ^ (Double.doubleToLongBits(this.payout) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.odds) ^ (Double.doubleToLongBits(this.odds) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.lotteryNbr1) ^ (Double.doubleToLongBits(this.lotteryNbr1) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.lotteryNbr2) ^ (Double.doubleToLongBits(this.lotteryNbr2) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.lotteryNbr3) ^ (Double.doubleToLongBits(this.lotteryNbr3) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.lotteryNbr4) ^ (Double.doubleToLongBits(this.lotteryNbr4) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.lotteryNbr5) ^ (Double.doubleToLongBits(this.lotteryNbr5) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.winningNbr1) ^ (Double.doubleToLongBits(this.winningNbr1) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.winningNbr2) ^ (Double.doubleToLongBits(this.winningNbr2) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.winningNbr3) ^ (Double.doubleToLongBits(this.winningNbr3) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.winningNbr4) ^ (Double.doubleToLongBits(this.winningNbr4) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.winningNbr5) ^ (Double.doubleToLongBits(this.winningNbr5) >>> 32));
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
        final Gambling other = (Gambling) obj;
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.payout) != Double.doubleToLongBits(other.payout)) {
            return false;
        }
        if (Double.doubleToLongBits(this.odds) != Double.doubleToLongBits(other.odds)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lotteryNbr1) != Double.doubleToLongBits(other.lotteryNbr1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lotteryNbr2) != Double.doubleToLongBits(other.lotteryNbr2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lotteryNbr3) != Double.doubleToLongBits(other.lotteryNbr3)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lotteryNbr4) != Double.doubleToLongBits(other.lotteryNbr4)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lotteryNbr5) != Double.doubleToLongBits(other.lotteryNbr5)) {
            return false;
        }
        if (Double.doubleToLongBits(this.winningNbr1) != Double.doubleToLongBits(other.winningNbr1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.winningNbr2) != Double.doubleToLongBits(other.winningNbr2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.winningNbr3) != Double.doubleToLongBits(other.winningNbr3)) {
            return false;
        }
        if (Double.doubleToLongBits(this.winningNbr4) != Double.doubleToLongBits(other.winningNbr4)) {
            return false;
        }
        if (Double.doubleToLongBits(this.winningNbr5) != Double.doubleToLongBits(other.winningNbr5)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gambling{" + "cost=" + cost + ", payout=" + payout + ", odds=" + odds + ", lotteryNbr1=" + lotteryNbr1 + ", lotteryNbr2=" + lotteryNbr2 + ", lotteryNbr3=" + lotteryNbr3 + ", lotteryNbr4=" + lotteryNbr4 + ", lotteryNbr5=" + lotteryNbr5 + ", winningNbr1=" + winningNbr1 + ", winningNbr2=" + winningNbr2 + ", winningNbr3=" + winningNbr3 + ", winningNbr4=" + winningNbr4 + ", winningNbr5=" + winningNbr5 + '}';
    }
    
    
}
