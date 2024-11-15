public class Main {
    public static void main(String[] args) {

    Image image = new Image("Original image");
    Editor editor = new Editor(image);
    editor.display();

    editor.editImage("new Image1");
    editor.display();

    editor.editImage("new Image2");
    editor.display();

    editor.undo();
    editor.display();

    editor.undo();
    editor.display();

    editor.undo();
    }
}