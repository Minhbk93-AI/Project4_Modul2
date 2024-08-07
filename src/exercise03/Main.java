package exercise03;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = new int[10000000];
        for (int i = 0; i < 10000000; i++)
        {
            arr[i] = (int) Math.floor(Math.random() * 100);
        }
        // 1. khởi tạo đối tuượng StopWatch -> set startTime        20000
        StopWatch stopWatch = new StopWatch();


        // 2. thực thi chương trình đảo ngược mảng số 100.000 số    20
        // thực thi đảo số trong mảng
        for (int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        // 3. kết thức thì set endTime bằng thời gian hệ thống      20020
        stopWatch.stop();
        // -> endTime - startTime => 20
        System.out.println(stopWatch.getElapsedTime());

    }
}