public class StringSearch {
    public static void main(String[] args) {
        System.out.println(searchMatch("Neng Sitiporn", "rn"));
    }
    public static int searchMatch(String text,String ptt){
        for(int i=0; i<=text.length()-ptt.length(); i++){ //หา ptt จนถึงตัวสุดท้าย
            int j =0;
            while(j<ptt.length() && ptt.charAt(j) == text.charAt(i+j)){ //
                j = j+1;
            }
            if(j == ptt.length()){
                return i;
            }
        }
        return -1;
    }
}
