package commandPattern;

class TextEditor {
    String text;

    public void makeTextBold() {
        text = "<b>" + text + "</b>";
    }

    public void makeTextItalic() {
        text = "<i>" + text + "</i>";
    }
}

class Button {
    TextEditor editor;

    void onClick() {
        editor.makeTextBold();
    }
}

public class WithoutCommandPattern {


}


