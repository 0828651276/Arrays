import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Changes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen can doc: ");
        String input = scanner.nextLine();

        System.out.println(input);
        String output = "";

        int lengthInput = input.length();
        if (lengthInput == 1) {
            output = readOneNumber(input);
        } else {
            if (Integer.parseInt(input) % 10 == 0) {
                output = readTwoNumberDB(input);
            } else {
                // nhung so dac biet < 20
                if (Integer.parseInt(input) < 20) {
                    output = readNumberLessthan20(input, output);
                } else {

                    int numUnitNumber = Integer.parseInt(input) % 10;
                    // so hang chuc
                    int numberTens = Integer.parseInt(input) - numUnitNumber;
                    // doc so hang don vi
                    String readUnitNumber = readOneNumber(String.valueOf(numUnitNumber));
                    // doc so hang chuc
                    String readNumberTens = readTwoNumberDB(String.valueOf(numberTens));
                    // doc ca so = doc so hang chuc + doc so hang don vi
                    output = readNumberTens + " " + readUnitNumber;
                }
            }
        }
        System.out.println(output);
    }

    private static String readNumberLessthan20(String input, String output) {
        switch (input) {
            case "11":
                output = "eleven";
                break;
            case "12":
                output = "twelve";
                break;
            case "13":
                output = "thirteen";
                break;
            case "14":
                output = "fourteen";
                break;
            case "15":
                output = "fifteen";
                break;
            case "16":
                output = "sixteen";
                break;
            case "17":
                output = "seventeen";
                break;
            case "18":
                output = "eighteen";
                break;
            case "19":
                output = "nineteen";
                break;
        }
        return output;
    }

    private static String readTwoNumberDB(String input) {
        String output = "";
        switch (input) {
            case "10":
                output = "ten";
                break;
            case "20":
                output = "twenty";
                break;
            case "30":
                output = "thirty";
                break;
            case "40":
                output = "forty";
                break;
            case "50":
                output = "fifty";
                break;
            case "60":
                output = "sixty";
                break;
            case "70":
                output = "seventy";
                break;
            case "80":
                output = "eighty";
                break;
            case "90":
                output = "ninety";
                break;
        }
        return output;
    }

    private static String readOneNumber(String input) {
        String output = "";
        switch (input) {
            case "1":
                output = "one";
                break;
            case "2":
                output = "two";
                break;
            case "3":
                output = "three";
                break;
            case "4":
                output = "four";
                break;
            case "5":
                output = "five";
                break;
            case "6":
                output = "six";
                break;
            case "7":
                output = "seven";
                break;
            case "8":
                output = "eight";
                break;
            case "9":
                output = "nine";
                break;
        }
        return output;
    }

}