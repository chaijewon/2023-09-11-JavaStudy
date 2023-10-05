// 정수 한개를 입력받아서 => 짝수/홀수 => 출력한다 
// 3개 
import java.util.*;
public class 메소드_문제_1 {
	// static int num;
    // 입력 
	static int userInput()
	{
		 Scanner scan=new Scanner(System.in);
	     System.out.print("정수 입력:");
	     int num=scan.nextInt();
	     return num;
	}
	static String check(int num)
	{
		/*String res="";
        if(num%2==0)
        	res=num+"는(은) 짝수입니다";
        else
        	res=num+"는(은) 홀수입니다";*/
        
        return num%2==0?num+"는(은) 짝수입니다":num+"는(은) 홀수입니다";
	}
	static void print(String res)
	{
		System.out.println(res);
	}
	static void process()
	{
		//int num=userInput();
		//check(userInput());
		print(check(userInput())); // 게임
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
        /*Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        int num=scan.nextInt();
        
        String res="";
        if(num%2==0)
        	res=num+"는(은) 짝수입니다";
        else
        	res=num+"는(은) 홀수입니다";
        
        System.out.println(res);*/
	}

}
