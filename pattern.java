import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
//        for(int line=1;line<=4;line++){
//            //represent one line
//            for(int star=1;star<=line;star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        for (int line=1;line<=4;line++){
            //for(int star=1;s<=(n-i+1);star++)
            for(int star=4;star>=line;star--){
                System.out.print(star);
            }
            System.out.println();
        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int num=sc.nextInt();
//        for(int line=1;line<=num;line++){
//            for (int numbers=1;numbers<=line;numbers++){
//                System.out.print(numbers);
//            }
//            System.out.println();
//        }
//        for(int line=1;line<=4;line++){
//            //represent one line
//            for(int star=4;star>=line;star--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int  num=sc.nextInt();
//        char ch='A';
//        for(int line=1;line<=num;line++){
//            for (int chars=1;chars<=line;chars++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }
    }
}
