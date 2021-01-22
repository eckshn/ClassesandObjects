package Example.Two;

public class Car {
    private int numOfWheels;
    private String color;

    public Car() { //default constructor
        numOfWheels = 3;
        color = "gray";
    }
    public Car(int wheels, String colors) {
        numOfWheels = wheels;
        color = colors;
    }
    public Car(int wheels) { //Notice how this constructor only has one parameter
        numOfWheels = wheels;
        color = "green";
    }

    public String getColor() { //Since color is a private variable we need to create a getter in order to get its value
        return color;
    }

    public int getWheels() { //Same thing for numOfWheels
        return numOfWheels;
    }

    public void setWheels(int newWheels) { //Why is this one void?
        numOfWheels = newWheels;
    }
}
