public class Image {
    private String imageContent;
    public Image(String imageContent) {
        this.imageContent = imageContent;
    }

    public String getImageContent() {
        return imageContent;
    }

    public void setImageContent(String imageContent) {
        this.imageContent = imageContent;
    }

    public Memento save() {
        return new Memento(imageContent);
    }

    public void restore (Memento memento) {
        this.imageContent = memento.getSavedContent();
    }

    @Override
    public String toString() {
        return imageContent;
    }

    public static class Memento {
        private final String saved;

        public Memento(String imageContent) {
            this.saved = imageContent;
        }

        public String getSavedContent() {
            return saved;
        }
    }


}
