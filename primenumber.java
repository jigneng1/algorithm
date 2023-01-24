class Main{
    public static void main(String[] args) {
        //BruteforcePrime(20);
        Seive(20);
    }
    public static void BruteforcePrime(int n){
        for(int i=2; i<n;i++){
            boolean check = true;
            for(int j=2; j<i; j++){
                if(i%j==0 && i!=j){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(i+" ");
            }
        }
    }
    public static void Seive(int n){
        int[] arr = new int[n+1];
        for(int i=2; i<=n; i++){
            arr[i] = i;
        }
        for(int i=2; i<=Math.sqrt((double)n); i++){
            if(arr[i] != 0){
                int j = i*i;
                while(j <= n){
                    arr[j] = 0;
                    j = j+i; //4+2, 6+2 ,8+2
                }
            }
        }
        for (int i : arr) {
            if(i != 0){
                System.out.print(i+" ");
            }
        }
    }
}