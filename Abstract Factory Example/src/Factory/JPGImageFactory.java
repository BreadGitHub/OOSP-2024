package Factory;

import Models.Image;
import Models.JPGImage;


public class JPGImageFactory implements ImageFactory {
    @Override
    public Image createImage() {return new JPGImage(); }
}
