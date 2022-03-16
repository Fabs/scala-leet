package leet.java.conversions;

public class BackspaceStringCompare {
    public String process(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '#') {
                if(sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        sb.trimToSize();
        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        String sProcessed = process(s);
        String tProcessed = process(t);

        return sProcessed.equals(tProcessed);
    }
}
