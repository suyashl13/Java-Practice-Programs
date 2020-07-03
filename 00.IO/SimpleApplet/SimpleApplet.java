import java.awt.*;
import java.applet.*;

/*
<applet code="SimpleApplet"width=200 height=60>
</applet>
*/

public class SimpleApplet extends Applet{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
        g.drawString("Simple Applet", 20, 20);
    }
}