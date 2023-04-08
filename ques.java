package patternquestions;


//que

public class ques {
    public static void main(String[] args){
        int r,c;
        r=4;
        c=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
//* * * *
//*     *
//*     *
//* * * *
class que2{
    public static void main(String[] args){
        int r,c;
        r=4;
        c=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || j==1 || i==r ||j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
 class que3{
    public static void main(String[] args){
        int r=4;
        int c=4;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
 }
 class que4{
    public static void main(String[] args){
        int r=4;
        for(int i=r;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
 }
//      *
//    * *
//  * * *


//que 5:  *
//        **
//        ***
//        ****

 class que5{
    public static void main(String[] args){
        int r=4;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");

            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }

// que 6:  1
//         1 2
//         1 2 3
//         1 2 3 4

class que6{
    public static void main(String[] args){
        int r=5;
        for(int i=1;i<r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 }

// que 7 1 2 3 4 5
//         1 2 3 4
//         1 2 3
//         1 2
//         1

class que7{
    public static void main(String[] args){
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
 }

// ques 8: 1
//         2 3
//         4 5 6
//         7 8 9 10
//         11 12 13 14 15

 class que8{
    //floyd mirror
     public static void main(String[] args){
         int r=5;
         int number=1;
         for(int i=1;i<=r;i++){
             for (int j=1;j<=i;j++){
                 System.out.print(number+" ");
                 number++;

             }
             System.out.println();
         }
     }
 }

// que 8b: 15 14 13 12
//         11 10 9
//         8 7
//         6

class que8_1{
    public static void main(String[] args){
        int r=5;
        int num=15;
        for(int i=1;i<=num;i++){
            for(int j=1; j<=r-i;j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
 }

// que9    1
//         0 1
//         1 0 1
//         0 1 0 1
//         1 0 1 0 1

class que9{
    public static void main(String[] args){
        int r=5;

        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+ " ");
                }
                else{
                    System.out.print("0"+" ");
                }

            }
            System.out.println();
        }
    }
 }