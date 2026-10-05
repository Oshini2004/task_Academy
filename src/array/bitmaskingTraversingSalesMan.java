package array;

public class bitmaskingTraversingSalesMan {
    static int minCost(int dist[][],int n,int currentCity,int visited){
        //base case
        if(visited==(1<<n)-1){
            return dist[currentCity][0];
        }
        //rec case
        int cost=Integer.MAX_VALUE;
        for(int city=0;city<n;city++){
            //means the city is not yet visited
            if((visited &(1<<city))==0){
                int currentPathCost=dist[currentCity][city]+minCost(dist,n,city,visited|(1<<city));
                cost=Math.min(cost,currentPathCost);
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        //2Darray
        int dist[][]={
                {0,20,42,25},
                {20,0,30,34},
                {42,30,0,10},
                {25,34,10,0}
        };
        System.out.println(minCost(dist,4,0,0001));
    }
}
///samjh me hi nhi aaaya