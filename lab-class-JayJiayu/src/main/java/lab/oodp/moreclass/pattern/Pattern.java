package lab.oodp.moreclass.pattern;

public class Pattern {
	private int numberOfCharacter;
	private char chartacter;
		
	public String toString() {
		String Num = "";
		for(int i =0;i<numberOfCharacter;i++) {
			Num += chartacter;
		}
		return Num;
	}
	public Pattern(int numberOfCharacter,char chatacter) {
		this.numberOfCharacter = numberOfCharacter;
		this.chartacter = chatacter;
	}
	public int getNumberOfCharacters() {
		return numberOfCharacter;
	}
	public void setNumberOfCharacters(int numberOfCharacter){
		this.numberOfCharacter = numberOfCharacter;
	}
	public char getchatacter() {
		return chartacter;
	}
	public void setchatacter(char chatacter) {
		this.chartacter = chatacter;
	}
}