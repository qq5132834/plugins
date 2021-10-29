package com.blueguagua.firstplugin.mouseRight.action.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;


/***
 * 1、在这个工厂类中创建NoteWindow的窗口
 * 2、在plugin.xml中配置，
 *     <extensions defaultExtensionNs = "com.intellij">
 *         <toolWindow id = 'NoteWindow'
 *                     factoryClass = "com.blueguagua.firstplugin.mouseRight.action.window.NodeWindowFactory"
 *                     anchor = "right"
 *                     icon = "/img/log.svg">
 *         </toolWindow>
 *     </extensions>
 */
public class NodeWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {

        //
        NoteWindow noteWindow = new NoteWindow(project, toolWindow);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(noteWindow.getContentPanel(), "", false);

        //
        toolWindow.getContentManager().addContent(content);
    }
}
