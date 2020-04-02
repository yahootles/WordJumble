/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordjumble;

/**
 *
 * @author tiein
 */

import javax.swing.JOptionPane;

public class WordJumble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inWord = JOptionPane.showInputDialog("Please enter a word.");//get input from user
        jumble(inWord,"");//jumble
    }
    
    /**
     * Recursively jumbles a word into all permutations
     * @param word - the word being jumbled
     * @param jumbLet - the letters already jumbled
     */
    public static void jumble(String word, String jumbLet){
        String remainingLetters;
        String originalWord = word;
        String jumbledLetters = jumbLet;
        
        if(word.length() == 1){//output the full jumbled word
            System.out.println(jumbLet + word);
        }else{//otherwise jumble the word
            for(int pos = 0; pos < word.length(); pos++){//go through every remaining letter, add it to the jumbledLetters, 
                //and jumble the remaining word except that letter
                remainingLetters = originalWord.substring(0, pos) + originalWord.substring(pos+1, originalWord.length());//determine remaining letters
                //(word with the letter at pos removed)
                jumble(remainingLetters, jumbledLetters + originalWord.charAt(pos));//add the letter at pos to the jumbled letters, then jumble
            }
        }
    }
    
}
