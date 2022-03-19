package guntingBatuKertas;

public class Start {
	protected int playerOption;
	protected int botOption;
	protected String playerName;
	protected String botName;
	protected String botWin;
	protected String playerWin;
	protected int randomOption;
	protected int[] pilih = {1,2,3};
	
	Start(){
		playerOption = 0;
		botOption = 0;
		playerName = "PLAYER";
		botName = "NBL_BOT";
		botWin = botName+" WIN";
		playerWin = playerName+" WIN";
	}
	
	void setPlayerOption(int playerOption) {
		this.playerOption = playerOption;
	}
	
	int getPlayerOption() {
		return playerOption;
	} 
	
	int getBotOption() {
		randomOption = (int)(Math.random()*pilih.length);
		botOption = pilih[randomOption];
		return botOption;
	}
	
	String winner() {
		if(playerOption == 1 && botOption == 2) 
		{
			return botWin;
		}
		else if(playerOption == 1 && botOption == 3) 
		{
			return playerWin;
		}
		else if(playerOption == 2 && botOption == 3) {
			return botWin;
		}
		else if(playerOption == 2 && botOption == 1) 
		{
			return playerWin;
		}
		else if(playerOption == 3 && botOption == 1) 
		{
			return botWin;
		}
		else if(playerOption == 3 && botOption == 2) 
		{
			return playerWin;
		}else {
			return ("SERI");
		}
		
	}
}
