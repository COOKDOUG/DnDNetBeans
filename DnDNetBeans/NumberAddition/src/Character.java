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

        //Strings
        setName(incCharacterInfo.get("name"));
        setRace(incCharacterInfo.get("race"));
        //Integers
        setRaceHPBonus(incCharacterStats.get("raceHPBonus"));
        setBaseStrength(incCharacterStats.get("strBaseVal"));
        setBaseDexterity(incCharacterStats.get("dexBaseVal"));
        setBaseIntelligence(incCharacterStats.get("intBaseVal"));
        setBaseWisdom(incCharacterStats.get("wisBaseVal"));
        setBaseConstitution(incCharacterStats.get("conBaseVal"));
        setBaseCharisma(incCharacterStats.get("chaBaseVal"));
        //Setting Race Stats
        setRaceStrength(incCharacterStats.get("strBonus"));
        setRaceDexterity(incCharacterStats.get("dexBonus"));
        setRaceIntelligence(incCharacterStats.get("intBonus"));
        setRaceWisdom(incCharacterStats.get("wisBonus"));
        setRaceConstitution(incCharacterStats.get("conBonus"));
        setRaceCharisma(incCharacterStats.get("chaBonus"));
        //Setting Sub-Race Stats
        setSubRaceStrength(incCharacterStats.get("strSRBonus"));
        setSubRaceDexterity(incCharacterStats.get("dexSRBonus"));
        setSubRaceIntelligence(incCharacterStats.get("intSRBonus"));
        setSubRaceWisdom(incCharacterStats.get("wisSRBonus"));
        setSubRaceConstitution(incCharacterStats.get("conSRBonus"));
        setSubRaceCharisma(incCharacterStats.get("chaSRBonus"));

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
    private void setBaseStrength(int incSTR){
        baseSTR = incSTR;
    }
    private void setBaseDexterity(int incDEX){
        baseDEX = incDEX;
    }
    private void setBaseIntelligence(int incINT){
        baseINT = incINT;
    }
    private void setBaseWisdom(int incWIS){
        baseWIS = incWIS;
    }
    private void setBaseConstitution(int incCON){
        baseCON = incCON;
    }
    private void setBaseCharisma(int incCHA){
        baseCHA = incCHA;
    }
    
    // Setting the Racial Stats
    private void setRaceStrength(int incRaceSTR){
        raceSTRBonus = incRaceSTR;
    }
    private void setRaceDexterity(int incRaceDEX){
        raceDEXBonus = incRaceDEX;
    }
    private void setRaceIntelligence(int incRaceINT){
        raceINTBonus = incRaceINT;
    }
    private void setRaceWisdom(int incRaceWIS){
        raceWISBonus = incRaceWIS;
    }
    private void setRaceConstitution(int incRaceCON){
        raceCONBonus = incRaceCON;
    }
    private void setRaceCharisma(int incRaceCHA){
        raceCHABonus = incRaceCHA;
    }
    
    // Setting the Sub-Racial Stats
    private void setSubRaceStrength(int incSubRaceSTR){
        srSTRBonus = incSubRaceSTR;
    }
    private void setSubRaceDexterity(int incSubRaceDEX){
        srDEXBonus = incSubRaceDEX;
    }
    private void setSubRaceIntelligence(int incSubRaceINT){
        srINTBonus = incSubRaceINT;
    }
    private void setSubRaceWisdom(int incSubRaceWIS){
        srWISBonus = incSubRaceWIS;
    }
    private void setSubRaceConstitution(int incSubRaceCON){
        srCONBonus = incSubRaceCON;
    }
    private void setSubRaceCharisma(int incSubRaceCHA){
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
