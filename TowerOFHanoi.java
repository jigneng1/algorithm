import java.util.Stack;

class TowerOFHanoi{
    public static void main(String[] args) {
        Tower th = new Tower(4);
        th.play();
    }
}
class Tower{
    Stack<Integer> pegA;
    Stack<Integer> pegB;
    Stack<Integer> pegC;
    int amountDisk;
    int ithMove;
    
    public Tower(int amountDisk){
        this.amountDisk = amountDisk;
        pegA = new Stack<Integer>();
        pegB = new Stack<Integer>();
        pegC = new Stack<Integer>();
        ithMove = 0;
        for(int i=amountDisk; i>0; i--){ //4 3 2 1 
            pegA.push(i);
        }
    }
    public void play(){
        Move(pegA.size(), pegA, pegC, pegB);
    }
    public void Move(int n,Stack<Integer>fromPeg, Stack<Integer>toPeg, Stack<Integer>availablePeg){
        if(n ==1){
            toPeg.push(fromPeg.pop());
            ithMove++;
            showTowerOfHanoi();
            return;
        }
        Move(n-1, fromPeg, availablePeg, toPeg);
        Move(1, fromPeg, toPeg, availablePeg);
        Move(n-1, availablePeg, toPeg, fromPeg);
    }
    public void showTowerOfHanoi(){
        int max;
        if(pegA.size()-1 >= pegB.size() && pegA.size() >= pegC.size()){
            max = pegA.size();
        }
        else if(pegB.size()-1 >= pegA.size() && pegB.size() >= pegC.size()){
            max = pegB.size();
        }
        else{
            max = pegC.size();
        }
        for(int i = max; i>=0; i--){
            if(pegA.size()-1 >=i){
                System.out.print(pegA.elementAt(i)+" ");
            }
            else{
                System.out.print(" ");
            }
            if(pegB.size()-1 >=i){
                System.out.print(pegB.elementAt(i)+" ");
            }
            else{
                System.out.print(" ");
            }
            if(pegC.size()-1 >=i){
                System.out.print(pegC.elementAt(i)+" ");
            }
            else{
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("Move"+ithMove+"----------------");
    }
}