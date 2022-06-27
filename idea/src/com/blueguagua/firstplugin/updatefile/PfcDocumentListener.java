package com.blueguagua.firstplugin.updatefile;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.editor.event.DocumentEvent;
import com.intellij.openapi.editor.event.DocumentListener;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.vfs.VirtualFile;

/***
 *
 * @author
 */
public class PfcDocumentListener implements DocumentListener {

public static int a = 1;

@Override
public void documentChanged( DocumentEvent event) {
        FileDocumentManager instance = FileDocumentManager.getInstance();
        VirtualFile file = instance.getFile(event.getDocument());
        EditorFactory editorFactory = EditorFactory.getInstance();
        Editor[] editors = editorFactory.getEditors(event.getDocument());
        System.out.println("PfcDocumentListener.documentChanged.file:" + file.getName());
        }
        }