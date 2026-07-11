import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SearchTask extends RecursiveTask<List<Integer>> {

    private int stringIndex;
    private int startIndex;
    private int endIndex;
    private String needle;
    private String haystack;
    private List<Integer> indicesFound;
    private final int defaultLength = 50;
    public SearchTask(int stringIndex, String haystack, String needle, int startIndex, int endIndex){
        this.stringIndex = stringIndex;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.needle = needle;
        this.haystack = haystack;
        this.indicesFound = new ArrayList<>();
    }
    @Override
    protected List<Integer> compute() {
        if((endIndex-startIndex)<=defaultLength){
            for(int i=startIndex;i<endIndex;i++){
                int numberOfMatches=0;
                int i1=i;
                for(int j=0;j<needle.length();j++){
                    if(haystack.charAt(i1)!=needle.charAt(j)){
                        break;
                    }else{
                        numberOfMatches++;
                        System.out.println("Document index: "+stringIndex+" character matched: "+needle.charAt(j)+" at index: "+i1);
                    }
                    i1++;
                }
                if(numberOfMatches==needle.length()){
                    indicesFound.add(i);
                }
            }
            return indicesFound;
        }

        int midIndex = startIndex + (endIndex-startIndex)/2;
        SearchTask leftTask = new SearchTask(stringIndex, haystack, needle, startIndex, midIndex);
        SearchTask rightTask = new SearchTask(stringIndex, haystack, needle, midIndex+1, endIndex);
        leftTask.fork();
        List<Integer> rightResult = rightTask.compute();
        List<Integer> leftResult = leftTask.join();
        leftResult.addAll(rightResult);
        return leftResult;
    }
}
