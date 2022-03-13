package com.rohitop.toolssample;

import android.app.Application;

import cat.ereza.customactivityoncrash.config.CaocConfig;

public class ToolsApp extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		
		CaocConfig.Builder.create()
			.backgroundMode(CaocConfig.BACKGROUND_MODE_SHOW_CUSTOM)
			.enabled(true)
			.showErrorDetails(true)
			.showRestartButton(true)
			.logErrorOnRestart(true) 
			.trackActivities(true)
			.minTimeBetweenCrashesMs(2000)
			.apply();
	}
}
