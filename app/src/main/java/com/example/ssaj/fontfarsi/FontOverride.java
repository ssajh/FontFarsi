package com.example.ssaj.fontfarsi;


import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by jefferson on 3/26/2017.
 */

public class FontOverride extends Application {
    public void onCreate()
    {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()

                .setDefaultFontPath("fonts/BZiba.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}