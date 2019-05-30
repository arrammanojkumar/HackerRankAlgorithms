package algorithms.implementation;

/**
 * Created by marram on 8/28/18.
 */
public class NumberToString {
    static String ONE = "one";
    static String TWO = "two";
    static String THREE = "three";
    static String FOUR = "four";
    static String FIVE = "five";
    static String SIX = "six";
    static String SEVEN = "seven";
    static String EIGHT = "eight";
    static String NINE = "nine";
    static String TEN = "ten";

    static String TWENTY = "twenty";
    static String THIRTY = "thirty";
    static String FOURTY = "forty";
    static String FIFTY = "fifty";
    static String SIXTY = "sixty";
    static String SEVENTY = "seventy";
    static String EIGHTY = "eighty";
    static String NINETY = "ninety";

    static String HUNDRED = "hundred";
    static String THOUSAND = "thousand";
    static String LAKH = "lakh";
    static String CRORE = "crore";

    static int crore = 10000000;
    static int lakh = 10000000;
    static int thousand = 10000000;
    static int hundred = 100;
    static int ten = 10;

    public static void main(String[] args) {
        int sal = 20000;
        String sal_ = getString(sal, "");
        System.out.println(sal+ " --> " + sal_ );
    }

    public static String getString(int sal, String sal_){

        if(sal == 0){
            return sal_;
        }

        // In crores
        if(sal % crore == 0){
            int no = sal / crore;
        }
        // In Lakhs
        else if(sal % lakh == 0){

        }
        // In Thousands
        else if(sal % thousand == 0){

        }
        // In Hundred
        else if(sal % hundred == 0){

        }

        // In Tens
        else if(sal % ten == 0){

        }

        return sal_;
    }

    public static String getTensString(int no){
        String s = "";

        if(no % 10 == 0){

        }
        return s;
    }
}
