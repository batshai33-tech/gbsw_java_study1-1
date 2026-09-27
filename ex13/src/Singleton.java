public class Singleton {
    // 하나의 클래스를 여러명이 가리키는법
    static Singleton instance = new Singleton();


    static Singleton getInstance(){
        return instance;
    }
}
