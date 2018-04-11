package edu.nyu.cs9053.homework8;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        TextingDictionary dictionary = new TextingDictionary();
        dictionary.insert("Brian");
        dictionary.insert("brain");
        dictionary.insert("braid");
        ArrayList<ValidTextKeyPress> case1 = new ArrayList<>();
        ValidTextKeyPress two = ValidTextKeyPress.Two;
        case1.add(two);
        ValidTextKeyPress seven = ValidTextKeyPress.Seven;
        case1.add(seven);
        System.out.println(case1);
        dictionary.search(case1);
        System.out.println(dictionary.search(case1)); //-> {"Brian","brain","braid"}
        ArrayList<ValidTextKeyPress> case2 = case1;
        case2.add(two);
        System.out.println(case2);
        dictionary.search(case2); //-> {"brain", "braid"}
        System.out.println(dictionary.search(case2));
        ValidTextKeyPress four = ValidTextKeyPress.Four;
        ArrayList<ValidTextKeyPress> case3 = new ArrayList<>();
        case3.add(two);
        case3.add(seven);
        case3.add(four);
        System.out.println(case3);
        dictionary.search(case3); //-> {"Brian"}
        System.out.println(dictionary.search(case3));
        ArrayList<ValidTextKeyPress> case4 = new ArrayList<>();
        case4.add(two);
        ValidTextKeyPress eight = ValidTextKeyPress.Eight;
        case4.add(eight);
        System.out.println(case4);
        dictionary.search(case4); //-> {}
        System.out.println(dictionary.search(case4));
        dictionary.insert("butte");
        System.out.println(case4);
        dictionary.search(case4); //-> {"butte"}
        System.out.println(dictionary.search(case4));
    }
}