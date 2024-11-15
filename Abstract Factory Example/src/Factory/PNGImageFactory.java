package Factory;

import Models.Image;
import Models.PNGImage;


public class PNGImageFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new PNGImage();
    }
}
