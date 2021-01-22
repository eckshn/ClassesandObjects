package Example.Two;

public class CarApplication {
    public static void main(String[] args) {
        Car honda = new Car(4, "black"); //Calls the second constructor
        Car scooter = new Car(2); //Calls the third constructor
        Car basic = new Car(); //Calls the default constructor

        System.out.println(honda.getWheels()); //4
        System.out.println(basic.getWheels()); //3
        System.out.println(basic.getColor()); //gray
        System.out.println(scooter.getColor()); //green

        basic.setWheels(6);
        System.out.println(basic.getWheels()); //Notice how the output value is different from the first one

    }
}
