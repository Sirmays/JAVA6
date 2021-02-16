public abstract class Pet {
    private int run;
    private int swim;

    public Pet(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

}
