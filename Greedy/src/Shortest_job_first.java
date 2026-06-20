import java.util.*;
public class Shortest_job_first {
    public static void main(String[]args){
        int job[]={4,3,7,1,2};
        int n = job.length;

        Arrays.sort(job);
        int  t = 0;
        int wt=0; //wt--> Waiting Time
        for(int i = 0 ; i<job.length ; i++){
            wt+=t;
            t+=job[i];
        }

        int avg_wt = wt/n;
        System.out.println(avg_wt);
    }
}
