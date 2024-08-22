import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }
    public String getOpenDel() {
        return openDel;
    }
    public String getCloseDel() {
        return closeDel;
    }
    public ArrayList<String> getDelimitersList(String[] token)
    {
        ArrayList<String> delimiters = new ArrayList<String>();
        for (String s : token) {
            if (s.equals(openDel) || s.equals(closeDel)) {
                delimiters.add(s);
            }
        }
        return delimiters;
    }
    public boolean isBalanced(ArrayList delimiters) {
        int balance = 0;
        for (Object delimiter : delimiters) {
            System.out.println(delimiter);
            if (delimiter.equals(openDel)) {
                //System.out.println("Open");
                balance++;
            }
            else if (delimiter.equals(closeDel)) {
                //System.out.println("Close");
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        if (balance != 0) {
            return false;
        }
        return true;
    }
}