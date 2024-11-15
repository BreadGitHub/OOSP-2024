public abstract class Animation {
    public final void update() {
        startAnimation();
        performAnimation();
        endAnimation();
    }

    protected abstract void performAnimation();

    private void startAnimation() {
        System.out.println("Start animation");
    }

    private void endAnimation() {
        System.out.println("End animation");
    }
}
