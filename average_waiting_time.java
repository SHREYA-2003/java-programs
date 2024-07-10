class Solution {
    public double averageWaitingTime(int[][] customers) {
    int n = customers.length;
    double servicetime = customers[0][0]+ customers[0][1];
    double totalwait = servicetime - customers[0][0];
    for(int i = 1 ; i<n; i++){
        if(servicetime < customers[i][0]){
            servicetime = customers[i][0];
        }
           servicetime += customers[i][1];
           totalwait += servicetime - customers[i][0];
    }
      return totalwait/n;
    }
}
