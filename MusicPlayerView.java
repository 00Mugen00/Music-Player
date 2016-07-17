package prMusicPlayer;

import java.awt.event.ActionListener;

public interface MusicPlayerView {
	String PLAY = "PLAY";
	String PAUSE = "PAUSE";
	String STOP = "STOP";
	void controller(ActionListener musicPlayerCtr);
	void showMessage(String msg);
}
