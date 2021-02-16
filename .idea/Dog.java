public class Dog extends Pet {

    public Dog() {
        super(500, 10);
    }

    @Override
    public void run(int distance) {
        if (distance <= getRun()) {
            System.out.printf("Dog run %s metres%n", distance);
        } else {
            System.out.printf("Dog cannot run %s metres. It's too far!%n", distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= getSwim()) {
            System.out.printf("Dog swim %s metres%n", distance);
        } else {
            System.out.printf("Dog cannot swim %s metres. It's too far!%n", distance);
        }
    }
}
