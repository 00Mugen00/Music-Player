package prMusicPlayer;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MusicPlayerPanel1 extends JPanel implements MusicPlayerView{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton play,pause,stop;
	public JLabel message;
	public MusicPlayerPanel1(){
		play=new JButton(PLAY);
		pause=new JButton(PAUSE);
		stop=new JButton(STOP);
		message=new JLabel();
		setLayout(new BorderLayout());
		JPanel centerPanel = new JPanel();
		
		centerPanel.add(play);
		centerPanel.add(pause);
		centerPanel.add(stop);
		
		JPanel southPanel = new JPanel();
		southPanel.add(message);
		
		add(centerPanel,BorderLayout.CENTER);
		add(southPanel,BorderLayout.SOUTH);
	}
	public void controller(ActionListener musicPlayerCtr) {
		play.addActionListener(musicPlayerCtr);
		play.setActionCommand(PLAY);
		pause.addActionListener(musicPlayerCtr);
		pause.setActionCommand(PAUSE);
		stop.addActionListener(musicPlayerCtr);
		stop.setActionCommand(STOP);
	}
	public void showMessage(String msg){
		message.setText(msg);
	}
}
