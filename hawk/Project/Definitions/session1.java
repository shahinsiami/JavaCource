// package hawk.course;

// import java.util.Arrays;
// import java.util.Date; //add for explain refrence type
// import java.util.Scanner;
// import java.awt.*;

// public final class App {
//     private App() {
//     }

//     public static void main(String[] args) {
//         byte age = 40; // 1byte
//         long viewsCount = 3_123_456_789L; // 8byte you can use _ instead ,
//         float price = 10.99F;
//         char letter = 'a';
//         boolean isEligible = false;
//         // all of these is primitive
//         // now declear refrence type
//         Date now = new Date();// alocate a memory agains primitive type
//         now.getTime();
//         System.out.println(now);
//         System.out.println(price);
//         // deference between refrence an primitive
//         int x = 1;
//         int y = x;
//         x = 2;
//         System.out.println(y);
//         // refrence
//         Point point1 = new Point(1, 1);
//         Point point2 = point1;
//         point1.x = 2;
//         System.out.println(point2);
//         // string
//         String message = "hello word" + "hi";
//         message.endsWith("a"); // return boolean value
//         message.startsWith("s"); // return boolean value
//         message.length();
//         message.indexOf("s");
//         message.replace("s", "a");
//         //
//         int[] numbers = new int[5];
//         numbers[0] = 1;
//         numbers[1] = 2;
//         numbers[2] = 3;
//         numbers[3] = 4;
//         //not inisial array return 0
//         System.out.println(Arrays.toString(numbers));//without this return address in memory
//         int[] array = {1,2,3,4,5};
//         System.out.println(Arrays.toString(array));
//         //matrix
//         int [][] matrix = new int [5][5];
//         matrix [0][0] = 0;
//         System.out.println(Arrays.deepToString(matrix));
//         //another define matrix
//         int [][] matrixx = {{1,2,3},{1,2,3}};
//         System.out.println(Arrays.deepToString(matrixx));
//         //constant
//         final float PI = 3.14F;
//         //casting 
//         double result = (double) 4 / (double) 5;
//         //math
//         double round = Math.round(1.1F);
//         double ceil = Math.ceil(1.1F);
//         double max = Math.max(1,1);
//         double random = Math.random();
//         //scanner
//         Scanner scanner = new Scanner(System.in);
//         byte ageold = scanner.nextByte();
//         System.out.println("you are" + ageold);
//     }
// }
