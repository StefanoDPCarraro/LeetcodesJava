class PalindromNumber {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x < 10){
            return true;
        }
        int exponent = 10;
        int auxExponent = 1;
        while(x / exponent >= 10){
            exponent *= 10;
        }
        int reverseX = 0;
        int aux = x;
        while(aux != 0){
            int divide = aux / exponent;
            reverseX += divide * auxExponent;
            aux -= divide * exponent;
            exponent /= 10;
            auxExponent *= 10;
        }
        if(x == reverseX){
            return true;
        }
        return false;
    }
}