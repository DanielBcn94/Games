package org.escoladeltreball.jackthegiant.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.escoladeltreball.jackthegiant.mainClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width=480;
		config.height=800;

		new LwjglApplication(new mainClass(), config);
	}
}
