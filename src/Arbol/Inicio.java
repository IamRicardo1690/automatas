/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
/**
 *
 * @author Ricardo S.M
 */
public class Inicio extends JFrame {

    private JTextArea txt;
    private NodoBinario<String> raiz;
    
    public Inicio() {
        setLayout(new BorderLayout());     
        txt = new JTextArea();
        add(txt, BorderLayout.SOUTH);
        OutputStream os = new OutputStream() {
            @Override public void write(int b) throws IOException {
                txt.append("" + (char) b);
            }
        };
        System.setOut(new PrintStream(os));
           
        JButton b1 = new JButton(new ImageIcon(getClass().getResource("arbol1.png")));
        b1.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                txt.setText("Árbol 1\n");
                raiz = new NodoBinario<>(new NodoBinario<>("D", "B", "E"), "A", new NodoBinario<>("F", "C", "G"));
                ArbolBinario<String> arbol = new ArbolBinario<>(raiz);
                arbol.recorrer(ArbolBinario.recorrido.PREORDEN);
                arbol.recorrer(ArbolBinario.recorrido.ENORDEN);
                arbol.recorrer(ArbolBinario.recorrido.POSTORDEN);
            }
        });
        add(b1, BorderLayout.WEST);
        JButton b2 = new JButton(new ImageIcon(getClass().getResource("arbol2.png")));
        b2.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                txt.setText("Árbol 2\n");
                raiz = new NodoBinario<>(new NodoBinario<>(new NodoBinario<>((String)null, "A", null), "B", new NodoBinario<>("C", "D", "E")), "F", new NodoBinario<>(null, "G", new NodoBinario<>("H", "I", null)));
                ArbolBinario<String> arbol = new ArbolBinario<>(raiz);
                arbol.recorrer(ArbolBinario.recorrido.PREORDEN);
                arbol.recorrer(ArbolBinario.recorrido.ENORDEN);
                arbol.recorrer(ArbolBinario.recorrido.POSTORDEN);
            }
        });
        add(b2, BorderLayout.EAST);
        
        
        setTitle("Árbol binario");
        Dimension p = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((p.width - 500) / 2, (p.height - 400) / 2, 500, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inicio ini = new Inicio();
    }
}