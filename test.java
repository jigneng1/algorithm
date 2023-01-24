public class test {
    public static void main(String[] args) {
        System.out.println(StringSearch("Neng", "ng"));
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
                    j = j+ i;
                }
            }
        }
        for (int i : arr) {
            System.out.print((i != 0)? i+" " : "");
        }
    }
    public static int StringSearch(String text , String ptt){
        for(int i=0; i<=text.length() - ptt.length(); i++){
            int j =0;
            while(j < ptt.length() && ptt.charAt(j) == text.charAt(i+j)){
                j = j+1;
            }
            if(j == ptt.length()){ //check ว่า มีหรือป่าว
                return i;
            }
        }
        return -1;
    }
}
