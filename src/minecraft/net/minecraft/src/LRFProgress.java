package net.minecraft.src;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.Dialog.ModalityType;
import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LRFProgress extends JOptionPane implements ILRFDownloadDisplay
{
    private JDialog container;
    private JLabel currentActivity;
    private JProgressBar progress;
    boolean stopIt = false;
    Thread pokeThread;
    
    public LRFProgress()
    {
    }

    private Box makeProgressPanel()
    {
        Box box = Box.createVerticalBox();
        JLabel welcomeLabel = new JLabel("<html><b><font size='+1'>Fixing your resources...</font></b></html>");
        box.add(welcomeLabel);
        welcomeLabel.setAlignmentY(0.0F);
        welcomeLabel = new JLabel("<html>Please wait while Legacy Resource Fixer downloads Minecraft's resources...</html>");
        welcomeLabel.setAlignmentY(0.0F);
        box.add(welcomeLabel);
        box.add(Box.createRigidArea(new Dimension(0, 10)));
        this.currentActivity = new JLabel("...");
        box.add(this.currentActivity);
        box.add(Box.createRigidArea(new Dimension(0, 20)));
        this.progress = new JProgressBar(0, 100);
        this.progress.setStringPainted(true);
        box.add(this.progress);
        return box;
    }

    public JDialog makeDialog()
    {
        this.setMessageType(1);
        this.setMessage(this.makeProgressPanel());
        this.setOptions(new Object[0]);
        this.addPropertyChangeListener(new PropertyChangeListener()
        {
//        	LRFProgressBar(LRFProgress progress)
//        	{
//        		this.progress = progress;
//        	}
        	
    		@Override
        	public void propertyChange(PropertyChangeEvent evt)
        	{
        		
        	}
        	
        });
        this.container = new JDialog((Window)null, "Legacy Resource Fixer", ModalityType.MODELESS);
        this.container.setResizable(false);
        this.container.setLocationRelativeTo((Component)null);
        this.container.add(this);
        this.updateUI();
        this.container.pack();
        this.container.setMinimumSize(this.container.getPreferredSize());
        this.container.setVisible(true);
        this.container.setDefaultCloseOperation(0);
        this.container.addWindowListener(new WindowAdapter()
        {
        	public void windowClosing(WindowEvent e)
        	{
        		requestClose("Are you sure you want to cancel Legacy Resource Fixer?");
        	}
        });
        return this.container;
    }

    protected void requestClose(String message)
    {
        int shouldClose = JOptionPane.showConfirmDialog(this.container, message, "Are you sure you want to cancel?", 0, 2);
        if (shouldClose == 0) {
            this.container.dispose();
        }

        this.stopIt = true;
    }

    public void updateProgressString(String progressUpdate, Object... data)
    {
        if (this.currentActivity != null)
        {
            this.currentActivity.setText(String.format(progressUpdate, data));
        }

    }

    public void resetProgress(int sizeGuess)
    {
        if (this.progress != null)
        {
            this.progress.getModel().setRangeProperties(0, 0, 0, sizeGuess, false);
        }

    }

    public void updateProgress(int fullLength)
    {
        if (this.progress != null)
        {
            this.progress.getModel().setValue(fullLength);
        }

    }

    public void makeHeadless()
    {
        this.container = null;
        this.progress = null;
        this.currentActivity = null;
    }

    public void setPokeThread(Thread currentThread)
    {
        this.pokeThread = currentThread;
    }

    public boolean shouldStopIt()
    {
        return this.stopIt;
    }
    
//    class LRFProgressBar implements PropertyChangeListener
//    {
//		
//    }
    
//    class LRFProgressWindow extends WindowAdapter
//    {
//    	LRFProgressWindow(LRFProgress progress)
//    	{
//    		this.progress = progress;
//    	}
//    	
//    	public void windowClosing(WindowEvent e)
//    	{
//    		this.progress.requestClose("Are you sure you want to cancel Legacy Resource Fixer?");
//    	}
//    }
    
}
