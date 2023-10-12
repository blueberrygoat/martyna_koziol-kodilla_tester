package com.kodilla.bank.homework;

public class Bank {
    private int size;
    private CashMachine[] cashMachines;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];

    }

    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public int getBalance() {
        if (cashMachines.length == 0) {
            return 0;
        }
        int balance = 0;
        for (int i = 0; i < cashMachines.length; i++)
            balance = cashMachines[i].getBalance() + balance;

        return balance;
    }

    public int getNumberOfAllDeposits() {
        int result = 0;
        for (int i = 0; i < cashMachines.length; i++)
            result = cashMachines[i].getNumberOfDeposits() + result;
        return result;
    }

    public int getNumberOfAllWithdrawals() {
        int result = 0;
        for (int i = 0; i < cashMachines.length; i++)
            result = cashMachines[i].getNumberOfWithdrawals() + result;
        return result;
    }

    public double getAverageDeposits() {
        if (cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++)
            sum = sum + cashMachines[i].getSumDeposits();
        return sum / getNumberOfAllDeposits();
    }

    public double getAverageWithdrawals() {
        if (cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++)
            sum = sum + cashMachines[i].getSumWithdrawals();
        return sum / getNumberOfAllWithdrawals();
    }
}