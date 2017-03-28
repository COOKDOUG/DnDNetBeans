/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import dice.dice;
import dice.d10;

/**
 *
 * @author cookd
 */
public class Fighter implements CharacterClass{
    private int baseHP = 10;
    private dice hitDie = new d10();
}
