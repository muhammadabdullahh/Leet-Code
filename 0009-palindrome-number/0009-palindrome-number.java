class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int tempTwo = x;
        boolean ans = true;
        int count = 1;
        
        if(x < 0)
            return false;
        if (x/10 == 0)
            return true;
        
        for (int i = x; i > 9; i = i/10)
            count = count * 10;
        
        for (int i = count; i > 1; i = i/10){
            int lastDig = temp%10; 
            int firstDig = tempTwo/count;
            temp = temp/10;
            tempTwo = tempTwo%count;
            count = count/10;
            
            if(lastDig != firstDig)
                return false;
        }
        return true;
        
        
    }
}