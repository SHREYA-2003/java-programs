/*solution of the watterbottle problem of leetcode in java */
import java.util.*;
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    int totalBottle = 0;
    totalBottle = totalBottle + numBottles;
    while(numBottles >= numExchange){
        int div = numBottles /numExchange;
        int rem = numBottles % numExchange;
        numBottles = div + rem ;
       totalBottle = totalBottle + div;
    }  
    return totalBottle; 
    }
}
