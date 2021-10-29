package com.blueguagua.firstplugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MyDialog extends DialogWrapper {

    protected MyDialog() {
        super(true);
        super.setTitle("My标题");
        super.init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("my内容");
        jPanel.add(jLabel);
        return jPanel;
    }

    @Nullable
    @Override
    protected JComponent createNorthPanel() {
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("一个按钮");
        jButton.addActionListener(e -> {
            System.out.println("有人点击我了");
        });
        jPanel.add(jButton);
        return jPanel;
    }

    @Override
    protected JComponent createSouthPanel() {
        return super.createSouthPanel();
    }
}
