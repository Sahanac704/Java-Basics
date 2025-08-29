class Car{
    String brand;
    String color;
    int year;

    //constructor
    Car(String brand, String color, int year){
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    //method
    public void getCar(){
        System.out.println("Brand of the car:"+brand);
        System.out.println("Color of the car:"+color);
        System.out.println("Launched year of the car:"+year);
    }
}
//main class
public class constructor {
    public static void main(String[] args) {
        // Creating objects using constructor
        Car car1 = new Car("Toyota", "Black", 2022);
        Car car2 = new Car("Tesla", "Red", 2023);

        // Display details
        car1.getCar();
        car2.getCar();
    }
}
