import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom () {
        Random rd = new Random();
        Integer [] arr = new Integer[100];
        System.out.println("All element: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample newArray = new ArrayExample();
        Integer [] arr = newArray.createRandom();
        System.out.println(" ");
        Scanner inputRandomIndex = new Scanner(System.in);
        System.out.println("Nhập một chỉ số của phần tử bất kỳ: ");
        int inputRandom = inputRandomIndex.nextInt();

        try {
            System.out.println("Giá trị của phần tử có chỉ số thứ 5: " + inputRandom + " là " + arr[inputRandom]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng!");
        }
    }
}

