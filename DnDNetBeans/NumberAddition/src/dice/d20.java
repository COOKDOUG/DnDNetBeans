/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

/**
 *
 * @author cookd
 */
public class d20 implements dice{
    @Override
    public int roll() {
	int randomNumber = (int) (Math.random() * 20);
	return Math.max(randomNumber, 1);
    }
    
}
