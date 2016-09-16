package Monster.controller;

import Monster.model.Marshmellow;
import java.util.Scanner;

public class MonsterController 
{
	private Marshmellow firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster = new Marshmellow("Sir.Marslsh's Worth", 324.324, 2, 0, 2, false);
		keyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("Here is my butler! " + firstMonster);
		
		System.out.println("Do you want to change my name??");
		String answer = keyboardInput.nextLine();
		
		
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want the name to be????");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		else
		{
			System.out.println("I get to keep my name! I love my name! Go ahead say it in an amazing accent! ;-)");
		
		System.out.println(firstMonster);
		}
		
		System.out.println("Do you want to change how many eyes I have?");
		String answer1 = keyboardInput.nextLine();
		
		if (answer1.equalsIgnoreCase("yes"))
		{
			System.out.println("How many eyes should I have?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		else
		{
			System.out.println("Good because I only want 2 eyes!");
			
		System.out.println(firstMonster);
		}
	
			
	
	
	/*
	 * monster name is Sir.Maralsh's Worth
	 * has 324.324 antenna
	 * has 2 legs
	 * has 0 nose
	 * has 2 eyes
	 * does not have a belly button
	 */
		
	}
}


