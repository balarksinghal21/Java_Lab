package hackerrank.gem;
import java.io.*;
import java.util.*;

public class Gemstone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<Character> gemstone = stringToSet(sc.nextLine()); 
        
        for(int i=1; i<n ;i++){
            
            gemstone.retainAll(stringToSet(sc.nextLine()));
        }
        System.out.print(gemstone.size());
    }
    public static Set<Character> stringToSet(String s) 
    {
        Set<Character> stone = new HashSet<Character>(26);
        for (char string : s.toCharArray())
            stone.add(Character.valueOf(string));
        return stone;
    }
}
