class Task_06{
    public static void main(String[] args) {
        
        int[][][] opers = {
            { {100, -50, 25}, {150,-300}, {300,-90,100} },
            { {90, -60, 250}, {300,20,-100} },
            { {20, 50}, {300}, {20,-20,40}, {100,-200} }
            };
        
        print2d(accountBalance(opers));
    }
    static int[] accountBalance(int[][][] operations){
        
        int[] balance=new int[operations.length];
        for(int i=0;i<operations.length;i++){
            for(int j=0;j<operations[i].length;j++){
                for(int k=0;k<operations[i][j].length;k++){
                   balance[i]+=operations[i][j][k]; 
                }
            }
        }
        return balance;
    }
    static void print(String msg){
        System.out.println(msg);
    }
    static void print2d(int[] in){
        for(int i=0;i<in.length;i++){
            print(String.valueOf(in[i]));
        }
    }
}