public class Calcu{

  public static void main(String args[]) {

     int num1,num2,ans;
char opr; 
if(args.length == 0)
{
System.out.println("No Command line");
}
else{
		
 num1=Integer.valueOf(args[0]);
 num2=Integer.valueOf(args[2]);
 opr=args[1].charAt(0);
		if (opr == '+' ){
			ans=num1 + num2;
			System.out.println(num1 +" "+opr+" "+num2 +"= "+" "+ ans );
		}
		else if(opr == '-')
		{
			ans=num1-num2;
			System.out.println(num1+" "+opr+" "+num2 +"= "+" "+ ans );
		}
		else if(opr == '/'){
				ans=num1/num2;
				System.out.println(num1 +" "+opr +" "+num2 +"= "+" "+ ans );
	    }
		else if(opr == '*'){
					ans=num1*num2;
					System.out.println(num1 +" "+opr +" "+num2 +"= "+" "+ ans );
		}
		else
			
		System.out.println("Invalid Input");
		}
}
}

// Hello 
//Balark