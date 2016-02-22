package maniac.lee.easycoder;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;

/**
 * Created by peng on 16/2/23.
 */
public class LeeAction extends AnAction {
    public void actionPerformed(AnActionEvent e) {
        Application application = ApplicationManager.getApplication();

        LeeComponent myComponent = application.getComponent(LeeComponent.class);

        myComponent.sayHello();

    }
}
