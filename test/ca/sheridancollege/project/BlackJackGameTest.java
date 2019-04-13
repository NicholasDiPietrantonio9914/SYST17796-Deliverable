/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

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
public class BlackJackGameTest {
    
    /**
     * Test of declareWinner method, of class BlackJackGame.
     */
    @Test
    public void testDeclareWinnerBound() {
        System.out.println("declareWinnerBound");
        GroupOfCards gop = new GroupOfCards();
        ArrayList<BlackJackPlayer> players = new ArrayList<>();
        ArrayList<BlackJackCard> cards = new ArrayList<>();
        players.add(new BlackJackPlayer("test", cards));
        players.add(new BlackJackPlayer("test", cards));
        BlackJackGame instance = new BlackJackGame(players, gop);
        instance.declareWinner();
        String expResult = ("Tie game");
        System.out.println(expResult);
    }
    
    /**
     * Test of declareWinner method, of class BlackJackGame.
     */
    @Test
    public void testDeclareWinnerGood() {
        System.out.println("declareWinnerGood");
        GroupOfCards gop = new GroupOfCards();
        ArrayList<BlackJackPlayer> players = new ArrayList<>();
        ArrayList<BlackJackCard> cards = new ArrayList<>();
        players.add(new BlackJackPlayer("test", cards));
        BlackJackGame instance = new BlackJackGame(players, gop);
        instance.declareWinner();
        String expResult = (players.get(0).getPlayerID() + " wins!");
        System.out.println(expResult);
    }
    
    /**
     * Test of declareWinner method, of class BlackJackGame.
     */
    @Test
    public void testDeclareWinnerBad() {
        System.out.println("declareWinnerBad");
        GroupOfCards gop = new GroupOfCards();
        ArrayList<BlackJackPlayer> players = new ArrayList<>();
        ArrayList<BlackJackCard> cards = new ArrayList<>();
        players.add(new BlackJackPlayer("test", cards));
        players.add(new BlackJackPlayer("test", cards));
        players.add(new BlackJackPlayer("test", cards));
        BlackJackGame instance = new BlackJackGame(players, gop);
        instance.declareWinner();
        String expResult = ("Tie game");
        System.out.println(expResult);
    }
    
}
