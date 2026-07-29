class demo {
    public static void main(String[] args) {
        int n = 10203040;
       System.out.println( sumAndMultiply(n));
    }
    public static  long sumAndMultiply(int n) { 
        long num = 0;
        long sum = 0;
    while (n > 0)
    {
        int digit = n % 10;
        if(digit != 0)
        {
         num = num*10+digit;
         sum += digit;
        }
        n /=10;
    }
    long  rev = 0;

    while (num > 0) {
    rev = rev * 10 + num % 10;
    num /= 10;
}
    System.out.println(rev);
    System.out.println(num);
    System.out.println(sum);
    return rev*sum;
    }
}