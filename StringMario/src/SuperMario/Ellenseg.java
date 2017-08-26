package SuperMario;

public class Ellenseg {
	
	private String nev; //coopa, piranja, goomba
	private static int live=3;
	private boolean dead;
	
	public String getNev()
	{
		return nev;
	}
	
	public static int getLive()
	{
		return live;
	}
	public boolean isDead()
	{
		return dead;
	}
	
	public Ellenseg(String nev, int live, int dead)
	{
		this.nev = nev;
		Ellenseg.live += live;
		if(Ellenseg.live == 0)
		{
			dead = 1;
		}
		
		if( dead == 1 )
		{
			this.dead = true;
		}
		else
		{
			this.dead = false;
		}
	}

}
