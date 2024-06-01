public class series {
    // in this if we have given a number then we have to print the number till the given number.
    
    static void serial1(int n){
        if(n==0){
            return ;
        }
        else{
            System.out.print(n + " ");
            serial1(n-1); 
        }
    }

    static void serial2(int n){
        if(n==0){
            return ;
        }
        else{
            serial2(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        
        serial1(5);  
        System.out.println();
        serial2(5);
    }
}
