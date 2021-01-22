package Example.One;

public class Medal { //Notice how we don't have a public static void main (hint: because this isn't the file we are running(We are running MedalApplication.java))
    private String metal; //The only field of the Medal class is the metal it is made out of

    public Medal() { //The default constructor (when we don't give any arguments)
        metal = "copper";
    }

    public Medal(String material) { //When we give an argument it first must be a String and then the field would be set equal to the argument
        metal = material; //In this case since we said Medal discus = new Medal("gold") we initialize metal's value to be "gold"
    }

    public void shine() { //the method ISN'T static meaning that you need to create a Medal object in order to run
        if(metal.contains("gold")) { //When checking if a string is a certain word you can't do ===
            System.out.println("shine!"); //If the metal is gold it would output to console "shine"
        }
        else {
            System.out.println("dull :("); //If the metal isn't gold then it outputs "dull"
        }
    }

    public static void bling() { //Why is it that when we call this method inside of MedalApplication, we didn't need to use an object?
        System.out.println("bling!");
    }
}
