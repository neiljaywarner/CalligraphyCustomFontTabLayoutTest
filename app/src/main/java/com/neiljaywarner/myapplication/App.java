package com.neiljaywarner.myapplication;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by neil on 1/15/16.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/TAGACNBI.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
