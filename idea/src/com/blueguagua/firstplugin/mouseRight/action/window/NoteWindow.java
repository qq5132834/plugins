package com.blueguagua.firstplugin.mouseRight.action.window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import org.jetbrains.annotations.NotNull;
public class NoteWindow {
    private JTextField tfTopic;
    private JTable tbContent;
    private JButton btnCreate;
    private JButton btnClear;
    private JButton btnClose;
    private JPanel contentPanel;

    public JPanel getContentPanel() {
        return contentPanel;
    }

    private void init(){
        //给按钮添加点击事件
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击创建按钮");
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击清空按钮");
            }
        });
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击关闭按钮");
            }
        });
        //设置表格数据
        this.tbContent.setModel(DefaultData.TABLE_MODEL); //绑定数据模型
        this.tbContent.setEnabled(true); //设置表格显示
    }

    public NoteWindow(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        this.init();
    }
}
