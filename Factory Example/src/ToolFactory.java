public abstract class ToolFactory {
    public Tools create() {
        Tools tool = createTool();
        tool.draw();
        return tool;
    }
    protected abstract Tools createTool();
}
