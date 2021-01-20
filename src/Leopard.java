// extends keyword for inheritance
// all instance variables and methods from cat are inherited
// A Leopard IS-A Cat, but not all cats are leopards
// Cat is the super class and leopard is the subclass
public class Leopard extends Cat {
    private int numberOfSpots;
    private double yearsInJungle;

    public Leopard(int numberOfSpots, double yearsInJungle, String name, String furColor, double heightInCm, double lengthInCm) {
//        This super function, calls a constructor of the super class (in this case, Cat)
        super(name, furColor, heightInCm, lengthInCm);
        this.numberOfSpots = numberOfSpots;
        this.yearsInJungle = yearsInJungle;
    }

    public boolean climbLargeTree(double treeHeightInM) {
//        we can use the super keyword to call methods from the parent class
//        we cannot simply say super.lengthInCm because we set our instance variables to private
        if (super.getLengthInCm()/2 > treeHeightInM) {
            return true;
        }
        return false;
    }

    public int getNumberOfSpots(){
        return this.numberOfSpots;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }
}
