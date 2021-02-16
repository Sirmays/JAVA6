public class Cat extends Pet {

    public Cat() {
        super(200, 0);
    }

    @Override
    public void run(int distance) {
        if (distance <= getRun()) {
            System.out.printf("Cat run %s metres%n", distance);
        } else {
            System.out.printf("Cat cannot run %s metres. It's too far!%n", distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat cannot swim at all!");

    }
}
