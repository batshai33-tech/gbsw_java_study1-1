import aa.ex02;

void main() {
  ex02 ex02 = new ex02(); //생성자 예약어
  ex02.doA();
  ex02.doB();
  int a = 3;

  if ( a > 3 ) {
    System.out.println(" a 는 3 보다 큽니다!");
  } else if ( a == 3 ) {
    System.out.println(" a 는 3 과 같습니다");
  } else {
    System.out.println( "a 는 3보다 작습니다...");
  }

  int manu = 3;
  switch (manu) {
    case 1:System.out.println( "시스탬 시작");
    break;
    case 2:System.out.println( "시스탬 지속" );
    break;
      default:System.out.println( "시스탬 종료.." );
  }

  for (int i = 0; i < 5 ; i++) {
    System.out.println("안녕하시오!");
  }
  System.out.println("그만 인사해!!");

}

