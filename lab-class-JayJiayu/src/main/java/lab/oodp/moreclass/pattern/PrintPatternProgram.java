package lab.oodp.moreclass.pattern;

public class PrintPatternProgram {

    public void start() {
        
        printPatternOne();
        printPatternTwo();
        
    }
    public void printPatternOne() {
        System.out.println("First Pattern");
        //TODO uncomment the lines below
        Pattern top = new Pattern(15, '*');
        
        Pattern sideOfFirstLine = new Pattern(7, '#');
        Pattern sideOfLine = new Pattern(7, '~');
        Pattern middle = new Pattern(1, '.');
        
        System.out.println(top);
        System.out.println(sideOfFirstLine.toString() + middle.toString() + sideOfFirstLine.toString());
        
        for (int i = 0; i < 6; i++) {
            middle.setNumberOfCharacters(middle.getNumberOfCharacters() + 1);
            System.out.println(sideOfLine.toString() + middle.toString() + sideOfLine.toString());
        }
    }
    
    public void printPatternTwo() {
        System.out.println("Second Pattern");
        
        Pattern top = new Pattern(35,'@');
        Pattern sideOfFirstLine = new Pattern(11,'=');
        Pattern middle = new Pattern(6, '.');
        Pattern some = new Pattern(8,'&');
        
        System.out.println(top);       
        System.out.println(sideOfFirstLine.toString()+middle.toString()+sideOfFirstLine.toString());
        
        for (int i = 0; i < 6; i++) {
        	//TODO: print out the lines with & and .
        	 middle.setNumberOfCharacters(middle.getNumberOfCharacters() -1);
        	 some.setNumberOfCharacters(some.getNumberOfCharacters() +1);
        	 System.out.println(some.toString() + middle.toString()+middle.toString()+ some.toString());
        }
    }

    public static void main(String[] args) {
        PrintPatternProgram ppp = new PrintPatternProgram();
        ppp.start();
    }
}