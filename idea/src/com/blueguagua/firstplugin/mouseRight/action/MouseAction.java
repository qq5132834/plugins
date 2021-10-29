package com.blueguagua.firstplugin.mouseRight.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;

/***
 * 右键鼠标
 */
public class MouseAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        System.out.println("右键鼠标");
        this.printlnMouseSelectedText(e);
    }

    /***
     * 打印鼠标选择的内容
     */
    private void printlnMouseSelectedText(AnActionEvent e){
        String fileName = e.getRequiredData(CommonDataKeys.PSI_FILE).getViewProvider().getVirtualFile().getName();
//        System.out.println("文件名是：" + fileName);

        Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        SelectionModel selectionModel = editor.getSelectionModel();
        String selectedText = selectionModel.getSelectedText();
        System.out.println("鼠标选择了文件[" + fileName + "]中的内容:");
        System.out.println(selectedText);


    }

}
