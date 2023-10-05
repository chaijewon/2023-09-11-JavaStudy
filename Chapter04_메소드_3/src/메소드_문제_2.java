// 정수 1개 입력 => 3의 배수 여부 확인 
public class 메소드_문제_2 {
    static String check(int num)
    {
    	String res=num+"는(은) 3의 배수가 아닙니다!!";
    	if(num%3==0)
    		res=num+"는(은) 3의 배수입니다!!";
    	return res;
    }
    static void print(String res)
    {
    	System.out.println(res);
    }
    static void process()
    {
    	int num=메소드_문제_1.userInput();// 재사용기법 
    	String res=check(num);
    	print(res);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
