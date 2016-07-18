package prMusicPlayer;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MusicPlayerDemo {
	public static void main(String[] args){
		MusicPlayer musicPlayer = new MusicPlayer("Blue.wav");
		MusicPlayerView musicPlayerView = new MusicPlayerPanel2();
		ActionListener musicPlayerCtr = new MusicPlayerCtr(musicPlayerView,musicPlayer);
		musicPlayerView.controller(musicPlayerCtr);
		JFrame window = new JFrame("Music Player");  	
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(290,125);
		window.setContentPane((JPanel) musicPlayerView);
		window.setVisible(true);    
		window.setResizable(false);
		
		ImageIcon img = new ImageIcon("icon.png");
		window.setIconImage(img.getImage());
	}
}
