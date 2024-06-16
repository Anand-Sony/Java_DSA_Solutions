public class pronic {

    static void pronica(int n){
        boolean flag = false;
        for(int i=0 ; i<=n ; i++){
        
                if (i*(i+1)==n) {
                    flag= true;
                    break;
                }
        }
        if (flag==true) {
            System.out.println("Pronic number");
        }
        else{
            System.out.println("not a pronic number");
        }

    }
    public static void main(String[] args) {


        int n=72;
        for(int i=1 ; i<=n ; i++){
            System.out.print("number " + i + " is ");
            pronica(i);
        }
        
    }
    
}