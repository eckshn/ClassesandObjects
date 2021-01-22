package Example.One;

public class MedalApplication {
    public static void main(String[] args) {
        Medal track = new Medal();
        Medal discus = new Medal("gold");

        track.shine();
        discus.shine();
        Medal.bling(); //notice how this calls the class rather than the object
    }


}
