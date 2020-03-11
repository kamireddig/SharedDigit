package com.javaLearning;

public class hasSharedDigit {
    public static void main(String[] args){
        hasSharedDigit1(12,23);
        hasSharedDigit1(9,99);
        hasSharedDigit1(15,55);
    }
    public static boolean hasSharedDigit1(int a, int b){
        if(a >= 10 && a <= 99 & b >= 10 && b <= 99){
            while(a>0)
            {
                int p=a%10;
                if(b>0)
                {
                    int zz=b;
                    while(zz>0)
                    {
                        int z = zz % 10;
                        if(z==p)
                        {
                            return true;
                        }
                        zz=zz/10;
                    }
                }
                a=a/10;
            }
        }
        return false;
    }
}