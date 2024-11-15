import java.util.ArrayList;
import java.util.List;

public class Editor {
    private Image image;
    private List<Image.Memento> history = new ArrayList<>();

    public Editor(Image image) {
        this.image = image;
    }

    public void editImage(String newContent) {
        history.add(image.save());
        image.setImageContent(newContent);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Image.Memento memento = history.remove(history.size()-1);
            image.restore(memento);
        } else {
            System.out.println("Empty");
        }
    }

    public void display() {
        System.out.println("Current image: " + image);
    }
}
