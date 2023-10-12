package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CashMachineSuit {
    @Test
    public void testCashMachineWhenIsNoTransactions(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getNumberOfTransactions());
    }
    @Test
    public void shouldShowBalanceOfDepositsAndWithdrawals(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(150);
        cashMachine.add(-150);
        cashMachine.add(30);
        cashMachine.add(0);
        cashMachine.add(20);
        assertEquals(150, cashMachine.getBalance());
    }
    @Test
    public void shouldShowNumberOfWithdrawals(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-100);
        cashMachine.add(300);
        cashMachine.add(100);
        assertEquals(1, cashMachine.getNumberOfWithdrawals());
    }
    @Test
    public void shouldShowNumberOfDeposits(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-100);
        cashMachine.add(300);
        cashMachine.add(100);
        assertEquals(3, cashMachine.getNumberOfDeposits());
    }
    @Test
    public void shouldShowNumberOfDepositsAndWithdrawals(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-100);
        cashMachine.add(-300);
        cashMachine.add(100);
        assertEquals(4, cashMachine.getNumberOfTransactions());
    }
}
