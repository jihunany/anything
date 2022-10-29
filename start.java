/* 자바 기초부터 시작  책 명품 자바 에센셜(황기태) 내용
  자바 프로그램의 구조 */
public class Hello{       //Hello 이름의 클래스 선언
  public static int sum(int n, int m) {      // 메소드 sum()선언, 매개변수 n, m
    return n + m; // n과 m의 합 리턴
    }
  // main() 메소드에서 실행시작  
  public static void main(String[] args) {
    int i = 20;  // 정수를 저장하는 변수 i 선언. 20으로 초기화
    int s;       // 정수를 저장하는 변수 s 선언
    char a;      // 문자 하나를 저장할 변수 a 선언
    
    s = sum(i, 10);   // sum() 메소드의 매개변수 n, m에 각각 i값과 10전달 
    a = '?';
    System.out.println(a);        // 문자 '?' 출력
    System.out.println("Hello");  // "Hello" 문자열 출력
    System.out.println(s);        // 정수 s값 30 출력
  }
}

// 식별자(identifier)-클래스, 변수, 상수, 메소드에 붙이는 이름
/* 식별자 이름 규칙
   특수문자 '_','$' 예외로 사용
   한글 X, if,while,class 등 자바 언어의 키워드 X, 첫번째 문자로 숫자 X, true,false,null X
   대소문자 구별, 길이제한 X */
   
// 자바의 데이터 타입
/* 기본타입: 8개
   논리타입: boolean(1비트, true 또는 false)
   문자타입: char(2바이트, Unicode)
   정수타입: byte(1바이트, -128~127), short(2바이트), int(4바이트), long(8바이트)
   실수타입: float(4바이트), double(8바이트) */
// 문자열은 기본 타입에 속하지 않고 JDK에서 제공하는 String 클래스를 이용 
