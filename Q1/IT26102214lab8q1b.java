import java.util.Scanner;
 public class IT26102214lab8q1b{ 
    public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   int myArray[]=new int[5];
	   int evenArray[]=new int[5];
	   int i;
	   int count=0;
	   System.out.println("Enter 5 Numbers:");
	   for(i =0;i< myArray.length;i++){
		   System.out.print("Enter number "+(i+1)+":");
		   myArray[i] = input.nextInt();
	   }
	   for(i =0;i< myArray.length;i++){
		   if(myArray[i]%2==0){
			   evenArray[count]=myArray[i];
			   count++;
		   }
	   }
	   System.out.println("myArray contents:");
	   for(i=0;i<myArray.length;i++){
		   System.out.print(myArray[i] + " \t ");
	   }
	   
	   System.out.println("evenArray contents:");
	   for(i=0;i<evenArray.length;i++){
		   System.out.print(evenArray[i] + " \t ");
	   }
	}
 }