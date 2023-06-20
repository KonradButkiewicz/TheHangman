package Project;

public class Logic {
    private StringBuilder blurredWord;
    private int count = 1;
    private boolean wordGuessed = false;

    WordBase randomWord = new WordBase();

    String word = randomWord.getRandomWord();

    public Logic() {
        blurredWord = new StringBuilder(word.replaceAll(".", "_"));
    }

    public String getWord() {
        return word;
    }

    public String getBlurredWord() {
        return blurredWord.toString();
    }

    public String inputCheck(char letter) {
        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            if (blurredWord.charAt(i) == '_' && word.charAt(i) == letter) {
                blurredWord.setCharAt(i, letter);
                found = true;
            }
        }

        if (!found) {
            wrongAnswer();
        } else if (blurredWord.toString().equals(word)) {
            wordGuessed = true;
        }

        return blurredWord.toString();
    }

    public boolean isWordGuessed() {
        return wordGuessed;
    }

    public void checkWord(String guessedWord) {
        if (guessedWord.equalsIgnoreCase(word)) {
            wordGuessed = true;
        } else {
            wrongAnswer();
        }
    }

    public void wrongAnswer() {
        Drawing drawing = new Drawing();
        count++;
        drawing.gallows(count);

        if (count >= 7) {
            wordGuessed = true;
        }
    }
}
