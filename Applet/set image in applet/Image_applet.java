import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
class Image_applet extends Applet{
	Image i;
	URL u;
	public void start(){
		u=getDocumentBase();
		String s=getParameter("Image");
		i=getImage(u,s);

	}
	public void paint(Graphics g)
	{
		g.drawImage(i,100,100,this);
		g.drawString(u.toString(),10,10);
	}
}
