import java.util.Scanner;
class nameStyle{
	public static void main(String args[]){
	int value, flag=0;
	char ch;
	String exit="exit";
	String quit= "quit";
	//int a1 = (int) 1;
	//System.out.println("①  " + a1); // 9247
		 ch = (char)9423;  //9312 -49 = 9263
	//System.out.println(ch);
	System.out.println("Note: use \"exit\" or \"quit\" to exit");
	Scanner input = new Scanner(System.in);
	while(input.hasNext()){
		String yourName = input.nextLine();
		if(yourName.equals(exit) || yourName.equals(quit))
		{
			System.exit(1);
		}
	//yourName = yourName.toUpperCase();
	//System.out.println(yourName);
	//int number = (int) yourName.charAt(0); // 9419 -86 == 9333
	//System.out.println(number);
	//int a = (int) yourName.charAt(3);
	//System.out.println(a);

		for(int i=0; i<yourName.length(); i++)
		{

			//ⓈⒽⒺⒺⓉⒶⓁ  ⓅⒶⓉⒾⓁ
			value = (int) yourName.charAt(i);
			if(value == 32)
			{
				System.out.print(" ");
			}
			else if (Character.isLowerCase(yourName.charAt(i)))
			{
				//System.out.println(value);
				value = value + 9327;
				 ch = (char)value;
				System.out.print(ch);

			}
			else if (Character.isLetter(yourName.charAt(i)))
			{
				value = value + 9333;
				 ch = (char)value;
				System.out.print(ch);
			}
			else if (Character.isDigit(yourName.charAt(i)))
			{
				value = value + 9263;
				 ch = (char)value;
				System.out.print(ch);
			}

		}
		System.out.println("");
	}
		System.out.println("");
}	
} 
