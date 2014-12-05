package com.basebox2d.gdx.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.basebox2d.gdx.BaseBox2dGdx;
import com.basebox2d.gdx.Physics;

public class AndroidLauncher extends AndroidApplication {

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		//initialize(new BaseBox2dGdx(), config);
        initialize(new Physics(), config);
	}
}
