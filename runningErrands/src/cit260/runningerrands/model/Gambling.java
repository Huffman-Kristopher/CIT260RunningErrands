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
    
    private int betAmount;
    private int betNumbers;
    private int payout;
    private int winningNumbers;

    public int getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    public int getBetNumbers() {
        return betNumbers;
    }

    public void setBetNumbers(int betNumbers) {
        this.betNumbers = betNumbers;
    }

    public int getPayout() {
        return payout;
    }

    public void setPayout(int payout) {
        this.payout = payout;
    }

    public int getWinningNumbers() {
        return winningNumbers;
    }

    public void setWinningNumbers(int winningNumbers) {
        this.winningNumbers = winningNumbers;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.betAmount;
        hash = 97 * hash + this.betNumbers;
        hash = 97 * hash + this.payout;
        hash = 97 * hash + this.winningNumbers;
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
        if (this.betAmount != other.betAmount) {
            return false;
        }
        if (this.betNumbers != other.betNumbers) {
            return false;
        }
        if (this.payout != other.payout) {
            return false;
        }
        if (this.winningNumbers != other.winningNumbers) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gambling{" + "betAmount=" + betAmount + ", betNumbers=" + betNumbers + ", payout=" + payout + ", winningNumbers=" + winningNumbers + '}';
    }

}
