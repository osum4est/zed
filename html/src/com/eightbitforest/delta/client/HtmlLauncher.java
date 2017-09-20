package com.eightbitforest.delta.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.eightbitforest.delta.DeltaMain;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
            return new GwtApplicationConfiguration(320, 480);
        }

        @Override
        public ApplicationListener createApplicationListener () {
                return new DeltaMain();
        }
}