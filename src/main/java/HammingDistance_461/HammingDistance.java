package HammingDistance_461;

public class HammingDistance {
    public static void main(String[] args){
        System.out.println(new Solution().hammingDistance(4,1));
    }
}

class Solution{
    public int hammingDistance(int x,int y){
        int[] binaryX = toBinary(x);
        int[] binaryY = toBinary(y);
        int sum = 0;
        for(int i=0;i<31;i++){
            System.out.println(binaryX[i]+"%"+binaryY[i]);
            if(binaryX[i] != binaryY[i])
                sum ++;
        }
        return sum;
    }

    private int[] toBinary(int x){
        int[] binaryArray = new int[31];
        int flag = 30;
        int sum = 0;
        while(flag >= 0){
            if(sum+getPower(flag) <= x){
                sum += getPower(flag);
                binaryArray[flag] = 1;
            }
            else{
                binaryArray[flag] = 0;
            }
            flag --;
        }
        return binaryArray;
    }

    private int getPower(int num){
        int sum = 1;
        while(num>0){
            sum *= 2;
            num --;
        }
        return sum;
    }
}
