import java.util.Scanner;

/**
 * 
 */
/**

		 *

		 * Name: Hongjiao Hu

		 * Teacher: Mr. Hardman 

		 * Assignment 5, Program 1

		 * Date Last Modified: 2016/11/29

		 *

 */
/**
 * @author user
 *
 */
public class A5L1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int[] userArray = {12, 23, 72, 14, 95, 54, 185, 3, 1, 0};
		int index = 0;
		int userValue;
		
		for(int i = 0; i < userArray.length; i++){
        	System.out.print(userArray[i] + "  ");
		}
		
		System.out.println("\nWhat value do you want to index of?");
		userValue = userInput.nextInt(); 
		
		for(int i = 0; i < userArray.length; i++){
			if(userArray[i]==userValue){
				index = i;
			}
		}
		
		if(index == -1){
			System.out.println("This is not in the array!");
		}else{
			System.out.println(userValue + " is at index " +index);
		}
		
		userInput.close();
	}

}
