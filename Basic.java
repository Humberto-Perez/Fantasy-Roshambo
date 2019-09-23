package basic;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Humberto
 */

public class Basic 
{
    private final int wide = 600;
    private final int taller = 400;
    int p = 0;
    int q = 0;
    Roshambu r;
    int player;
    ImageIcon i2 = new ImageIcon("wizard1.gif");
    ImageIcon i3 = new ImageIcon("Barbarian_diablo_II.gif");
    ImageIcon i4 = new ImageIcon("fireghost.gif");
    
    public static void main(String[] args) throws IOException 
    {
        Basic b = new Basic();
        b.window();
    }
    
    public void window() throws IOException
    {
        JFrame ame = new JFrame("Tournament of Champions");
        Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
        ame.setIconImage(title);
        ame.setSize(wide, taller);
        ame.setVisible(true);
        ame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p = new JPanel();
        p.setBackground(Color.BLACK);
        p.setLayout(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();
        JLabel l = new JLabel("You're now at the start of the tournament");
        l.setForeground(Color.red);
        gb.insets = new Insets(10,10,10,10);
        gb.gridx = 1;
        gb.gridy = 1;
        p.add(l, gb);
        
        JLabel pic = new JLabel();
        ImageIcon i = new ImageIcon("animated_torch.gif");
        pic.setIcon(i);
        gb.gridx = 0;
        gb.gridy = 1;
        p.add(pic, gb);
        
        JLabel pic2 = new JLabel();
        pic2.setIcon(i);
        gb.gridx = 2;
        gb.gridy = 1;
        p.add(pic2, gb);
        
        JButton start = new JButton("Start");
        JButton rules = new JButton("Rules");
        buttonstart sb = new buttonstart();
        rulesbutton rb = new rulesbutton();
        rules.addActionListener(rb);
        start.addActionListener(sb);
        gb.gridx = 1;
        gb.gridy = 4;
        p.add(start, gb);
        gb.gridx = 1;
        gb.gridy = 3;
        p.add(rules, gb);
        ame.getContentPane().add(p).revalidate();
        
    }
    public class rulesbutton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame ame = new JFrame("Welcome");
            Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
            ame.setIconImage(title);
            ame.setSize(wide, taller);
            ame.setVisible(true);
            
            JPanel p = new JPanel();
            p.setBackground(Color.BLACK);
            p.setLayout(new GridBagLayout());
            ame.add(p);
            GridBagConstraints gb = new GridBagConstraints();
            JLabel l = new JLabel("Tournament Rules:");
            l.setForeground(Color.yellow);
            gb.insets = new Insets(10,10,10,10);
            gb.gridx = 1;
            gb.gridy = 0;
            p.add(l, gb);
            JLabel lb = new JLabel("In this contest first to claim two victories out of three battles wins");
            lb.setForeground(Color.yellow);
            gb.gridx = 1;
            gb.gridy = 1;
            p.add(lb, gb);

            JLabel pic = new JLabel();
            ImageIcon i = new ImageIcon("animated_torch.gif");
            pic.setIcon(i);
            gb.gridx = 0;
            gb.gridy = 1;
            p.add(pic, gb);

            JLabel pic2 = new JLabel();
            pic2.setIcon(i);
            gb.gridx = 2;
            gb.gridy = 1;
            p.add(pic2, gb);
            
            JLabel text =  new JLabel("Sorcerers surpass Undead"); JLabel text2 = new JLabel("Undead defeats Berserkers"); JLabel text3 = new JLabel("Berserkers beat Sorcerers");
            JLabel text4 = new JLabel("Good Luck!");
            text.setForeground(Color.yellow);text2.setForeground(Color.yellow);text3.setForeground(Color.yellow);text4.setForeground(Color.yellow);
            gb.gridx = 1;
            gb.gridy = 2;
            p.add(text, gb);
            gb.gridx = 1;
            gb.gridy = 3;
            p.add(text2, gb);
            gb.gridx = 1;
            gb.gridy = 4;
            p.add(text3, gb);
            gb.gridx = 1;
            gb.gridy = 5;
            p.add(text4, gb);
        }
    }
    
    public class buttonstart implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
            {
            JFrame choose = new JFrame("Make your choice");
            Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
            choose.setIconImage(title);
            choose.setVisible(true);
            choose.setSize(wide, taller);
            choose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel panel = new JPanel();
            panel.setBackground(Color.BLACK);
            panel.setLayout(new GridBagLayout());
            GridBagConstraints g = new GridBagConstraints();
            g.insets = new Insets(10,10,10,10);
            choose.add(panel);
            
            JLabel pics2 = new JLabel();
            pics2.setIcon(i4);
            g.gridx = 1;
            g.gridy = 0;
            panel.add(pics2, g);
            JButton ghost = new JButton("Undead");
            g.gridx = 1;
            g.gridy = 1;
            panel.add(ghost, g);
            
            JLabel pic = new JLabel();
            pic.setIcon(i2);
            g.gridx = 0;
            g.gridy = 0;
            panel.add(pic, g);
            JButton wizard = new JButton("Sorcerer");
            g.gridx = 0;
            g.gridy = 1;
            panel.add(wizard, g);
            
            JLabel pics = new JLabel();
            pics.setIcon(i3);
            g.gridx = 2;
            g.gridy = 0;
            panel.add(pics, g);
            JButton barbarian = new JButton("Berserker");
            g.gridx = 2;
            g.gridy = 1;
            panel.add(barbarian, g);
            
            wbutton wb = new wbutton();
            wizard.addActionListener(wb);
            gbutton gbu = new gbutton();
            ghost.addActionListener(gbu);
            bbutton bb = new bbutton();
            barbarian.addActionListener(bb);
        }
    }
        
    public class nextroundb implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(q < 2 && p < 2)
            {
            JFrame choose = new JFrame("Make your choice");
            Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
            choose.setIconImage(title);
            choose.setVisible(true);
            choose.setSize(wide, taller);
            choose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel panel = new JPanel();
            panel.setBackground(Color.BLACK);
            panel.setLayout(new GridBagLayout());
            GridBagConstraints g = new GridBagConstraints();
            g.insets = new Insets(10,10,10,10);
            choose.add(panel);
            
            JLabel pics2 = new JLabel();
            pics2.setIcon(i4);
            g.gridx = 1;
            g.gridy = 0;
            panel.add(pics2, g);
            JButton ghost = new JButton("Undead");
            g.gridx = 1;
            g.gridy = 1;
            panel.add(ghost, g);
            
            JLabel pic = new JLabel();
            pic.setIcon(i2);
            g.gridx = 0;
            g.gridy = 0;
            panel.add(pic, g);
            JButton wizard = new JButton("Sorcerer");
            g.gridx = 0;
            g.gridy = 1;
            panel.add(wizard, g);
            
            JLabel pics = new JLabel();
            pics.setIcon(i3);
            g.gridx = 2;
            g.gridy = 0;
            panel.add(pics, g);
            JButton barbarian = new JButton("Berserker");
            g.gridx = 2;
            g.gridy = 1;
            panel.add(barbarian, g);
            
            wbutton wb = new wbutton();
            wizard.addActionListener(wb);
            gbutton gbu = new gbutton();
            ghost.addActionListener(gbu);
            bbutton bb = new bbutton();
            barbarian.addActionListener(bb);
            }
            else
                if(q == 2)
                {
                    JFrame ame = new JFrame("Woe is You");
                    Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
                    ame.setIconImage(title);
                    ame.setSize(wide, taller);
                    ame.setVisible(true);
                    ame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    JPanel pl = new JPanel();
                    pl.setBackground(Color.BLACK);
                    ame.add(pl);
                    pl.setLayout(new GridBagLayout());
                    GridBagConstraints gb = new GridBagConstraints();
                    JLabel l = new JLabel("Alas you lost the tournament: " + q + " to " + p);
                    l.setForeground(Color.red);
                    gb.insets = new Insets(10,10,10,10);
                    gb.gridx = 1;
                    gb.gridy = 1;
                    pl.add(l, gb);

                    JLabel pic = new JLabel();
                    ImageIcon i = new ImageIcon("animated_torch.gif");
                    pic.setIcon(i);
                    gb.gridx = 0;
                    gb.gridy = 1;
                    pl.add(pic, gb);

                    JLabel pic2 = new JLabel();
                    pic2.setIcon(i);
                    gb.gridx = 2;
                    gb.gridy = 1;
                    pl.add(pic2, gb);
                }
                else 
                    if(p == 2)
                    {
                        JFrame ame = new JFrame("Huzzah");
                        Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
                        ame.setIconImage(title);
                        ame.setSize(wide, taller);
                        ame.setVisible(true);
                        ame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        JPanel pl = new JPanel();
                        pl.setBackground(Color.BLACK);
                        ame.add(pl);
                        pl.setLayout(new GridBagLayout());
                        GridBagConstraints gb = new GridBagConstraints();
                        JLabel l = new JLabel("You prove triumphant in the tournament: " + p +" to " + q);
                        l.setForeground(Color.red);
                        gb.insets = new Insets(10,10,10,10);
                        gb.gridx = 1;
                        gb.gridy = 1;
                        pl.add(l, gb);

                        JLabel pic = new JLabel();
                        ImageIcon i = new ImageIcon("animated_torch.gif");
                        pic.setIcon(i);
                        gb.gridx = 0;
                        gb.gridy = 1;
                        pl.add(pic, gb);

                        JLabel pic2 = new JLabel();
                        pic2.setIcon(i);
                        gb.gridx = 2;
                        gb.gridy = 1;
                        pl.add(pic2, gb);
                    }
        }
    }
    
    public class wbutton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame choose = new JFrame("Magus Supreme");
            Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
            choose.setIconImage(title);
            choose.setVisible(true);
            choose.setSize(wide, taller);
                        
            JPanel panel = new JPanel();
            panel.setBackground(Color.BLACK);
            panel.setLayout(new GridBagLayout());
            GridBagConstraints g = new GridBagConstraints();
            g.insets = new Insets(10,10,10,10);
            choose.add(panel);
            
            JLabel pic = new JLabel();
            pic.setIcon(i2);
            g.gridx = 1;
            g.gridy = 0;
            panel.add(pic, g);
            JButton starter = new JButton("Battle");
            g.gridx = 1;
            g.gridy = 1;
            panel.add(starter, g);
            startup su = new startup();
            starter.addActionListener(su);
            
            player = 0;
        }
    }
    
    public class gbutton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame choose = new JFrame("Litch King");
            Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
            choose.setIconImage(title);
            choose.setVisible(true);
            choose.setSize(wide, taller);
            
            JPanel panel = new JPanel();
            panel.setBackground(Color.BLACK);
            panel.setLayout(new GridBagLayout());
            GridBagConstraints g = new GridBagConstraints();
            g.insets = new Insets(10,10,10,10);
            choose.add(panel);
            
            JLabel pics2 = new JLabel();
            pics2.setIcon(i4);
            g.gridx = 1;
            g.gridy = 0;
            panel.add(pics2, g);
            JButton starter = new JButton("Battle");
            g.gridx = 1;
            g.gridy = 1;
            panel.add(starter, g);
            startup su = new startup();
            starter.addActionListener(su);
            
            player = 1;
        }
    }
    
    public class bbutton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame choose = new JFrame("Red Knight");
            Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
            choose.setIconImage(title);
            choose.setVisible(true);
            choose.setSize(wide, taller);
            
            JPanel panel = new JPanel();
            panel.setBackground(Color.BLACK);
            panel.setLayout(new GridBagLayout());
            GridBagConstraints g = new GridBagConstraints();
            g.insets = new Insets(10,10,10,10);
            choose.add(panel);
            
            JLabel pics = new JLabel();
            pics.setIcon(i3);
            g.gridx = 1;
            g.gridy = 0;
            panel.add(pics, g);
            JButton starter = new JButton("Battle");
            g.gridx = 1;
            g.gridy = 1;
            panel.add(starter, g);
            startup su = new startup();
            starter.addActionListener(su);
            
            player = 2;
        }
    }
    
    public class startup implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int side;
            r = new Roshambu(3);
            for(int i = 0; i<1; i++)
            {
                side = r.rolls();
                if(side == 2)
                {
                    oneside();
                }
                else
                    if(side == 1)
                    {
                        twoside();
                    }
                else
                    thirdside();
            }
        }
    }
    
    public void oneside()
    {
        if(player == 2)
        {
            JFrame tied = new JFrame("Equality");
            Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
            tied.setIconImage(title);
            tied.setVisible(true);
            tied.setSize(wide, taller);
            tied.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel tpanel = new JPanel();
            tpanel.setBackground(Color.BLACK);
            tpanel.setLayout(new GridBagLayout());
            GridBagConstraints g = new GridBagConstraints();
            g.insets = new Insets(10,10,10,10);
            tied.add(tpanel);
            
            JLabel image = new JLabel("You Tied");
            image.setForeground(Color.red);
            g.gridx = 1;
            g.gridy = 0;
            tpanel.add(image, g);
            
            JLabel tpics = new JLabel();
            tpics.setIcon(i3);
            g.gridx = 1;
            g.gridy = 1;
            tpanel.add(tpics, g);
            
            JLabel text = new JLabel("Your might was too evenly matched");
            text.setForeground(Color.red);
            g.gridx = 1;
            g.gridy = 2;
            tpanel.add(text, g);
            
            JButton nextround = new JButton("Next Round");
            nextroundb nrb = new nextroundb();
            nextround.addActionListener(nrb);
            g.gridx = 1;
            g.gridy = 3;
            tpanel.add(nextround, g);
        }
        else
            if(player == 1)
            {
                JFrame won = new JFrame("Victory");
                Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
                won.setIconImage(title);
                won.setVisible(true);
                won.setSize(wide, taller);
                won.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel wpanel = new JPanel();
                wpanel.setBackground(Color.BLACK);
                wpanel.setLayout(new GridBagLayout());
                GridBagConstraints g = new GridBagConstraints();
                g.insets = new Insets(10,10,10,10);
                won.add(wpanel);
                
                JLabel image = new JLabel("You won");
                image.setForeground(Color.red);
                g.gridx = 1;
                g.gridy = 0;
                wpanel.add(image, g);
                
                JLabel pics2 = new JLabel();
                pics2.setIcon(i4);
                g.gridx = 1;
                g.gridy = 1;
                wpanel.add(pics2, g);
                
                JLabel text = new JLabel("Your lack of corporeal form left the beserker bewildered allowing you to win easily");
                text.setForeground(Color.red);
                g.gridx = 1;
                g.gridy = 2;
                wpanel.add(text, g);
                p++;
                
                JButton nextround = new JButton("Next Round");
                nextroundb nrb = new nextroundb();
                nextround.addActionListener(nrb);
                g.gridx = 1;
                g.gridy = 3;
                wpanel.add(nextround, g);
            }
        else
                if(player == 0)
                {
                    JFrame lost = new JFrame("Misery");
                    Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
                    lost.setIconImage(title);
                    lost.setVisible(true);
                    lost.setSize(wide, taller);
                    lost.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    JPanel lpanel = new JPanel();
                    lpanel.setBackground(Color.BLACK);
                    lpanel.setLayout(new GridBagLayout());
                    GridBagConstraints g = new GridBagConstraints();
                    g.insets = new Insets(10,10,10,10);
                    lost.add(lpanel);
                    
                    JLabel image = new JLabel("You Lost");
                    image.setForeground(Color.red);
                    g.gridx = 1;
                    g.gridy = 0;
                    lpanel.add(image, g);
            
                    JLabel pic = new JLabel();
                    pic.setIcon(i3);
                    g.gridx = 1;
                    g.gridy = 1;
                    lpanel.add(pic, g);
                    
                    JLabel text = new JLabel("You underestimated the berserker's speed he sliced you down swiftly");
                    text.setForeground(Color.red);
                    g.gridx = 1;
                    g.gridy = 2;
                    lpanel.add(text, g);
                    q++;
                    
                    JButton nextround = new JButton("Next Round");
                    nextroundb nrb = new nextroundb();
                    nextround.addActionListener(nrb);
                    g.gridx = 1;
                    g.gridy = 3;
                    lpanel.add(nextround, g);
                }
    }
    public void twoside()
    {
        if(player == 1)
        {
            JFrame tied = new JFrame("Equality");
            Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
            tied.setIconImage(title);
            tied.setVisible(true);
            tied.setSize(wide, taller);
            tied.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel tpanel = new JPanel();
            tpanel.setBackground(Color.BLACK);
            tpanel.setLayout(new GridBagLayout());
            GridBagConstraints g = new GridBagConstraints();
            g.insets = new Insets(10,10,10,10);
            tied.add(tpanel);
            
            JLabel image = new JLabel("You Tied");
            image.setForeground(Color.red);
            g.gridx = 1;
            g.gridy = 0;
            tpanel.add(image, g);
            
            JLabel pics2 = new JLabel();
            pics2.setIcon(i4);
            g.gridx = 1;
            g.gridy = 1;
            tpanel.add(pics2, g);
            
            JLabel text = new JLabel("Your might was too evenly matched");
            text.setForeground(Color.red);
            g.gridx = 1;
            g.gridy = 2;
            tpanel.add(text, g);
            
            JButton nextround = new JButton("Next Round");
            nextroundb nrb = new nextroundb();
            nextround.addActionListener(nrb);
            g.gridx = 1;
            g.gridy = 3;
            tpanel.add(nextround, g);
        }
        else
            if(player == 0)
            {
                JFrame won = new JFrame("Victory");
                Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
                won.setIconImage(title);
                won.setVisible(true);
                won.setSize(wide, taller);
                won.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel wpanel = new JPanel();
                wpanel.setBackground(Color.BLACK);
                wpanel.setLayout(new GridBagLayout());
                GridBagConstraints g = new GridBagConstraints();
                g.insets = new Insets(10,10,10,10);
                won.add(wpanel);
                
                JLabel image = new JLabel("You won");
                image.setForeground(Color.red);
                g.gridx = 1;
                g.gridy = 0;
                wpanel.add(image, g);
                
                JLabel pics2 = new JLabel();
                pics2.setIcon(i2);
                g.gridx = 1;
                g.gridy = 1;
                wpanel.add(pics2, g);
                
                JLabel text = new JLabel("Your knowledge of the arcane proved triumphant as you best the undead warrior");
                text.setForeground(Color.red);
                g.gridx = 1;
                g.gridy = 2;
                wpanel.add(text, g);
                p++;
                
                JButton nextround = new JButton("Next Round");
                nextroundb nrb = new nextroundb();
                nextround.addActionListener(nrb);
                g.gridx = 1;
                g.gridy = 3;
                wpanel.add(nextround, g);
            }
        else
                if(player == 2)
                {
                    JFrame lost = new JFrame("Misery");
                    Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
                    lost.setIconImage(title);
                    lost.setVisible(true);
                    lost.setSize(wide, taller);
                    lost.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    JPanel lpanel = new JPanel();
                    lpanel.setBackground(Color.BLACK);
                    lpanel.setLayout(new GridBagLayout());
                    GridBagConstraints g = new GridBagConstraints();
                    g.insets = new Insets(10,10,10,10);
                    lost.add(lpanel);
                    
                    JLabel image = new JLabel("You Lost");
                    image.setForeground(Color.red);
                    g.gridx = 1;
                    g.gridy = 0;
                    lpanel.add(image, g);
                    
                    JLabel pics2 = new JLabel();
                    pics2.setIcon(i4);
                    g.gridx = 1;
                    g.gridy = 1;
                    lpanel.add(pics2, g);

                    JLabel text = new JLabel("Your strength and speed were useless against an opponent you couldn't hit");
                    text.setForeground(Color.red);
                    g.gridx = 1;
                    g.gridy = 2;
                    lpanel.add(text, g);
                    q++;
                    
                    JButton nextround = new JButton("Next Round");
                    nextroundb nrb = new nextroundb();
                    nextround.addActionListener(nrb);
                    g.gridx = 1;
                    g.gridy = 3;
                    lpanel.add(nextround, g);
                }
    }
    public void thirdside()
    {
        if(player == 0)
        {
            JFrame tied = new JFrame("Equality");
            Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
            tied.setIconImage(title);
            tied.setVisible(true);
            tied.setSize(wide, taller);
            tied.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel tpanel = new JPanel();
            tpanel.setBackground(Color.BLACK);
            tpanel.setLayout(new GridBagLayout());
            GridBagConstraints g = new GridBagConstraints();
            g.insets = new Insets(10,10,10,10);
            tied.add(tpanel);
            
            JLabel image = new JLabel("You Tied");
            image.setForeground(Color.red);
            g.gridx = 1;
            g.gridy = 0;
            tpanel.add(image, g);
            
            JLabel pics2 = new JLabel();
            pics2.setIcon(i2);
            g.gridx = 1;
            g.gridy = 1;
            tpanel.add(pics2, g);
            
            JLabel text = new JLabel("Your might was too evenly matched");
            text.setForeground(Color.red);
            g.gridx = 1;
            g.gridy = 2;
            tpanel.add(text, g);
            
            JButton nextround = new JButton("Next Round");
            nextroundb nrb = new nextroundb();
            nextround.addActionListener(nrb);
            g.gridx = 1;
            g.gridy = 3;
            tpanel.add(nextround, g);
        }
        else
            if(player == 2)
            {
                JFrame won = new JFrame("Victory");
                Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
                won.setIconImage(title);
                won.setVisible(true);
                won.setSize(wide, taller);
                won.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel wpanel = new JPanel();
                wpanel.setBackground(Color.BLACK);
                wpanel.setLayout(new GridBagLayout());
                GridBagConstraints g = new GridBagConstraints();
                g.insets = new Insets(10,10,10,10);
                won.add(wpanel);
                
                JLabel image = new JLabel("You won");
                image.setForeground(Color.red);
                g.gridx = 1;
                g.gridy = 0;
                wpanel.add(image, g);
                
                JLabel pics2 = new JLabel();
                pics2.setIcon(i3);
                g.gridx = 1;
                g.gridy = 1;
                wpanel.add(pics2, g);
                
                JLabel text = new JLabel("Your might and speed proved to be quicker than the wizards spells you win without a second passing");
                text.setForeground(Color.red);
                g.gridx = 1;
                g.gridy = 2;
                wpanel.add(text, g);
                p++;
                
                JButton nextround = new JButton("Next Round");
                nextroundb nrb = new nextroundb();
                nextround.addActionListener(nrb);
                g.gridx = 1;
                g.gridy = 3;
                wpanel.add(nextround, g);
            }
        else
                if(player == 1)
                {
                    JFrame lost = new JFrame("Misery");
                    Image title = Toolkit.getDefaultToolkit().getImage("helmet.jpg");
                    lost.setIconImage(title);
                    lost.setVisible(true);
                    lost.setSize(wide, taller);
                    lost.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    JPanel lpanel = new JPanel();
                    lpanel.setBackground(Color.BLACK);
                    lpanel.setLayout(new GridBagLayout());
                    GridBagConstraints g = new GridBagConstraints();
                    g.insets = new Insets(10,10,10,10);
                    lost.add(lpanel);
                    
                    JLabel image = new JLabel("You Lost");
                    image.setForeground(Color.red);
                    g.gridx = 1;
                    g.gridy = 0;
                    lpanel.add(image, g);
                    
                    JLabel pics2 = new JLabel();
                    pics2.setIcon(i2);
                    g.gridx = 1;
                    g.gridy = 1;
                    lpanel.add(pics2, g);

                    JLabel text = new JLabel("Your other worldly abilities were not enough to slow down the sorcerer");
                    text.setForeground(Color.red);
                    g.gridx = 1;
                    g.gridy = 2;
                    lpanel.add(text, g);
                    q++;
                    
                    JButton nextround = new JButton("Next Round");
                    nextroundb nrb = new nextroundb();
                    nextround.addActionListener(nrb);
                    g.gridx = 1;
                    g.gridy = 3;
                    lpanel.add(nextround, g);
                }
            }
        }
}      