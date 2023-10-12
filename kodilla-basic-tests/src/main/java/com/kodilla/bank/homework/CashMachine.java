package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public int getNumberOfTransactions() {
        if (this.transactions.length == 0) {
            return 0;
        } else {
            return transactions.length;
        }
    }

    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < transactions.length; i++)
            balance = transactions[i] + balance;

        return balance;
    }

    public int getNumberOfDeposits() {
        int result = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (this.transactions[i] > 0) {
                result++;
            }
        }
        return result;
    }

    public int getNumberOfWithdrawals() {
        int result = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                result++;
            }
        }
        return result;
    }

    public double getSumDeposits() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;

        for (int i = 0; i < transactions.length; i++) {
            if (this.transactions[i] > 0) {
                sum = sum + transactions[i];
            }
        }
        return sum;
    }
    public double getSumWithdrawals() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;

        for (int i = 0; i < transactions.length; i++) {
            if (this.transactions[i] < 0) {
                sum = sum + transactions[i];
            }
        }
        return sum;
    }
}