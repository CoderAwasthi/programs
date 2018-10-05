import java.util.Scanner;
public class strexi
{
	public static void main(String ar[])
	{
		String input_string[]=new String[5];
		Scanner in=new Scanner(System.in);
		int str_length_counter=0;
		for(int count=0;count<5;count++)
		{
			System.out.print("Enter Strings: ");
			input_string[count]=in.next();
		}
		for(int check_counter=0;check_counter<5;check_counter++)
		{
			String duplicate=input_string[check_counter];
			for(int inner_check_counter=check_counter+1;inner_check_counter<5;inner_check_counter++)
			{
				String check=input_string[inner_check_counter];
				if(duplicate.equalsIgnoreCase(check))
				{
					input_string[inner_check_counter]="NULL";
				}
				else if(duplicate.charAt(str_length_counter)>check.charAt(str_length_counter))
				{
					input_string[check_counter]=check;
					input_string[inner_check_counter]=duplicate;
					duplicate=check;
				}
				else if(duplicate.charAt(str_length_counter)==check.charAt(str_length_counter))
				{
					for(int sync=1;sync<=duplicate.length();sync++)
					{
					str_length_counter++;
					if(duplicate.charAt(str_length_counter)>check.charAt(str_length_counter))
					{
						input_string[check_counter]=check;
						input_string[inner_check_counter]=duplicate;
						duplicate=check;
						str_length_counter=0;
						break;
					}
					else if(duplicate.charAt(str_length_counter)<check.charAt(str_length_counter))
						break;
					}
				}
			}
			
		}
		System.out.println("____________________________");
		for(int print=0;print<5;print++)
		{
			System.out.println(input_string[print]);
		}
		
	}
}