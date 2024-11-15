public class PencilToolFactory extends ToolFactory{
    @Override
    protected Tools createTool(){
        return new Pencil();
    }
}
