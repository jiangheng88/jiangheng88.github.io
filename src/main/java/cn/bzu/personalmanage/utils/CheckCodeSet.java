package cn.bzu.personalmanage.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class CheckCodeSet {
	private int width;
	private int height;
	private int num;
	private String code;
	private static final Random ran = new Random();
	private static CheckCodeSet cc;
	private CheckCodeSet() {
		code="1234567890abcdefgjihud";
		num=4;
	}
	public static CheckCodeSet getInstance() {
		if(cc==null) {
			cc= new CheckCodeSet();
		}
		return cc;
	}
	public void set(int width,int height) {
		this.width= width;
		this.height= height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCode() {
		return code;
	}
	
	public String generateCheckCode() {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<num;i++) {
			sb.append(code.charAt(ran.nextInt(code.length())));
		}
		return sb.toString();
	}
	
	public BufferedImage generateCheckImg(String code) {
		
		//创建一个图片对象
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//获取图片的画笔
		Graphics2D graph = image.createGraphics();
		
		graph.setColor(Color.white);
		graph.fillRect(0, 0, width, height);
		graph.setColor(Color.BLACK);
		graph.drawRect(0, 0, width-1, height-1);
		
		Font font = new Font("微软雅黑",Font.BOLD+Font.ITALIC,(int)(height));
		graph.setFont(font);
		
		for(int i=0;i<num;i++) {
			graph.setColor(new Color(ran.nextInt(155),ran.nextInt(255),ran.nextInt(255)));
			graph.drawString(String.valueOf(code.charAt(i)), i*(width/num)+4,(int) ((int) height*0.8));
		}
		//加一些点
		for(int i=0;i<width+height;i++) {
			graph.setColor(new Color(ran.nextInt(155),ran.nextInt(255),ran.nextInt(255)));
			graph.drawOval(ran.nextInt(width), ran.nextInt(height), 1, 1);
		}
		//加一些线
		for(int i=0;i<2;i++) {
			graph.setColor(new Color(ran.nextInt(155),ran.nextInt(255),ran.nextInt(255)));
			graph.drawOval(0,ran.nextInt(height),width , ran.nextInt(height));
		}
		return image;
	}
	
}
