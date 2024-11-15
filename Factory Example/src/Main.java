public class Main {
    public static void main(String[] args) {
        ToolFactory toolFactory;
        toolFactory = new PencilToolFactory();
        Tools tool = toolFactory.createTool();
        tool.draw();

        toolFactory = new BrushToolFactory();
        tool = toolFactory.createTool();
        tool.draw();

        toolFactory = new EraserToolFactory();
        tool = toolFactory.createTool();
        tool.draw();
    }
}
