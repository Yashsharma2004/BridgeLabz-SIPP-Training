
class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content = content;
    }
}

class TextEditor {
    TextState current;
    int maxHistory;

    TextEditor(int maxHistory) {
        this.maxHistory = maxHistory;
    }

    void type(String newText) {
        TextState newState = new TextState(newText);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
        trimHistory();
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty.");
        }
    }

    void trimHistory() {
        int count = 0;
        TextState temp = current;
        while (temp != null && count < maxHistory) {
            temp = temp.prev;
            count++;
        }
        if (temp != null && temp.prev != null) {
            temp.prev.next = null;
            temp.prev = null;
        }
    }
}

public class UndoRedoTextEditor {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.type("Hello");
        editor.type("Hello World");
        editor.type("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.type("Hello Java!");
        editor.displayCurrentState();
    }
}
