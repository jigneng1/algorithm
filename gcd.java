public class gcd {
    public static void main(String[] args) {
        System.out.println(GCDEuclid(7, 12));
    }
    public static int findGCD(int a, int b){
        int r = 0;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i ==0 && b%i==0){
                r = i;
            }
        }
        return r;
    }

    public static int GCDEuclid(int a, int b){
        if(b == 0){
            return a;
        }
        return GCDEuclid(b, a%b);
    }
}
