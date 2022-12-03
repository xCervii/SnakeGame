package snakegame;

public class Vista extends javax.swing.JFrame{
    public Vista(){
        initComponents();
        PanelFondo fondo = new PanelFondo(800,30);
        this.add(fondo);
        fondo.setBounds(10,10,800,800);
    }

    private void initComponents() {

    }
}
