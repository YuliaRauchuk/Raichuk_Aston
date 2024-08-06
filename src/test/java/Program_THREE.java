//3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]
// необходимо написать программу, которая выведет в консоль все чётные числа.
public class Program_THREE {

    public static void main(String[] args) {
        int[] strArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        printOddNumbers(strArray);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0)
                if ((i == arr.length - 1)) {
                    stringBuilder.append(arr[i]);
                } else {
                    stringBuilder.append(arr[i]).append(",");
                }
        }
        System.out.println(stringBuilder);
    }
}