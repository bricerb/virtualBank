package com.virtualBank;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Brice on 2/17/17.
 */
public class VirtualBankTests {

    @Autowired
    BankRepo banks;

    @Test
    public void bankTest() {
        Bank myBank = new Bank("Test Bank");
        banks.save(myBank);
        Bank newBank = banks.findByName(myBank.getName());
        assertEquals(myBank.getName(), newBank.getName());


    }
}
