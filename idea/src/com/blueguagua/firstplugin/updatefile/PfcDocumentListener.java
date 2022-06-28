package com.blueguagua.firstplugin.updatefile;

import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.editor.event.DocumentEvent;
import com.intellij.openapi.editor.event.DocumentListener;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

/***
 * 通过修改文件处理此类的监听
 *
 * @author
 */
public class PfcDocumentListener implements DocumentListener {

        private static VirtualFile file;
        private static Document document;

        public static VirtualFile getVirtualFile(){
                return file;
        }

        public static Document getDocument(){
                return document;
        }

        @Override
        public void beforeDocumentChange(@NotNull DocumentEvent event) {
                System.out.println();
        }

        @Override
        public void documentChanged( DocumentEvent event) {
                FileDocumentManager instance = FileDocumentManager.getInstance();
                document = event.getDocument();
                file = instance.getFile(document);
                System.out.println("PfcDocumentListener.documentChanged.file:" + file.getName());
                EditorFactory editorFactory = EditorFactory.getInstance();
                Editor[] editors = editorFactory.getEditors(event.getDocument());
        }
}