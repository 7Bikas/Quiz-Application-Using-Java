import java.util.*;
public class MainActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****Quiz****");
        System.out.println(" 1.History\n 2.Geography\n 3.Science\n 4.Sports");
        System.out.println("Enter your choice :");
        int n;
        n=sc.nextInt();
        switch(n){
            case 1:{
                System.out.println("****History****");
                history.main(args);
                break;
            }
            case 2:{
                System.out.println("****Geography****");
                geography.main(args);
                break;
            }
            case 3:{
                System.out.println("****Science****");
                science.main(args);
                break;
            }
            case 4:{
                System.out.println("****Sports****");
                sports.main(args);
                break;
            }
            default:
            {
                System.out.println("Enter a valid choice !");
                break;
            }
           
        }
    }
}
