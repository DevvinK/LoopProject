package loop.view;

import javax.swing.JFrame;

import loop.controller.LoopController;

/**
 * Main GUI framework for the Loop Praject.
 * @author Devvin Kraatz
 * 1.2 11/5/13 Added documentation and supporting methods.
 */
public class LoopFrame extends JFrame
{
	/**
	 * The referenced controller object.
	 */
	private LoopController baseController;
	/**
	 * The applications main panel for GUI.
	 */
	private LoopPanel loopPanel;
	
	/**
	 * Creates a LoopFrame object with a linked LoopController for the MVC paradigm.
	 * @param baseController The referring controller.
	 */
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		loopPanel = new LoopPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Sets the content, size and visibility of the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(loopPanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
