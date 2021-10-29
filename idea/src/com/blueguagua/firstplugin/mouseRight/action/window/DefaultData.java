package com.blueguagua.firstplugin.mouseRight.action.window;

import javax.swing.table.DefaultTableModel;

public class DefaultData {

    //表格列表
    public static String[] HEAD = {"标题", "备注", "文件名", "代码段"};
    public static DefaultTableModel TABLE_MODEL = new DefaultTableModel(null, HEAD);

    static {
        TABLE_MODEL.addRow(new String[]{"111", "222", "3333", "444"});
    }
}
