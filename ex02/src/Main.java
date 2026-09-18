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

  int i = 0;
  while (i < 5) {
    System.out.println("안녕하세요");
    i++;
  }

  int j = 0;
  do{
    if (j == 3) {
      break;
    }
    System.out.println("기본 프린트이빈다");
    j++;
    if (j == 5) {
      System.out.println("j 가 5 입니다!!");
    }
  }while (j < 5);

  for (int k = 1; k < 3; k++) {
    for (int l = 1; l < 4; l++) {
      if (l == 2){
        continue;
      }
      System.out.println(k + "*" + l + "=" + k*l + "인건 누구나 다 아는 사실이죠?");
    }
  }

  int[] num = {1, 2, 3, 4, 5};

  for (int k = 0; k < num.length; k++) {
    System.out.println(num[k]);
  }

}


