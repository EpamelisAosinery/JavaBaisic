import java.util.Scanner;

public class SumBinary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        long[] binaryNums = binaryInput(scan);

        // Print Test Binary Input
        /*for (long num : binaryNums) {
            System.out.println("Binary: " + num);
        }*/

        calSumBinary(binaryNums);
    }

    public static long[] binaryInput(Scanner scan) {
        long[] binNum = new long[2];

        for (int i = 0; i < binNum.length; i++){
            System.out.printf("Enter your binary #%d: ", i+1);
            binNum[i] = scan.nextLong();
        }
        return binNum;
    }

    public static void calSumBinary(long[] binaryNums) {
        long bin1 = binaryNums[0], bin2 = binaryNums[1];
        int i = 0, remainder = 0;
        int[] sum = new int[20];

        while (bin1 != 0 || bin2 != 0){
            System.out.println("--------");
            sum[i++] = (int)((bin1 % 10 + bin2 % 10 + remainder) % 2);
            System.out.println("Index 0: " + sum[0]);
            System.out.println("Index 1: " + sum[1]);
            System.out.println("Index 2: " + sum[2]);
            System.out.println("Index 3: " + sum[3]);
            System.out.println("Index 4: " + sum[4]);
            remainder = (int)((bin1 % 10 + bin2 % 10 + remainder) / 2);
            System.out.println("Remainder: " + remainder);
            bin1 = bin1 / 10;
            System.out.println("Binary #1: " + bin1);
            bin2 = bin2 / 10;
            System.out.println("Binary #2: " + bin2);
        }

        System.out.println("\n~~~~~~~~~~~~~");
        if (remainder != 0) {
            System.out.println("!!!!!!!!!!!");
            System.out.println("index num for remainder: " + i);
            sum[i++] = remainder;
            System.out.println("Sum of remainder !=0 = " + sum[i]);
        }

        // Print Sum[] in reverse order
        // Add --i to remove 0 in the font of the binary
        --i;
        System.out.print("\nSum of 2 Binary: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

        System.out.println("\n\n*********");
        System.out.print("Original Output: ");
        for (int x=0; x<5; x++){
            System.out.print(sum[x]);
        }

        System.out.print("\n");
    }
}
