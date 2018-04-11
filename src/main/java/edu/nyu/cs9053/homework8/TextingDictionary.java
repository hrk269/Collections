package edu.nyu.cs9053.homework8;
import java.util.ArrayList;
import java.util.HashMap;

public class TextingDictionary{

    private final HashMap<Integer, ArrayList<String>> knownWords = new HashMap<>();

    public void insert(String word){
        if (word.equals(null)){
            System.out.println("Cannot insert null");
        }
        String lowerCaseWord = word.toLowerCase();
        StringBuilder hashKey = new StringBuilder();
        for (int i = 0; i < lowerCaseWord.length(); i++) {
            char c = lowerCaseWord.charAt(i);
            hashKey.append(ValidTextKeyPress.getInteger(String.valueOf(c)));
            knownWords.putIfAbsent(Integer.parseInt(hashKey.toString()), new ArrayList<String>());
            knownWords.get(Integer.parseInt(hashKey.toString())).add(word);
        }
    }

    public ArrayList<String> search(ArrayList<ValidTextKeyPress> prefixes){
        StringBuilder hashKey = new StringBuilder();
        for(ValidTextKeyPress v: prefixes){
            hashKey.append(v.getTextKey());
        }
        knownWords.putIfAbsent(Integer.parseInt(hashKey.toString()), new ArrayList<String>());
        return knownWords.get(Integer.parseInt(hashKey.toString()));
    }
}