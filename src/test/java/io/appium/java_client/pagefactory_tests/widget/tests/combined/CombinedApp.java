package io.appium.java_client.pagefactory_tests.widget.tests.combined;

import io.appium.java_client.pagefactory.OverrideWidget;
import io.appium.java_client.pagefactory_tests.widget.tests.AbstractApp;
import io.appium.java_client.pagefactory_tests.widget.tests.AbstractWidget;
import io.appium.java_client.pagefactory_tests.widget.tests.android.DefaultAndroidWidget;
import io.appium.java_client.pagefactory_tests.widget.tests.ios.DefaultIosWidget;
import io.appium.java_client.pagefactory_tests.widget.tests.windows.DefaultWindowsWidget;

import java.util.List;

public class CombinedApp implements AbstractApp {

    @OverrideWidget(html = DefaultFindByWidget.class,
            androidUIAutomator = DefaultAndroidWidget.class,
            iOSUIAutomation = DefaultIosWidget.class,
            iOSXCUITAutomation = DefaultIosXCUITWidget.class,
            windowsAutomation = DefaultWindowsWidget.class
    )
    private AbstractWidget singleWidget;

    @OverrideWidget(html = DefaultFindByWidget.class,
            androidUIAutomator = DefaultAndroidWidget.class,
            iOSUIAutomation = DefaultIosWidget.class,
            iOSXCUITAutomation = DefaultIosXCUITWidget.class,
            windowsAutomation = DefaultWindowsWidget.class
    )
    private List<AbstractWidget> multipleWidget;

    @Override
    public <T extends AbstractWidget> T getWidget() {
        return null;
    }

    @Override
    public <T extends AbstractWidget> List<T> getWidgets() {
        return null;
    }
}
