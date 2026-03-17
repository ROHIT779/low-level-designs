import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {

    private final long[] numbers;

    private final int start;

    private final int end;

    private static final int THRESHOLD = 1_000;

    public SumTask(long[] numbers, int start, int end){
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute(){
        int length = end - start;
        System.out.println("Thread name: "+Thread.currentThread().getName());
        System.out.println("start and end: "+start+", "+end);
        if(length < THRESHOLD){
            long sum = 0;
            for(int i=start; i<=end; i++){
                sum += numbers[i];
            }
            return sum;
        }

        int mid = (start + end) / 2;
        SumTask leftTask = new SumTask(numbers, start, mid);
        SumTask rightTask = new SumTask(numbers, mid+1, end);
        leftTask.fork();
        Long rightResult = rightTask.compute();
        Long leftResult = leftTask.join();

        return leftResult + rightResult;
    }

}