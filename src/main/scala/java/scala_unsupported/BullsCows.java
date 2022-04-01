package leet.java.scala_unsupported;

public class BullsCows {
    private int asDigit(char c) {
        return ((int) c) - '0';
    }

    public String getHint(String secret, String guess) {
        int[] digitMap = new int[] {0,0,0,0,0,0,0,0,0,0};

        for (int i = 0; i < secret.length(); i++) {
            digitMap[asDigit(secret.charAt(i))] += 1;
        }

        int bull = 0;
        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);

            if(c == secret.charAt(i)) {
                bull += 1;
                digitMap[asDigit(c)] -= 1;
            }
        }

        int cow = 0;
        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);

            if (c != secret.charAt(i) && digitMap[asDigit(c)] != 0) {
                cow += 1;
                digitMap[asDigit(c)] -= 1;
            }
        }


        return String.format("%dA%dB", bull, cow);
    }
}
