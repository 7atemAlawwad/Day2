import java.util.Scanner;

public class ExDay2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


//    1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.

//    Input: Weight (kg) = 70, Height (m) = 1.75 Expected Output: BMI = 22.86

        System.out.println("Enter Your weight (kg): ");
        int Weight =  s.nextInt();
        System.out.println("Enter Your height (m): ");
        double Height =  s.nextDouble();

        System.out.println("Your BMI is : " + Weight / (Height * Height));


//      2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.

//        Input: Obtained Marks = 85, Total Marks = 100 Expected Output: Percentage = 85.0%

        System.out.print("Enter your mark: ");
        int mark = s.nextInt();
        double totalMark = 100;

        System.out.println("Your percentage is : " + ((mark * 100)/ totalMark)+"%");


//         3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.

//        Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85 Expected Output: Amount in EUR = 85.0

        System.out.print("Amount to convert : ");
        double amount = s.nextDouble();
        System.out.print("Exchange rate     : ");
        double rate = s.nextDouble();
        double converted = amount * rate;
        System.out.printf("Converted amount = %.2f%n", converted);



//       4. Create a program that takes a string as input, calculates its length, and then reverses the string using the StringBuilder class, finally printing both the length and reversed string.

//        Input: "Hello, World!"
//        Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"

        System.out.print("Enter a string: ");
        String text = s.nextLine();
        System.out.println("Length  : " + text.length());
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed: " + reversed + "\n");


//        5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
//
//          • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
//          • Expected Output: "brown fox"

        System.out.print("Enter a string: ");
        String text2 = s.nextLine();
        System.out.print("Start index: ");
        int start = s.nextInt();
        System.out.print("End index  : ");
        int end = s.nextInt();
        s.nextLine();
        System.out.println("Substring: " + text2.substring(start, end) + "\n");


//        6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.

//        Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
//        Expected Output: Keyword "jumps" is present in the sentence.

        System.out.print("Enter a string: ");
        String text3 = s.nextLine();
        System.out.print("Keyword to search: ");
        String keyword = s.nextLine();
        System.out.println(text3.contains(keyword) ? "Keyword "+keyword+" is present in the sentence.\n"
                : "Keyword NOT found.\n");


//       7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.

//        Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
//        Expected Output: "The quick brown cat jumps over the lazy dog"

        System.out.print("Enter a string: ");
        String text4 = s.nextLine();
        System.out.print("Word to replace : ");
        String target = s.nextLine();
        System.out.print("Replacement word: ");
        String replacement = s.nextLine();
        System.out.println("After replace: " + text4.replace(target, replacement) + "\n");

//       8. Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.

//      • Input: String 1 = "Hello", String 2 = "hello"
//      • Expected Output: Strings are equal (ignoring case).


        System.out.print("First string : ");
        String a = s.nextLine();
        System.out.print("Second string: ");
        String b = s.nextLine();
        System.out.println(a.equalsIgnoreCase(b) ? "Strings are equal (ignore case)."
                : "Strings are NOT equal.");


    }
}