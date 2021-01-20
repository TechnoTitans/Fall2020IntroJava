public class Cat {
//  private visibility modifier means that only variables/methods in this class can access variables/methods
    private String name;
    private String furColor;
    private double heightInCm;
    private double lengthInCm;

//  The constructor: assigns values to instance variables for a specific instance
//    and run any code that should be run for all instances
    public Cat(String name, String furColor, double heightInCm, double lengthInCm) {
        this.name = name;
        this.furColor = furColor;
        this.heightInCm = heightInCm;
        this.lengthInCm = lengthInCm;
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping...zzz....");
    }

    public void meow() {
        System.out.println("MEOW! I am " + this.furColor);
    }

    public void scratching(String obj) {
        System.out.println(this.name + " is scratching a " + obj);
    }

    public boolean jumpToHeight(double desiredJumpHeight) {
        if (this.heightInCm + this.lengthInCm > desiredJumpHeight) {
            return true;
        }
        return false;
    }

    public void setName(String name){
//      In this case this. is needed
        this.name = name;
    }

    public String getName(){
//      this. refers to instance variable of current instance
//      In this case, leaving out the this. also works
        return this.name;
    }

    public double getLengthInCm(){
        return this.lengthInCm;
    }
}
