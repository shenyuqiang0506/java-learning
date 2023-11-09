import java.util.Random;                                                                              
import java.util.Scanner;                                                                             
                                                                                                      
/*                                                                                                    
???ß’???????????                                                                                            
?ß⁄??? Tom???????????????. ???????, ?????????. ??????¶∆?????????? 0, 1, 2                                                    
0 ??? ?? 1 ??????? 2 ??? ??                                                                                 
?????????? Tom????????????çÀ??, ??? ??????.                                                                          
 */ 
 // ??????,????
public class MoraGame {                                                                               
                                                                                                      
    // ????                                                                                             
    public static void main(String[] args) {                                                          
        // ?????????????                                                                                   
        Tom t = new Tom();                                                                            
        // ??????????????????                                                                                
        int isWinCount = 0;                                                                           
                                                                                                      
        // ?????????????ÔÖ?????????????Tom??????????????????                                                            
        int[][] arr1 = new int[3][3];                                                                 
        int j = 0;                                                                                    
                                                                                                      
        // ????????????ÔÖ??????????????                                                                          
        String[] arr2 = new String[3];                                                                
                                                                                                      
        Scanner scanner = new Scanner(System.in);                                                     
        for (int i = 0; i < 3; i++) {   //????3??                                                              
            // ??????????                                                                                
            System.out.println("????????????????0-????1-??????2-??????");                                           
            int num = scanner.nextInt();                                                              
            t.setTomGuessNum(num);                                                                    
            int tomGuess = t.getTomGuessNum();                                                        
            arr1[i][j + 1] = tomGuess;                                                                
                                                                                                      
            // ???????????                                                                                
            int comGuess = t.computerNum();                                                           
            arr1[i][j + 2] = comGuess;                                                                
                                                                                                      
            // ??????????????????                                                                           
            String isWin = t.vsComputer();                                                            
            arr2[i] = isWin;                                                                          
            arr1[i][j] = t.count;                                                                     
                                                                                                      
            // ?????????????????                                                                            
           System.out.println("=========================================");                           
            System.out.println("????\t??????\t???????\t??????");                                             
            System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + t.vsComputer());
            System.out.println("=========================================");                          
            System.out.println("\n\n");                                                               
            isWinCount = t.winCount(isWin);                                                           
        }                                                                                             
                                                                                                      
        // ????????????????????                                                                               
        System.out.println("????\t??????\t???????\t\t??????");                                               
        for (int a = 0; a < arr1.length; a++) {                                                       
            for (int b = 0; b < arr1[a].length; b++) {                                                
                System.out.print(arr1[a][b] + "\t\t\t");                                              
            }                                                                                         
                                                                                                      
            System.out.print(arr2[a]);                                                                
            System.out.println();                                                                     
        }                                                                                             
        System.out.println("?????" + isWinCount + "??");                                                 
    }                                                                                                 
                                                                                                      
}                                                                                                     

// Tom??
class Tom {     // ???????  
	// ??????????? 
    int tomGuessNum; //0,1,2
	// ????????????
    int comGuessNum; //0,1,2
	// ?????????
    int winCountNum;  
	// ?????????
    int count = 1;   //???????3??                                                                                 
     
	
	public void showInfo() {
		//....
	}
	
    /**                                                                                               
     * ???????????????????????                                                                                 
     * @return                                                                                        
     */                                                                                               
    public int computerNum() {                                                                        
        Random r = new Random();                                                                      
        comGuessNum = r.nextInt(3);      // ???? ???? 0-2???????                                                             
        // System.out.println(comGuessNum);                                                           
        return comGuessNum;                                                                           
    }                                                                                                 
                                                                                                      
    /**                                                                                               
     * ???????????????????                                                                                   
     * @param tomGuessNum                                                                             
     */                                                                                               
    public void setTomGuessNum(int tomGuessNum) {                                                     
        if (tomGuessNum > 2 || tomGuessNum < 0) { 
			//????????, ??????ß’????ß’???
            throw new IllegalArgumentException("???????????");                                             
        }                                                                                             
        this.tomGuessNum = tomGuessNum;                                                               
    }                                                                                                 
                                                                                                      
    public int getTomGuessNum() {                                                                     
        return tomGuessNum;                                                                           
    }                                                                                                 
                                                                                                      
    /**                                                                                               
     * ?????????                                                                                        
     * @return ????????true???????false                                                                    
     */                                                                                               
    public String vsComputer() { 
		 //?????
        if (tomGuessNum == 0 && comGuessNum == 1) {                                                   
            return "?????";                                                                             
        } else if (tomGuessNum == 1 && comGuessNum == 2) {                                            
            return "?????";                                                                             
        } else if (tomGuessNum == 2 && comGuessNum == 0) {                                            
            return "?????";                                                                             
        } else if (tomGuessNum == comGuessNum){                                                       
            return "???";                                                                              
        } else {                                                                                      
            return "??????";                                                                             
        }                                                                                             
    }                                                                                                 
                                                                                                      
    /**                                                                                               
     * ????????????                                                                                       
     * @return                                                                                        
     */                                                                                               
    public int winCount(String s) {                                                                   
        count++;    //??????????                                                                                   
        if (s.equals("?????")) {     //?????????                                                                   
            winCountNum++;                                                                            
        }                                                                                             
        return winCountNum;                                                                           
    }                                                                                                 
                                                                                                      
}                                                                                                     
                                                                                                      