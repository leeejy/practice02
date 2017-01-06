package prob5;

import java.util.*;

public class Prob5 {

	public static void main(String[] args) {
		//Randomize 하기
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		Random random = new Random();
		int number = random.nextInt(100)+1;
		
		while(true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("1>> ");
			int input = scanner.nextInt();
			if(number>input){
				System.out.println("더 높게");
			}
			else if(number<input){
				System.out.println("더 낮게");
			}
			else
			{
				System.out.println(" 맞았습니다.");
				System.out.print("다시 하시겠습니까? (y/n) ");
				String answer = scanner.next();
				if(answer.equals('y')) break;	

			}
			scanner.close();
			
			
		}
	}
}