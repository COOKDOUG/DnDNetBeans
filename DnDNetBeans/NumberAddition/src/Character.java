/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character;
import java.util.HashMap;

/**
 *
 * @author cookd
 */
public class Character {
    private String name;
    private String race;
    private String subRace;
    
    private int maxHitPoints;
    private int currentHitPoints;
    private int raceHPBonus;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int constitution;
    private int charisma;
    private int level;
    
    // Base Stats
    private int baseSTR;
    private int baseDEX;
    private int baseINT;
    private int baseWIS;
    private int baseCON;
    private int baseCHA;
    
    // Race Bonuses
    private int raceSTRBonus;
    private int raceDEXBonus;
    private int raceINTBonus;
    private int raceWISBonus;
    private int raceCONBonus;
    private int raceCHABonus;
    
    // Sub-Race Stats
    private int srSTRBonus;
    private int srDEXBonus;
    private int srINTBonus;
    private int srWISBonus;
    private int srCONBonus;
    private int srCHABonus;
    private int srHPBonus;
    
    // Temporary Stat Adjustments
    private int tempSTR;
    private int tempDEX;
    private int tempINT;
    private int tempWIS;
    private int tempCON;
    private int tempCHA;
    
    //Constructor
    public Character(HashMap<String, String> incCharacterInfo, HashMap<String, Integer> incCharacterStats){
        setName(incCharacterInfo.get("name"));
        setRace(incCharacterInfo.get("race"));
        setRaceHPBonus(incCharacterStats.get("raceHPBonus"));
    }
    
    //Setting the name
    private void setName(String incName){
        name = incName;
    }
    //Setting the Race
    private void setRace(String incRace){
        race = incRace;
    }
    // Setting Race HP Bonus
    private void setRaceHPBonus(int incRaceHPBonus){
        raceHPBonus = incRaceHPBonus;
    }
    // Setting the base stats
    public void setBaseStrength(int incSTR){
        baseSTR = incSTR;
    }
    public void setBaseDexterity(int incDEX){
        baseDEX = incDEX;
    }
    public void setBaseIntelligence(int incINT){
        baseINT = incINT;
    }
    public void setBaseWisdom(int incWIS){
        baseWIS = incWIS;
    }
    public void setBaseConstitution(int incCON){
        baseCON = incCON;
    }
    public void setBaseCharisma(int incCHA){
        baseCHA = incCHA;
    }
    
    // Setting the Racial Stats
    public void setRaceStrength(int incRaceSTR){
        raceSTRBonus = incRaceSTR;
    }
    public void setRaceDexterity(int incRaceDEX){
        raceDEXBonus = incRaceDEX;
    }
    public void setRaceIntelligence(int incRaceINT){
        raceINTBonus = incRaceINT;
    }
    public void setRaceWisdom(int incRaceWIS){
        raceWISBonus = incRaceWIS;
    }
    public void setRaceConstitution(int incRaceCON){
        raceCONBonus = incRaceCON;
    }
    public void setRaceCharisma(int incRaceCHA){
        raceCHABonus = incRaceCHA;
    }
    
    // Setting the Sub-Racial Stats
    public void setSubRaceStrength(int incSubRaceSTR){
        srSTRBonus = incSubRaceSTR;
    }
    public void setSubRaceDexterity(int incSubRaceDEX){
        srDEXBonus = incSubRaceDEX;
    }
    public void setSubRaceIntelligence(int incSubRaceINT){
        srINTBonus = incSubRaceINT;
    }
    public void setSubRaceWisdom(int incSubRaceWIS){
        srWISBonus = incSubRaceWIS;
    }
    public void setSubRaceConstitution(int incSubRaceCON){
        srCONBonus = incSubRaceCON;
    }
    public void setSubRaceCharisma(int incSubRaceCHA){
        srCHABonus = incSubRaceCHA;
    }
    
    // Setting the stats
    private void setStrength(){
        strength = baseSTR + raceSTRBonus + srSTRBonus + tempSTR;
    }
    private void setDexterity(){
        dexterity = baseDEX + raceDEXBonus + srDEXBonus + tempDEX;
    }
    private void setIntelligence(){
        intelligence = baseINT + raceINTBonus + srINTBonus + tempINT;
    }
    private void setWisdom(){
        wisdom = baseWIS + raceWISBonus + srWISBonus + tempWIS;
    }
    private void setConstitution(){
        constitution = baseCON + raceCONBonus + srCONBonus + tempCON;
    }
    private void setCharisma(){
        charisma = baseCHA + raceCHABonus + srCHABonus + tempCHA;
    }
        
    // Set Hit Points
    private void setMaxHitPoints(){
        maxHitPoints = srHPBonus + maxHitPoints;
    }
 
    
    // Getting the stats
    private int getStrength(){
        return strength;
    }
    private int getDexterity(){
        return dexterity;
    }
    private int getIntelligence(){
        return intelligence;
    }
    private int getWisdom(){
        return wisdom;
    }
    private int getConstitution(){
        return constitution;
    }
    private int getCharisma(){
        return charisma;
    }
   
    // Getting the Maximum Hit Points
    public int getMaxHitPoints(){
        return maxHitPoints;
    }
    public int getCurrentHitPoints(){
        return currentHitPoints;
    }
    
    // Modify Current Hit Points
    public void adjustCurrentHitpoints(int hitPointAdjust){
        currentHitPoints += hitPointAdjust;
    }
}
