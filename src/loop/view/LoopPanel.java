package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import loop.controller.LoopController;
import loop.model.Looper;

/**
 * Panel for the Loop Project.
 * @author Devvin Kraatz
 * @version 1.3 11/5/13 Basic framework, setupPanel, setupListeners, setupLayout methods.
 */
public class LoopPanel extends JPanel
{
	private LoopController baseController;
	
	private SpringLayout loopLayout;
	private JTextArea loopTextArea;
	private JButton submitLoopButton;
	private JScrollPane loopPane;

	/**
	 * Creates a LoopPanel object linked via the controller for MVC paradigm.
	 * @param baseController The linked controller object.
	 */
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		
		loopLayout = new SpringLayout();
		loopTextArea = new JTextArea(10, 30);
		loopPane = new JScrollPane(loopTextArea);
		submitLoopButton = new JButton("Click here");
		
		setupPanel();
		setupLayout();
		setupListeners();

	}
	
	/**
	 * Adds all components to the panel, sets color and component settings.
	 */
	private void setupPanel()
	{
		this.setLayout(loopLayout);
		this.setBackground(new Color( 0, 180, 152));
		this.add(submitLoopButton);
		this.add(loopPane);
		
		loopTextArea.setWrapStyleWord(true);
		loopTextArea.setLineWrap(true);
		loopTextArea.setEditable(false);
		
	}
	
	/**
	 * 
	 */
	private void setupLayout()
	{
		loopLayout.putConstraint(SpringLayout.NORTH, loopPane, 10, SpringLayout.NORTH, this);
		loopLayout.putConstraint(SpringLayout.WEST, loopPane, 10, SpringLayout.WEST, this);
		loopLayout.putConstraint(SpringLayout.SOUTH, loopPane, -104, SpringLayout.SOUTH, this);
		loopLayout.putConstraint(SpringLayout.EAST, loopPane, 256, SpringLayout.WEST, this);
		loopLayout.putConstraint(SpringLayout.NORTH, submitLoopButton, 74, SpringLayout.NORTH, this);
		loopLayout.putConstraint(SpringLayout.EAST, submitLoopButton, -53, SpringLayout.EAST, this);
		
	}
	
	/**
	 * 
	 */
	private void setupListeners()
	{
		submitLoopButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						loopTextArea.append(baseController.getLoopResults());
					}
				});
		
	}
	
	
}
