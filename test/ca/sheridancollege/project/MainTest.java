/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IKTCFUUTJFHMX
 */
public class MainTest {
    
    public MainTest() {
    }
    
    /**
     * Test of checkSpecial method, of class PasswordValidator.
     */
    @Test
    public void testCheckPlayerAmountBad() {
        System.out.println("checkPlayerAmountBad");
        int playerTotal = 5;
        boolean expResult = true;
        boolean result = Main.checkPlayerAmount(playerTotal);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkSpecial method, of class PasswordValidator.
     */
    @Test
    public void testCheckPlayerAmountGood() {
        System.out.println("checkPlayerAmountBad");
        int playerTotal = 3;
        boolean expResult = false;
        boolean result = Main.checkPlayerAmount(playerTotal);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkSpecial method, of class PasswordValidator.
     */
    @Test
    public void testCheckPlayerAmountBound() {
        System.out.println("checkPlayerAmountBad");
        int playerTotal = 4;
        boolean expResult = false;
        boolean result = Main.checkPlayerAmount(playerTotal);
        assertEquals(expResult, result);
    }
    
}
