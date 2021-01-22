package Example;

public class Main { //notice how the name of the class is the same name as the file
    //Also notice how the necessary information for the class is inside the curly braces

    public static void main(String[] args) { //this is what will actually be ran

        add(4, 5); //notice how if you run the program you don't see 9

        System.out.println(add(3, 3)); //outputs to the console 6
        //can think System.out.println() as print() from python

        outputAdd(2, 1); //Look how I don't have System.out.println because inside the method it does it
    }

    /*Method headers are these
    public int name(int parameter) {}

    The public means that we can access the method from outside of the class  (generally just remember when making methods to usually use public)
    The int means that the value we will be returning is an integer
    Name can be replaced with any name you want for the function
    The int inside the parenthesis mean that when someone calls the method, they need to input an integer
    Parameter is the variable that is initialized by the argument given when the method was called

     */

    public static int add(int x, int y) { //Notice how the method header has static meaning that it is tied to the class (you don't need to create an object for to use the method)
        return x + y; //since in the method header we said int it would mean that the value we need to return is an integer
        //THIS DOESN'T OUTPUT TO THE CONSOLE BUT SIMPLY RETURNS BACK A VALUE
    }

    public static void outputAdd(int x, int y) { //This time in the method header there is void meaning that the method doesn't return anything
        //return x + y would give an error
        System.out.println(x+y); //Inside the method we directly call the System.out.println meaning it outputs to the console directly
    }

}
