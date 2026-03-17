import java.time.Duration;
import java.time.Instant;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args){
        System.out.print("Enter a number x to sum from 1 to x: ");
        Scanner scanner = new Scanner(System.in);
        long size = 0L;
        try{
            size = scanner.nextLong();
        }catch (InputMismatchException e){
            System.out.println("Invalid input given");
            return;
        }
        System.out.println("Input size: "+size);
        if(size <= 0){
            size = 10_00_000L;
            System.out.println("Invalid input size, defaulting to: "+size);
        }
        long[] numbers = LongStream.rangeClosed(1, size).toArray();

        // Parallel Sum using ForkJoinPool
        SumTask mainTask = new SumTask(numbers, 0, numbers.length-1);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Instant startTime = Instant.now();
        long result = pool.invoke(mainTask);
        Instant endTime = Instant.now();
        System.out.printf("Sum of numbers for parallel computation: %d computed in %d milliseconds: \n", result, Duration.between(startTime, endTime).toMillis());

        // Serial Sum using for loop
        long serialSum = 0;
        startTime = Instant.now();
        for(long number : numbers){
            serialSum += number;
        }
        endTime = Instant.now();
        System.out.printf("Sum of numbers for serial computation: %d computed in %d milliseconds: \n", serialSum, Duration.between(startTime, endTime).toMillis());
    }
}
