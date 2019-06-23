package net.minecraft.src;

import java.awt.Component;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class LRFProgress extends JOptionPane implements ILRFDownloadDisplay
{
    private JDialog container;
    private JLabel currentActivity;
    private JProgressBar progress;
    boolean stopIt = false;
    Thread pokeThread;

	private Box makeProgressPanel()
	{
		Box box = Box.createVerticalBox();
		//box.add(Box.createRigidArea(new Dimension(0,0)));
		JLabel welcomeLabel = new JLabel("<html><b><font size='+1'>Fixing your resources...</font></b></html>");
		box.add(welcomeLabel);
		welcomeLabel.setAlignmentY(LEFT_ALIGNMENT);
		welcomeLabel = new JLabel("<html>Please wait while Legacy Resource Fixer downloads Minecraft's resources...</html>");
		welcomeLabel.setAlignmentY(LEFT_ALIGNMENT);
		box.add(welcomeLabel);
		box.add(Box.createRigidArea(new Dimension(0,10)));
		currentActivity = new JLabel("...");
		box.add(currentActivity);
		box.add(Box.createRigidArea(new Dimension(0,20)));
		progress = new JProgressBar(0, 100);
		progress.setStringPainted(true);
		box.add(progress);
		return box;
	}

	public JDialog makeDialog()
	{
		setMessageType(JOptionPane.INFORMATION_MESSAGE);
		setMessage(makeProgressPanel());
        setOptions(new Object[] {});
        addPropertyChangeListener(new PropertyChangeListener()
        {
            @Override
            public void propertyChange(PropertyChangeEvent evt)
            {
            	// DO NOTHING
            	/*
                if (evt.getSource() == LRFProgress.this && evt.getPropertyName()==VALUE_PROPERTY)
                {
                    requestClose("Are you sure you want to cancel Legacy Resource Fixer?");
                }
                */
            }
        });
		container = new JDialog(null, "Legacy Resource Fixer", ModalityType.MODELESS);
		container.setResizable(false);
		container.setLocationRelativeTo(null);
		container.add(this);
		this.updateUI();
		container.pack();
		container.setMinimumSize(container.getPreferredSize());
		container.setVisible(true);
		container.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		container.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				requestClose("Are you sure you want to cancel Legacy Resource Fixer?");
			}
		});
		return container;
	}

	protected void requestClose(String message)
	{
		int shouldClose = JOptionPane.showConfirmDialog(container, message, "Are you sure you want to cancel?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		if (shouldClose == JOptionPane.YES_OPTION)
		{
			container.dispose();
		}
		stopIt = true;
	}

	public void updateProgressString(String progressUpdate, Object... data)
	{
		if (currentActivity!=null)
		{
			currentActivity.setText(String.format(progressUpdate,data));
		}
	}

	public void resetProgress(int sizeGuess)
	{
		if (progress!=null)
		{
			progress.getModel().setRangeProperties(0, 0, 0, sizeGuess, false);
		}
	}

	public void updateProgress(int fullLength)
	{
		if (progress!=null)
		{
			progress.getModel().setValue(fullLength);
		}
	}

	public void makeHeadless()
	{
		container = null;
		progress = null;
		currentActivity = null;
	}

	@Override
	public void setPokeThread(Thread currentThread)
	{
		this.pokeThread = currentThread;
	}

	@Override
	public boolean shouldStopIt()
	{
		return stopIt;
	}
}
