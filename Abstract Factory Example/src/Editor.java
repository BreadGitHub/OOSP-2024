import Factory.ImageFactory;
import Models.Image;

public class Editor {
    private ImageFactory imageFactory;
    public Editor(ImageFactory imageFactory) {
        this.imageFactory = imageFactory;
    }
    public void loadImage() {
        Image image = imageFactory.createImage();
        image.display();
    }
}
