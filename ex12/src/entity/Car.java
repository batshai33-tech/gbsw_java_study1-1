package entity;

public class Car {
    private String model;
    private String color;
    private int speed;

    // private 값 설정방법
    // 1. 생성자 초기화
    // 2. setter getter 사용

    // 기본생성자 생략가능
    // 다른생성자를 선언하게되면 생략불가

    public Car(){}

    // Command + n
    // shift + 클릭 으로 여러개 고르기
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    // getter
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }


    // setter
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override // 재정의
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
