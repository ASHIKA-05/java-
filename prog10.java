3.Write a Java Program to find the largest and smallest word in a string.
Description:
ALGORITHM
STEP 1: START
STEP 2: DEFINE String string="Hardships often prepare ordinary people for an extraordinary destiny"
STEP 3: DEFINE word = " ", small = " ", large = " ".
STEP 4: Make object of String[] words.
STEP 5: SET length =0
STEP 6: string = string + " "
STEP 7: SET i=0. REPEAT STEP 8 to 9 STEP UNTIL i
STEP 8: IF(string.charAt(i) != ' ') then
word =word + string.charAt(i)
else
word[length]=word
length =length + 1
word = " "
STEP 9: i=i+1
STEP 10: small = large =words[0]
STEP 11: SET k = 0. REPEAT STEP 12 to STEP 14 UNTIL k
STEP 12: IF(small.length() > words[k].length())
then
small = words[k]
STEP 13: IF(large.length() < words[k].length())
then
large = words[k]
STEP 14: k = k + 1
STEP 15: PRINT small
STEP 16: PRINT large
STEP 17: END
public class Main  { 
   
  public static void main(String[] args){     
      String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
      String word = "", small = "", large="";    
      String[] words = new String[100];    
      int length = 0;    
      string = string + " ";    
          
      for(int i = 0; i < string.length(); i++){    
          if(string.charAt(i) != ' '){    
              word = word + string.charAt(i);    
          }    
          else{   
              words[length] = word;    
              length++;
              word = "";    
          }    
      }            
      small = large = words[0];    
      for(int k = 0; k < length; k++){    
          if(small.length() > words[k].length())    
              small = words[k];    
          if(large.length() < words[k].length())    
              large = words[k];    
      }    
      System.out.println("Smallest word: " + small);    
      System.out.println("Largest word: " + large);    
  }  }  
  


