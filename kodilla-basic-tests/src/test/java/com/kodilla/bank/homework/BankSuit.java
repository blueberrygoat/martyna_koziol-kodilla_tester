package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankSuit {
    @Test
    public void testBankWhenIsNoTransactions(){
        Bank bank = new Bank();
        assertEquals(0, bank.getBalance());
    }
    @Test
    public void shouldShowBalanceOfAllCashMachines(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.add(100);
        cashMachine1.add(-200);
        cashMachine2.add(300);
        cashMachine2.add(-300);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(-100, bank.getBalance());
    }
    @Test
    public void shouldShowDepositsNumberOfAllCashMachines(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.add(100);
        cashMachine1.add(-200);
        cashMachine2.add(300);
        cashMachine2.add(300);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(3, bank.getNumberOfAllDeposits());
    }

    @Test
    public void shouldShowWithdrawalsNumberOfAllCashMachines(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.add(100);
        cashMachine1.add(-200);
        cashMachine2.add(300);
        cashMachine2.add(300);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(1, bank.getNumberOfAllWithdrawals());

    }
    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        Bank bank = new Bank();
        assertEquals(0, bank.getAverageDeposits(), 0.01);
        assertEquals(0, bank.getAverageWithdrawals(), 0.01);


    }
    @Test
    public void shouldShowAverageOfAllDeposits(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.add(200);
        cashMachine1.add(-100);
        cashMachine2.add(500);
        cashMachine2.add(100);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(266.67, bank.getAverageDeposits(), 0.01);
    }
    @Test
    public void shouldShowAverageOfAllWithdrawals(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.add(100);
        cashMachine1.add(-200);
        cashMachine2.add(-300);
        cashMachine2.add(300);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(-250, bank.getAverageWithdrawals(), 0.01);
    }
}