public class ex03 {
    public static void main(String[] args) {


        Student stud1 = new Student();
        Student stud2 = new Student();

        stud1.name = "홍길니얼굴";

        Student stud3 = stud1;
        System.out.println(stud1 == stud2);
        System.out.println(stud2 == stud3);
        System.out.println(stud3 == stud1);



        String aa = "aa";
        String bb = new String("aa");
        String cc = aa;

        System.out.println(aa == bb);
        System.out.println(bb == cc);
        System.out.println(aa == cc);

    }
}
