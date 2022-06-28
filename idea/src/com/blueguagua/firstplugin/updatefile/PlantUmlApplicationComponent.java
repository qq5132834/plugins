package com.blueguagua.firstplugin.updatefile;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.editor.event.CaretListener;
import com.intellij.openapi.editor.event.DocumentListener;
import com.intellij.openapi.editor.event.EditorEventMulticaster;

public class PlantUmlApplicationComponent implements ApplicationComponent {
    //private DocumentListener plantUmlDocumentListener = new PfcDocumentListener();
    private PfcCaretListener pfcCaretListener = new PfcCaretListener();

    public PlantUmlApplicationComponent() {
        PlantUmlApplicationComponent.class.getClassLoader().setDefaultAssertionStatus(false);
    }

    @Override
    public void initComponent() {
        EditorEventMulticaster eventMulticaster = EditorFactory.getInstance().getEventMulticaster();
        eventMulticaster.addDocumentListener(pfcCaretListener);
//        eventMulticaster.addCaretListener(pfcCaretListener);
    }

    @Override
    public void disposeComponent() {
       // EditorEventMulticaster eventMulticaster = EditorFactory.getInstance().getEventMulticaster();
       // eventMulticaster.removeDocumentListener(plantUmlDocumentListener);
       // eventMulticaster.removeCaretListener(pfcCaretListener);
    }

    @Override
    public String getComponentName() {
        return "PlantUmlApplicationComponent";
    }

}
