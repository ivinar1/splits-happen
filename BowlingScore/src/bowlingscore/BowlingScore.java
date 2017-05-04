/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingscore;

/**
 *
 * @author ilya3_000
 */

import java.util.*;
public class BowlingScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
                
                
                int score = 0;
                int curRoll = 0;
                int spareCount = 0;
                

                System.out.println("Please enter you score ");
                String s = input.next();   
                
                
    
                char [] value = new char [s.length()];
                
                for (int i = 0; i < s.length(); i++){
            
                value[i] = s.charAt(i);// Separate the score into individual value and puts them into their own array
                }
                
                int [] spar = new int [s.length()/2];
                
                 for (int i = 0; i < s.length(); i++){
                     if (value[i] == '-')
                         value[i] = '0';
                 }
               
                for (int i = 0; i < 10; i++){
                  
                    
                    
                        if (value[i] == 'X'){
                         
                           
                        
                        
                            score += 10 + strikeUp(curRoll,value);
                        
                }
                        
                        else if(value[i+1] == '/'){
                              
                        
                        
                          
                                  score += 10 + spareUp(curRoll + 2,value);
                                  curRoll+=2;
                            
                            
                        }    
  
                                               
                        else{
                            if(curRoll <= 18)
                                score += checkVal(value[curRoll]) + checkVal(value[curRoll +1]) ;
                                curRoll+=2;
                           
                        }
                        
                        
                       
                                      
    
    
                
                
               
                
                
    }
                
                System.out.println("Your final score is " + score);
    }
    
    
   public static int strikeUp(int val, char [] checker){
       
   int val1, val2;
       
    if (checker[val + 1] == 'X'){
        val1 = 10;
    }
    
    else{
       val1 = checkVal(checker[val + 1]);
        
    }
    
    if (checker[val + 2] == 'X'){
        val2 = 10;
    }
    
    else if (checker[val + 2] == '/'){
       val2 = 10 - checkVal(checker[val + 1]);
        
    }
    
    else{
       val2 = checkVal(checker[val + 2]);
        
    }
    
    
    
    return val1 + val2;
}
   
   
   public static int spareUp(int val, char [] checker){
       int val1;
       if (checker[val] == 'X'){
        val1 = 10;
    }
       
        else if (checker[val] == '/'){
           val1 = 10 - (checkVal(checker[val]));
       }
       
       else
            val1 = checkVal(checker[val]);
       
       return val1;
   }
   
   
   public static int checkVal(char c){        
       
       int num;
   
       switch(c){
            
            case '0':
                num = 0;
                return num;                                
            case '1':
                num = 1;
                return num;
            case '2':
                num = 2;
                return num;
            case '3':
                num = 3;
                return num;
            case '4':
                num = 4;
               return num;
            case '5':
                num = 5;
                return num;
            case '6':
                num = 6;
                return num;
            case '7':
                num = 7;
                return num;
            case '8':
                num = 8;
                return num;
            default:
                num = 9;
                return num;
   }
}
}


/* if(i+2==10){
                                score += spareUp(curRoll,value);
                                break;


 if (curRoll == 20)
                            score += 10 + spareUp(curRoll+1,value);
                            // curRoll += 2



 if (curRoll < 20){
                                  score += 10 + spareUp(curRoll+2,value);
                                  curRoll += 2;
                            }
                            }*/