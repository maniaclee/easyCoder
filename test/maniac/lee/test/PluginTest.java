package maniac.lee.test;

import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;

/**
 * Created by peng on 16/2/26.
 */
public class PluginTest extends LightCodeInsightFixtureTestCase{

    public void testA(){
        new WriteCommandAction.Simple(getProject()) {
            @Override
            protected void run() throws Throwable {
                System.out.println(getApplication());
                System.out.println(getProject().getProjectFile());
                System.out.println(getProject().getWorkspaceFile());
//                CodeStyleManager.getInstance(getProject()).reformat(myFixture.getFile());
            }
        }.execute();
    }
}
