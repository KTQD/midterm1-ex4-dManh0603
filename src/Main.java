public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 2, 7, 8, 0, 4, 3, 9, 2, 8, 1, 0, 5, 7, 4, 6, 9, 3, 2, 1, 8, 4, 0, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0};
        Thread thread1 = new Thread(new FindMax(numbers));
        Thread thread2 = new Thread(new CalculateSum(numbers));

        thread1.start();
        thread2.start();
    }


}

class CalculateSum implements Runnable {
    private final int[] numbers;

    public CalculateSum(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Tổng của các phần tử trong mảng là: " + sum);
    }

}

class FindMax implements Runnable {
    private final int[] numbers;

    FindMax(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
