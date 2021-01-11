public class Cat {
    String name;
    String furColor;
    double heightInCm;
    double lengthInCm;

    Cat(String name, String furColor, double heightInCm, double lengthInCm) {
        this.name = name;
        this.furColor = furColor;
        this.heightInCm = heightInCm;
        this.lengthInCm = lengthInCm;
    }

    void sleep() {
        System.out.println(name + " is sleeping...zzz....");
    }

    void meow() {
        System.out.println("MEOW! I am " + furColor);
    }

    void scratching(String obj) {
        System.out.println(name + " is scratching a " + obj);
    }

    boolean jumpToHeight(double desiredJumpHeight) {
        if (heightInCm + lengthInCm > desiredJumpHeight) {
            return true;
        }
        return false;
    }
}
