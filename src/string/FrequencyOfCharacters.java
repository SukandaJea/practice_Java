package string;

public class FrequencyOfCharacters {

    public static String frequencyOfChars(String str) {

        String expectedResult = "";
        int j = 0;

        while (j < str.length()) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == str.charAt(j)) {

                    count++;

                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }

    public static void main(String[] args) {
        String FrequencyOfChars = "AAABBCDD";
        System.out.println("frequencyOfChars" +frequencyOfChars("AAABBCDD"));
    }
}

/*
 write a return method that can find the frequency of  characters

 Ex: FrequencyOfChars("AAABBCDD") =>A3B2C1D2

 */