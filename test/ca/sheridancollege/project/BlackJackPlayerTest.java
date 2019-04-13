/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.BlackJackCard.Suits.*;
import static ca.sheridancollege.project.BlackJackCard.Value.*;
import java.util.ArrayList;
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
public class BlackJackPlayerTest {

    /**
     * Test of calculatePoints method, of class BlackJackPlayer.
     */
    @Test
    public void testCalculatePoints() {
        System.out.println("calculatePoints");
        ArrayList<BlackJackCard> cards = new ArrayList<>();
        cards.add(new BlackJackCard(HEARTS, TEN));
        cards.add(new BlackJackCard(HEARTS, NINE));
        cards.get(0).showRealValue();
        cards.get(1).showRealValue();
        BlackJackPlayer instance = new BlackJackPlayer("test", cards);
        int expResult = 19;
        int result = instance.calculatePoints(cards);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkLoss method, of class BlackJackPlayer.
     */
    @Test
    public void testCheckLossBound() {
        System.out.println("checkLossBound");
        ArrayList<BlackJackCard> cards = new ArrayList<>();
        cards.add(new BlackJackCard(HEARTS, TEN));
        cards.add(new BlackJackCard(HEARTS, NINE));
        cards.add(new BlackJackCard(HEARTS, TWO));
        cards.get(0).showRealValue();
        cards.get(1).showRealValue();
        cards.get(2).showRealValue();
        BlackJackPlayer instance = new BlackJackPlayer("test", cards);
        boolean expResult = false;
        boolean result = instance.checkLoss();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkLoss method, of class BlackJackPlayer.
     */
    @Test
    public void testCheckLossGood() {
        System.out.println("checkLossGood");
        ArrayList<BlackJackCard> cards = new ArrayList<>();
        cards.add(new BlackJackCard(HEARTS, TWO));
        cards.add(new BlackJackCard(HEARTS, TEN));
        cards.get(0).showRealValue();
        cards.get(1).showRealValue();
        BlackJackPlayer instance = new BlackJackPlayer("test", cards);
        boolean expResult = false;
        boolean result = instance.checkLoss();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkLoss method, of class BlackJackPlayer.
     */
    @Test
    public void testCheckLossBad() {
        System.out.println("checkLossBad");
        ArrayList<BlackJackCard> cards = new ArrayList<>();
        cards.add(new BlackJackCard(HEARTS, TEN));
        cards.add(new BlackJackCard(DIAMONDS, TEN));
        cards.add(new BlackJackCard(SPADES, TEN));
        cards.get(1).showRealValue();
        cards.get(0).showRealValue();
        cards.get(2).showRealValue();
        BlackJackPlayer instance = new BlackJackPlayer("test", cards);
        boolean expResult = true;
        boolean result = instance.checkLoss();
        assertEquals(expResult, result);
    }
}
