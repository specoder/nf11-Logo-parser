/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;

import org.antlr.tool.Interpreter;

/**
 * @author Claude Moulin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Traceur {
	private static Traceur instance;
	private Graphics2D g2d;
	private double initx = 300, inity = 300;   // position initiale
	private double posx = initx, posy = inity; // position courante
	private int angle = 90;
	private double teta;
	private boolean draw = true;

	public Traceur() {
		setTeta();
	}

	/**
	 * @return Returns the instance.
	 */
	public static Traceur getInstance() {

		if (instance == null)
			instance = new Traceur();
		else{
			instance.posx = instance.initx;
			instance.posy = instance.inity;
		}
		return instance;
		
		
	}

	public void setGraphics(Graphics g) {
		g2d = (Graphics2D) g;	
	}

	private int toInt(double a) {
		return (int) Math.round(a);
	}

	public void avance(double r) { // go straight
		double a = posx + r * Math.cos(teta) ;
		double b = posy - r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		
		if(draw)
			g2d.drawLine(x1,y1,x2,y2);
		posx = a;
		posy = b;
	}

	public void td(double r) { // turn right
		angle = (angle - toInt(r)) % 360;
		setTeta();
	}

	public void tg(double r) { // turn left
		angle = (angle + toInt(r)) % 360;
		setTeta();
	}

	public void rec(double r) { //step back
		double a = posx - r * Math.cos(teta) ;
		double b = posy + r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if(draw)
			g2d.drawLine(x1,y1,x2,y2);
		posx = a;
		posy = b;
	}

	public void fpos(double x, double y) { // fix position
		posx=x;
		posy=y;		
		//angle = 90; // initialize the angle
		setTeta();
	}

	public void fcap(double r){ // fix the direction of the cap
		angle = toInt(r);
		setTeta();
	}

	public void ve(){ // clear screen
		g2d.clearRect(0, 0, 1000, 1000);
	}

	public void lc(){ // without pencil
		draw = false;
	}
	
	public void bc(){ // with pencil
		draw = true;
	}
	
	public void fcc( double c){ // change color
		
		switch ((int)c%8){
		case 0: g2d.setColor(Color.black);break;
		case 1: g2d.setColor(Color.red);break;
		case 2: g2d.setColor(Color.green);break;
		case 3: g2d.setColor(Color.yellow);break;
		case 4: g2d.setColor(Color.blue);break;
		case 5: g2d.setColor(Color.magenta);break;
		case 6: g2d.setColor(Color.cyan);break;
		case 7: g2d.setColor(Color.white);break;
		default: break;
		}
	}

	private void setTeta() {
		teta = Math.toRadians(angle);
	}
}
