public class Main {

    public static void main(String[] args) {

        Vehicle maluch = new Vehicle("Maluch", 2);
        maluch.startEngine();
        maluch.accelerate(50);
        maluch.hitBreak();

        Porshe porshe_1 = new Porshe("Porshe 911", 100);
        porshe_1.startEngine();
        porshe_1.accelerate(150);
        porshe_1.hitBreak();
    }
}





class Vehicle {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Vehicle(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.speed = 0;
        System.out.println("This is " + this.name);
    }

    public void startEngine(){
        System.out.println(this.name + " starting engine.");
    }

    public void accelerate (int speed){
        this.speed += speed;
        System.out.println("The speed is " + this.speed);
    }

    public void hitBreak (){
        this.speed = 0;
        System.out.println("Stopping the car.");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

}

class Porshe extends Vehicle{
    public Porshe(String name, int cylinders) {
        super(name, cylinders);
        System.out.println("This car look amazing!");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Oh my god! Can you hear that roar?!");
    }

    @Override
    public void hitBreak() {
        super.hitBreak();
        System.out.println("Wow. This car stopped faster than a blink");
    }
}