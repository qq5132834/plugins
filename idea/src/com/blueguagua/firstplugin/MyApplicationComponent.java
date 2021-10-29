package com.blueguagua.firstplugin;

import com.intellij.openapi.components.ApplicationComponent;

/***
 * 1、在idea启动的时候初始化，整个idea中有一个实例
 * 2、在plugin.xml中加载配置元素<applicaton-componens>
 */
public class MyApplicationComponent implements ApplicationComponent {

    @Override
    public void initComponent() {
        System.out.println("MyApplicationComponent.initComponent");
        //启动idea时弹出一个对话框
        MyDialog myDialog = new MyDialog();
        myDialog.show();
    }

    @Override
    public void disposeComponent() {

    }
}
