
public class DrawDiamond {

	public static void main(String[] args) {    //main method of the program
		
		char ch='a';             //initialization of char element
		  int i,j,k,m,p,space=0;   //initialization of integer element
		 
		  for(i=1;i<=3;i++)
		  {
		    for(j=3;j>=i;j--) {
		    	System.out.print(" ");     //prints space 
		    }
		     for(k=1;k<=i;k++) {       //loop to print character top diamond
		    	 
		     System.out.print(ch++);    //prints character from a
		     }
		     ch--;
		     for(m=1;m<i;m++) {       //loop to print reverse alphabet top diamond
		     System.out.print(--ch);   //prints char in reverse order from the previous element
		     }
		     System.out.println();     //prints new line
		  }
		  for(i=2;i>=1;i--)           //loop to print lower diamond
		    {
		       for(j=0;j<=space+1;j++)
			      System.out.print(" ");    //prints space
		       for(p=97,j=1;j<=i;j++,p++)      //loop to print the alphabets of the downward diamond/pyramid
			      System.out.print((char)p);  //prints character 
		       for(p=p-2,j=i-1;j>=1;j--,p--)   //loop to print the
			      System.out.print((char) p);  //prints reverse character
			System.out.println();    //prints a new line
			space++;     //increments space value
		    }
	}

}
