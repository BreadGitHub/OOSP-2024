public class main {
    public static void main(String[] args) {
        Prototype prototype = new Character("Bob1", 50, 200);
        System.out.println("Character: " + prototype.displayStats());

        Prototype clone = prototype.clone();
        System.out.println("cloned: " + clone.displayStats());
    }
}
