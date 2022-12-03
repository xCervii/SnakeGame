package snakegame;

import javax.swing.*;
import java.awt.*;

public class PanelFondo extends JPanel {
    Color colorfondo = Color.gray;
    int tammax,tam,can;

    public PanelFondo(int tammax, int can){
        this.tammax=tammax;
        this.can=can;
        this.tam=tammax/can;
    }
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(colorfondo);
        for (int i=0;i<can;i++){
            for (int j=0;j<can;j++){
                pintor.drawRect(i*tam,j*tam,tam-1,tam-1);
            }
        }
    }
}
