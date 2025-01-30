public class Pattern4 {
    public static void main(String[]args){
        int size=5; 
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i%2 ==0 && j%2 ==0){
                    System.out.print("*");
                }else{
                    System.out.print('#');
                }
            }
            System.out.println();
        }
    }
} 
