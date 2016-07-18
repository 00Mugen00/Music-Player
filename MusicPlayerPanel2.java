package prMusicPlayer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MusicPlayerPanel2 extends JPanel implements MusicPlayerView{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton play,pause,stop,open;
	public JLabel message;
	public MusicPlayerPanel2(){
		play=new JButton(PLAY);
		pause=new JButton(PAUSE);
		stop=new JButton(STOP);
		message=new JLabel("");
		open=new JButton(OPEN);
		setLayout(new BorderLayout());
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new FlowLayout());
		centerPanel.add(play);
		centerPanel.add(pause);
		centerPanel.add(stop);
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new BorderLayout());
		JPanel southSouthPanel = new JPanel();
		southSouthPanel.setLayout(new FlowLayout());
		southSouthPanel.add(open);
		southPanel.add(southSouthPanel,BorderLayout.SOUTH);
		
		JPanel southCenterPanel = new JPanel();
		southCenterPanel.setLayout(new FlowLayout());
		southCenterPanel.add(message);
		southPanel.add(southCenterPanel,BorderLayout.CENTER);
		
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
		open.addActionListener(musicPlayerCtr);
		open.setActionCommand(OPEN);
	}
	public void showMessage(String msg){
		message.setText(msg);
	}
	public File selectMusic(){
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(this);
		return fileChooser.getSelectedFile();
	}

}
