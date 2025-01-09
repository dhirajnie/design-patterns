package commandPattern;


import javax.swing.text.EditorKit;

interface Command{
    void execute();
}
class BoldCommand implements Command{

    TextEditor editor;
    BoldCommand(TextEditor editor){
        this.editor=editor;
    }
    @Override
    public void execute() {
        editor.makeTextBold();
    }
}

// one button can do many types of actions
class ButtonI{
private Command command;

    public ButtonI(Command command) {
        this.command = command;
    }

    void onClick(){
    command.execute();
}
}


public class WithCommandPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Command command = new BoldCommand(editor);
        new ButtonI(command).onClick();
    }
}
