package DAY3;

public class EqualsTester {
    public static void main(String[] args) {

        String str1, str2;
        str1 = "Chłopie, ale to się rozrasta.";
        str2 = str1;

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));

        str2 = str1;

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));
        System.out.println("Ta sama wartość? " + str1.equals(str2));

    }
}
