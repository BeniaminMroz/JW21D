package DAY4;

public class Zadanie2 {
    public static void main(String[] arguments) {
        if (arguments.length > 0) {
            long num = 0;
            char firstChar = arguments[0].charAt(0);
            char secondChar = arguments[0].charAt(1);
            switch (firstChar) {
                case 'o':
                    num = 1L;
                    break;
                case 't':
                    if (secondChar == 'w')
                        num = 2L;
                    if (secondChar == 'h')
                        num = 3L;
                    if (secondChar == 'e')
                        num = 10L;
                    break;
                case 'f':
                    if (secondChar == 'o')
                        num = 4L;
                    if (secondChar == 'i')
                        num = 5L;
                    break;
                case 's':
                    if (secondChar == 'i')
                        num = 6L;
                    if (secondChar == 'e')
                        num = 7L;
                    break;
                case 'e':
                    if (secondChar == 'i')
                        num = 8L;
                    break;
                case 'n':
                    num = 9L;
            }
            System.out.println("The number is " + num);
        }
    }
}

//    public static String main(String[] arguments) {
//
////        String jeden = "Jeden";
////        String dwa = "Dwa";
////        String trzy = "Trzy";
////        String cztery = "Cztery";
////        String piec = "Piec";
////        String szesc = "Szesc";
////        String siedem = "Siedem";
////        String osiem = "Osiem";
////        String dziewiec = "Dziewiec";
////        String dziesiec = "Dziesiec";
//
//
//        for (int numbers = 1; numbers <= countDays(numbersCount); numbers++) {
//            System.out.println(+ numbers);
//        }
//
//
//        static int countDays ( int numbersCount) {
//            int count = -1;
//            switch (numbersCount) {
//                case 1:
//                    System.out.print("Jeden");
//                case 2:
//                    System.out.print("Dwa");
//                case 3:
//                    System.out.print("Trzy");
//                case 4:
//                    System.out.print("Cztery");
//                case 5:
//                    System.out.print("Piec");
//                case 6:
//                    System.out.print("Szesc");
//                case 7:
//                    System.out.print("Siedem");
//                case 8:
//                    System.out.print("Osiem");
//                case 9:
//                    System.out.print("Dziewiec");
//                case 10:
//                    System.out.print("Dziesiec");
//                    break;
//            }
//        }
//    }
//}

