package prMusicPlayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicPlayerCtr implements ActionListener{
	private MusicPlayerView musicPlayerView;
	private MusicPlayer musicPlayer;
	public MusicPlayerCtr(MusicPlayerView musicPlayerView,MusicPlayer musicPlayer){
		this.musicPlayer=musicPlayer;
		this.musicPlayerView=musicPlayerView;
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch(command){
		case "PLAY":
			musicPlayer.play();
			musicPlayerView.showMessage("Music is playing");
			break;
		case "PAUSE":
			musicPlayer.pause();
			musicPlayerView.showMessage("Music paused");
			break;
		case "STOP":
			musicPlayer.stop();
			musicPlayerView.showMessage("Music stopped");
			break;
		}
	}

}
