package com.blueguagua.firstplugin.updatefile;


import com.intellij.openapi.editor.event.CaretEvent;
import com.intellij.openapi.editor.event.CaretListener;
import org.jetbrains.annotations.NotNull;

public class PfcCaretListener implements CaretListener {

    @Override
    public void caretPositionChanged(@NotNull CaretEvent event) {
//        System.out.println("PfcCaretListener.caretPositionChanged");
        String selectedText = event.getCaret().getSelectedText();
        int newLine = event.getNewPosition().line;
        int newColumn = event.getNewPosition().column;
        int oldLine = event.getOldPosition().line;
        int oldColumn = event.getOldPosition().column;
        System.out.println("PfcCaretListener.caretPositionChanged.selectedText:" + selectedText);
        System.out.println("PfcCaretListener.caretPositionChanged.newLine:" + newLine);
        System.out.println("PfcCaretListener.caretPositionChanged.newColumn:" + newColumn);

        System.out.println("PfcCaretListener.caretPositionChanged.oldLine:" + oldLine);
        System.out.println("PfcCaretListener.caretPositionChanged.oldColumn:" + oldColumn);
    }

    @Override
    public void caretAdded(@NotNull CaretEvent event) {

    }

    @Override
    public void caretRemoved(@NotNull CaretEvent event) {
//        System.out.println("PfcCaretListener.caretRemoved");
    }
}
