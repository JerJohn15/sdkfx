package com.guigarage.sdk;

import com.guigarage.sdk.util.SimpleApplicationStarter;
import javafx.stage.Stage;

import java.util.function.Consumer;

/**
 * Created by hendrikebbers on 12.03.15.
 */
public class ApplicationFX {

    public static void run(Consumer<Stage> runner) {
        SimpleApplicationStarter.setStarter(runner);
        SimpleApplicationStarter.launch(SimpleApplicationStarter.class);
    }
}
