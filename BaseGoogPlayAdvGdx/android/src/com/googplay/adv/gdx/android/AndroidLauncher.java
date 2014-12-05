package com.googplay.adv.gdx.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.googplay.adv.gdx.BaseGoogPlayAdvGdx;

/**
 * https://github.com/TheInvader360/tutorial-libgdx-google-ads/blob/9a4c9342d98c02e3c44e0b62fcfaa153d257130a/tutorial-libgdx-google-ads-android/src/com/theinvader360/tutorial/libgdx/google/ads/MainActivity.java
 */

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new BaseGoogPlayAdvGdx(), config);
	}
}
