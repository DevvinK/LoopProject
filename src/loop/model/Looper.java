package loop.model;

import java.util.ArrayList;

public class Looper
{
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheNameList();
	}
	
	private void fillTheNameList()
	{
		graveNameList.add("Harry P. Miller");
		graveNameList.add("Arthur G. Cushing");
		graveNameList.add("Mary A. Cushing");
		graveNameList.add("Stig Mikael Stenfors");
		graveNameList.add("Reinhold G. Erikson");
		graveNameList.add("Olga Ohman Erikson");
		graveNameList.add("Harold S. Wennerstrom");
		graveNameList.add("Sam K. Robinson");
		graveNameList.add("Berry Echols ");
		graveNameList.add("Marry Etta Blair Cushing");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
//		graveNameList.add("");
	}

	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	
	public String LoopTestOne()
	{
		String loopResult = "";
		int timesLooped = 0;

		for (int loopCounter = 0; loopCounter < 10; loopCounter += 2)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;

		}

		loopResult += "\nThe loop executed " + timesLooped + " times \n";

		return loopResult;
	}

	public String LoopTestTwo()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;

		for (int weeks = 0; weeks < 52; weeks++)
		{
			for (int hours = 0; hours < 24; hours++)
			{
				for (int outerLoop = 0; outerLoop < 60; outerLoop++)
				{
					for (int loopCounter = 0; loopCounter < 60; loopCounter++)
					{
						// loopResult += loopCounter + ", ";
						timesLooped++;

					}
					outerLoopTimes++;
				}
			}
		}
		loopResult += "\nThe loop executed " + timesLooped + " times \n";

		return loopResult;

	}
	
	public String LoopTestThree()
	{
		String loopResult = "";
		int timesLooped = 0;
		
		for(int kg = 0; kg < 10; kg ++)
		{
			for(int hg = 0; hg < 10; hg ++)
			{
				for(int dag = 0; dag < 10; dag ++)
				{
					for(int g = 0; g < 10; g ++)
					{
						timesLooped++;
					}
				}
			}
		}
		loopResult += "\nThe loop executed " + timesLooped + " times \n";
		
		return loopResult;
	}
}
