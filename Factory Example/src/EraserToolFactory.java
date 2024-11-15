public class EraserToolFactory extends ToolFactory{
    @Override
    protected Tools createTool(){
        return new Eraser();
    }
}
