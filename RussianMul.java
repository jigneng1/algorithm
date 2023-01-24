public class RussianMul {
    public static void main(String[] args) {
        System.out.println(Russian(10, 20));
    }
    public static int Russian(int a , int b){
        int res =0;
        while( b > 0){
            if((b&1)!= 0){
                res =res+ a;
            }
            a = a << 1;
            b = b >> 1;
        }
        return res;
    }
}
