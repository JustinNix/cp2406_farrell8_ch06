public class CountByThrees {
    public static void main(String[] args) {
        int start = 3, end = 301;
        for(int i= start; i < end; i+=3){
            if(i%30 == 0){
                System.out.print(i);
                System.out.println();
            }
            else System.out.print(i + " ");
        }
    }
}
