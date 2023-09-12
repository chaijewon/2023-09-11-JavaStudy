/*
 *    연산자 / 피연산자(대상) 
 *    ----- 연산자
 *    
 *    10 + 20
 *    --  ---
 *     |   |
 *     ----- 피연산자
 *     
 *     피연산자 1개 (단항연산자)
 *            2개 (이항연산자)
 *            3개 (삼항연산자)
 *     단항연산자 
 *       = 증감연산자 (한개증가 ,한개감소)  ++,-- (반복문)
 *         int a=10;
 *         ++a; ==> a=11
 *       = 부정연산자 : boolean만 사용이 가능 
 *         boolean b=false;
 *         b=!b; ==> true
 *       = 형변환 연산자 : (int)'A'
 *          = UpCasting ============> 작은데이터형 => 큰데이터형
 *               자동 형변환 
 *            int a='A' ==> a=65
 *          = DownCasting  (int)10.5
 *                      큰데이터형 => 작은 데이터형 
 *               강제 형변환 
 *       = 기타 (~:반전연산자(양수=>음수,음수=>양수)) , . , [] 
 *     이항연산자 
 *       = 산술연산자 (+ , - , * , / , %)
 *         + : 산술 연산 , 문자열 결합 
 *             5+6=11
 *             "5"+6 = "56"
 *             5+"7"+6 => "576"
 *             
 *             "7"+7+7 "777"
 *             -----
 *             "77"+7
 *             ------- "777"
 *             
 *             7+7+"7"  
 *             ---
 *             14+"7" ==> "147"
 *             
 *             데이터형 자동 변경 
 *             --------------
 *             int + double => double
 *             --- double
 *             
 *              10+10.5
 *              --
 *              10.0+10.5 
 *              
 *              'a'+10
 *              ---
 *              97+10 => 107
 *              
 *              int+long => long 
 *              int+double => double 
 *              long+double =double
 *              -------------------
 *              char+char = int  'A'+'B'
 *              byte+byte = int 
 *              char+byte = int 
 *              -------------------
 *              
 *         / 
 *           1) 정수/정수 = 정수 
 *              10/3 ==> 3
 *              5/2  ==> 2
 *           2) 0으로 나눌 경우에는 오류 발생 
 *           ==> 단위테스트 (Junit)
 *         %  나누고 나머지 (짝수,홀수 , 배수)
 *            10%3 ==> 1
 *            9%4  ==> 1
 *            10%2 ==> 0
 *            
 *            ==> 부호 
 *            5%2 == 1
 *            -5%2 == -1
 *            5%-2 == 1
 *            -5%-2 == -1
 *            
 *            부호는 왼쪽편 부호를 따라 간다 
 *             
 *       = 쉬프트연산자 (<< , >>) 비트이동 연산자 
 *         10<<2 ==> 40 10*2^2
 *         11<<3  ==>  11 * 2^3(8)
 *         
 *         10>>2 ==> 10/4
 *         
 *       = 비트연산자 ( & , | , ^ )
 *         &(*) |(+) ^(다른 비트)
 *         
 *         -----------------------
 *                 &(*)   |(+)  ^
 *         -----------------------
 *          0 0      0     0    0
 *         ---------------------
 *          0 1      0     1    1
 *         ---------------------
 *          1 0      0     1    1
 *         ---------------------
 *          1 1      1     1    0
 *         -------------------- -
 *         
 *          10 & 14
 *          -------
 *           1010
 *           1110
 *           ----&
 *           1010  ==> 10
 *           
 *          21 & 6
 *          
 *          10101
 *          00110
 *          ----- &
 *          00100  ==> 4
 *          
 *          1010
 *          1110
 *          ----|
 *          1110  => 14
 *          
 *          10101
 *          00110
 *          -----|
 *          10111  ==> 23
 *          
 *          
 *          1010
 *          1110
 *          -----^
 *          0100  ==> 4
 *          
 *          10101
 *          00110
 *          ------^
 *          10011  ==> 19
 *          
 *       = 비교연산자 ( == , != , < , > , <= , >= )
 *         결과값 : boolean (true/false)
 *         6==7 false
 *         6!=7 true
 *         6<7 true
 *         6>7 false
 *         6<=7 true
 *         6>=7 false
 *         ==> 정수/실수/문자/논리(==,!=) ==> 문자열은 계산할 수 없다 
 *                                ------
 *                                 equals() , compare()
 *         같다,같지않다 
 *         자바: == , !=
 *         오라클 : = , <>
 *         자바스크립트 : === , !==
 *                                 
 *       = 논리연산자 ( && , || )
 *          && : 직렬연산자
 *          || : 병렬연산자 
 *          ---------------
 *          
 *          (조건)&&(조건)
 *          ----   -----
 *            |      |
 *            --------
 *               |
 *              결과
 *                       &&    ||
 *         ---------------------
 *         true true    true  true
 *         ---------------------
 *         true false   false true
 *         ---------------------
 *         false true   false true
 *         ---------------------
 *         false false  false false 
 *         ---------------------
 *         && : 범위나 기간 포함   90부터 100까지 A 예약기간
 *                     score>=90 && score<=100
 *         || : 범위를 벗어난 경우 
 *         
 *         ---------------------
 *       = 대입연산자 ( = , += , -= , *= , /= , %=...)
 *                       -------------------------
 *                         복합 대입 연산자 
 *         int a=10;
 *             <----
 *         int a=10;
 *         int b=20;
 *         int c=a+b;
 *               ----
 *             --
 *             
 *         int a=10;
 *         a++; // 한개증가 
 *         
 *         int a=10;
 *         a+=10
 *         -----
 *           a=a+10 => a=20
 *         
 *         int a=100;
 *         a+=20;
 *         a=a+20
 *         a=?
 *         
 *         int a=100;
 *         a-=10;
 *         a=a-10 ==> 90
 *         
 *         a++;a++
 *         a+=2
 *         
 *         
 */
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Integer.toBinaryString(6));
	}

}
