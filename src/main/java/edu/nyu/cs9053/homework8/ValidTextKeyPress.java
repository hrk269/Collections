package edu.nyu.cs9053.homework8;

public enum ValidTextKeyPress {
    Two("abc", 2),

    Three("def", 3),

    Four("ghi", 4),

    Five("jkl", 5),

    Six("mno", 6),

    Seven("pqrs", 7),

    Eight("tuv", 8),

    Nine("wxyz", 9);

    private final String letters;

    private final Integer textKey;

    ValidTextKeyPress(String letters, Integer textKey) {
        this.letters = letters;
        this.textKey = textKey;
    }

    public Integer getTextKey(){
        return this.textKey;
    }

    public static Integer getInteger(String letter) {
        for(ValidTextKeyPress v : ValidTextKeyPress.values()){
            if (v.letters.contains(letter)){
                return v.textKey;
            }
        }
        return null;
    }
}