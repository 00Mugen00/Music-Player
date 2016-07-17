package prMusicPlayer;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
	private Clip soundClip;
	private int currentFrame;
	public MusicPlayer(String name) {
		currentFrame=0;
		File file = new File(name);
		AudioInputStream audioInputStream;
		try {
			audioInputStream = AudioSystem.getAudioInputStream(file);
			soundClip = AudioSystem.getClip();
			soundClip.open(audioInputStream);
		} catch (UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}

	public void play() {
		soundClip.setFramePosition(currentFrame);
		soundClip.start();
		soundClip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public void pause(){
		currentFrame=soundClip.getFramePosition();
		soundClip.stop();
	}

	public void stop() {
		soundClip.stop();
		currentFrame=0;
	}
}
