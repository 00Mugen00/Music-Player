package prMusicPlayer;

import java.awt.event.ActionListener;
import java.io.File;

public interface MusicPlayerView {
	String PLAY = "PLAY";
	String PAUSE = "PAUSE";
	String STOP = "STOP";
	String OPEN = "OPEN";
	void controller(ActionListener musicPlayerCtr);
	void showMessage(String msg);
	File selectMusic();
}
