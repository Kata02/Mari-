package SuperMario;

public class Win {
	private String nev; //Browser, Princess
	private boolean cel;
	
	public String getNev()
	{
		return nev;
	}

	public boolean isCel() {
		return cel;
	}

	public Win(String nev, int cel) {
		this.nev = nev;
		if( cel == 1 )
		{
			this.cel = true;
		}
		else
		{
			this.cel = false;
		}
	}

	

}
