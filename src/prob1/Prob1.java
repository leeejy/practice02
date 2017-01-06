/*[문제1] 
키보드에서 정수로 된 돈의 액수를 입력 받아 오만 원권, 만원 권, 오천 원권, 천원 권,
500원 동전, 100원 동전, 50원 동전, 10원 동전, 1원 동전 각 몇 개로 변환 되는지 작성하시오.*/

package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int input=sc.nextInt();
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] money_count = new int[10];
		
		for(int i=0;i<money.length;i++){
			if(input>=money[i]){
				money_count[i]=input/money[i];
				input%=money[i];
			}
				
			
		}
		for(int i=0;i<money.length;i++)
			System.out.println(money[i] + "원:" + money_count[i]);
		sc.close();
	}
}