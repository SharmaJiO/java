import java.util.*;
public class choco {
    public static void main(String[] args) {
        int n = 4 , m = 6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costVer,Collections.reverseOrder());//descending order
        Arrays.sort(costHor,Collections.reverseOrder());//descending order
        int cost = 0;
        int h =0,v=0; //  horizontal/vertical cut index
        int hp=1 , vp=1; //   horizontal/vertical pieces
        while(h<costHor.length  && v<costVer.length) {
            if (costVer[v] >= costHor[h]) {
                cost = cost + (costVer[v] * hp);
                vp++;
                v++;

            } else {
                cost = cost + (costHor[h] * vp);
                hp++;
                h++;

            }
        }

        while(h<costHor.length){
            cost = cost+(costHor[h]*vp);
            hp++;
            h++;

        }
        while(v<costVer.length){
            cost = cost+(costVer[v]*hp);
            vp++;
            v++;

        }

        System.out.println("Minimum cost for cutting pieces = "+cost);
    }
}
