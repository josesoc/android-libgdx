package com.basebox2d.gdx.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.basebox2d.gdx.BaseBox2dGdx;
import com.basebox2d.gdx.Physics;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//new LwjglApplication(new BaseBox2dGdx(), config);
        new LwjglApplication(new Physics(), config);
	}
}
