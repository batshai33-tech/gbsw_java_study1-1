public class Car {
    int speed;

    Car(){
        System.out.println("기본생성자");
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    void doPrintSpeed(){
        System.out.println("speed = " + speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }

    String model;
    String color;

    public void display() {
        System.out.println("color = " + this.color);
        System.out.println("color = " + this.model);
        // 설계도
    }
}
