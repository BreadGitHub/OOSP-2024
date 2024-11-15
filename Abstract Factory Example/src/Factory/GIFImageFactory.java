package Factory;

import Models.GIFImage;
import Models.Image;


public class GIFImageFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new GIFImage();
    }
}
