class Student {
    String name;
    String gender;
    int kor ;
    int eng ;
}

public class ex02 {
    public static void main(String[] args) {
        Student [] stud = new Student[3];

        stud[0] = new Student();
        stud[1] = new Student();
        stud[2] = new Student();

        stud[0].name = "홍길똥";
        stud[1].name = "홍길뚱";
        stud[2].name = "홍길땅";
        System.out.println(stud[0]);
        System.out.println(stud[0].name);
        System.out.println(stud[1].name);
        System.out.println(stud[2].name);


        // 학생관리
        // 이름 a b c
        // 성별 남 여 남
        // 국어 90 80 70
        // 영어 60 90 80

        String names[] = {"AA", "BBB" , "CCCC"};
        String gender[] = {"male", "female" , "male"};
        int kor [] = {10, 20, 30};
        int eng [] = {30, 40, 50};

    }
}
