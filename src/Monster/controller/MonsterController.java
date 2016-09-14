package Monster.controller;

import Monster.model.Marshmellow;

public class MonsterController 
{
	private Marshmellow firstMonster;
	
	public MonsterController()
	{
		firstMonster = new Marshmellow("Sir.Marslsh's Worth", 324.324, 2, 0, 2, false);
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("Here is mine " + firstMonster);
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
