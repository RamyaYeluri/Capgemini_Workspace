/**
*Select color and print output
* Switch case
*/
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str; 
		System.out.println("select color 1. red 2.yellow 3.green");
		
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		
        switch(str) 
        { 
            case "red": 
                System.out.println("stop"); 
                break; 
            case "yellow": 
                System.out.println("ready"); 
                break; 
            case "green": 
                System.out.println("go"); 
                break; 
            

	}
	}
}
