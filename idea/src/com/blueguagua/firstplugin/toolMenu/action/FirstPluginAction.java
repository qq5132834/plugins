package com.blueguagua.firstplugin.toolMenu.action;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;

/***
 * 工具栏菜单
 */
public class FirstPluginAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        System.out.println("FirstPluginAction.actionPerformed");
        NotificationGroup notificationGroup = new NotificationGroup("blueguagua第一个插件", NotificationDisplayType.BALLOON, true);
        Notification notification = notificationGroup.createNotification("点击测试", MessageType.INFO);
        Notifications.Bus.notify(notification);
    }
}
