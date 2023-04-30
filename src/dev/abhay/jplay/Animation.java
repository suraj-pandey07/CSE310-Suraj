package dev.abhay.jplay;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Animation 
{
	JFrame frmAnimate;
	ImageIcon iconAnimateJplay, iconJplayIntro;
	JLabel lblJplayIntro;
	
	int width = 350;
	int height = 250;
	
	public void animate()
	{
		
		frmAnimate = new JFrame();
		frmAnimate.setSize(width, height);
		frmAnimate.setUndecorated(true);
		frmAnimate.setLayout(null);
		frmAnimate.setLocationRelativeTo(null);
		
		iconAnimateJplay  = new ImageIcon("src/assets/src/assets/PNGJplay.png");
		Image imageAnimateJplay = iconAnimateJplay.getImage();
		iconAnimateJplay.setImage(imageAnimateJplay);
		frmAnimate.setIconImage(imageAnimateJplay);
		
		iconJplayIntro = new ImageIcon("src/assets/LogoJplayPNG.png");
		Image imgJplayAnimateIntro = iconJplayIntro.getImage();
		imgJplayAnimateIntro = imgJplayAnimateIntro.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		iconJplayIntro.setImage(imgJplayAnimateIntro);
		
		lblJplayIntro = new JLabel(iconJplayIntro);
		lblJplayIntro.setBounds(0, 0, width, height);
		lblJplayIntro.setLayout(null);
		frmAnimate.getContentPane().add(lblJplayIntro);
		frmAnimate.setBackground(Color.black);
		
		frmAnimate.setVisible(true);
		
		new Thread()
		{
			public void run()
			{
				try
				{
					JPlay objJplay = new JPlay();
			
					sleep(1500);
					objJplay.init();
					frmAnimate.dispose();
				}
				catch (Exception e) {}
			}
		}.start();
	}//function animate() closed here
}
