public class stringMethods {
    public static void main(String[] args){

        String name = " pragun gupta";
        int length =  name.length();
        char letter = name.charAt(0);  // the letter at the place of index 0 with is p here
        int index = name.indexOf("g");  // to find the first occurence of a letter in string
        int lastIndex = name.lastIndexOf("g"); // to fing the last index of the letter

        //name = name.toUpperCase();  in CAPITAL
        //name = name.toLowerCase();  in small
        //name = name.trim();       removes the spaces in the string
        name = name.replace("p", "P");

        // name.isEmpty();      This will show when the string is empty so right now it wont work

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);

    }
}
