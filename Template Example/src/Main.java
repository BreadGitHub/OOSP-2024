public class Main {
    public static void main(String[] args) {
        Animation moveAnimation = new MoveAnimation();
        Animation rotateAnimation = new RotateAnimation();
        Animation scaleAnimation = new ScaleAnimation();

        // Обновляем анимации
        moveAnimation.update();
        rotateAnimation.update();
        scaleAnimation.update();
    }
}