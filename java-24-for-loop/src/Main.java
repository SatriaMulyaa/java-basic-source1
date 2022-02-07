public class Main {
    public static void main(String[] args) {
//        for(initialize,condition,step_value) {
//        aksi;
//        }
        System.out.println("this is beginning of program");
        System.out.println("this first loop");
        for(int i = 0;i <= 10;i++){
            System.out.println("for loop to- " + i);
        }

        System.out.println("this second loop");
        for(int i = 0;i < 10;i++){
            System.out.println("for loop to- " + i);
        }

        System.out.println("this third loop");
        for(int i = 10;i >=5;i--){
            System.out.println("for loop to- " + i);
        }

        System.out.println("this fourt loop");
        int i = 0;
        boolean condition = true;
        for(;condition;i++){
            System.out.println("for loop to- " + i);
            if(i == 4){
                condition = false;
            }
        }

        System.out.println("this is final program");
    }
}
