package com.daily.Oct10;

public class RemoveLeadingAndTrailingSpaces {
    public static void main(String[] args) {
        String str = "  abc  def\t";

        /*
        Java String class contains two methods to remove leading and trailing whitespaces - trim(), and strip().
        The strip() method was added to the String class in Java 11. However, the strip() method uses Character.isWhitespace() method to
        check if the character is a whitespace. This method uses Unicode code points whereas the trim() method identifies any character
         having codepoint value less than or equal to ‘U+0020’ as a whitespace character.
         The strip() method is the recommended way to remove whitespaces because it uses the Unicode standard.
         */
        String str2 = str.trim();
        String str3=str.strip();
        System.out.println(str2);
        System.out.println(str3);

    }

}
