public class BrushToolFactory extends ToolFactory{
    @Override
    protected Tools createTool(){
        return new Brush();
    }
}
