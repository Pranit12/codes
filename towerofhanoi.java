import java.io.*;
import java.util.*;
    
public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int t1id= scn.nextInt();     
        int t2id= scn.nextInt();     
        int t3id= scn.nextInt();  
        
        toh(n, t1id, t2id, t3id);
        
    }
    
/*For Char datatype:    
    char t1id= scn.next().charAt(0);     //num n representing id of tower1
    char t2id= scn.next().charAt(0);     //num n representing id of tower2
    char t3id= scn.next().charAt(0);     //num n representing id of tower3
*/        

/* int:
        int t1id= scn.nextInt();     
        int t2id= scn.nextInt();     
        int t3id= scn.nextInt();     
*/

    public static void toh(int n, int t1id, int t2id, int t3id){
        //base case implies to return to function if 0
        if(n == 0){
            return;
        }
        
//NOTE (IMP):- While printing output our n represents size of disk not number of disk
        
        toh(n-1, t1id, t3id, t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");               
        toh(n-1,t3id, t2id, t1id);
            
    }

}
