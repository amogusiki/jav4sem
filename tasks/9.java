//1)
public class Main {
    public static void Main(String[] args){
        while(1==1){
            System.out.println("abaoba");
        }
    }
}
public class Main {
    public static void main(String[] args){
        do{
            System.out.println("aboab");
        } while (true);
    }
}
//2)
public class Main {
    public static void main(String[] args){
        int a=0;
        do{
            a++;
            if(a>1000000){
                break;
            }
        } while (true);
        System.out.println(a);
    }
}
public class Main {
    public static void main(String[] args){
        int a=0;
        do{
            a--;
            if(a>1000000){
                continue;
            }
            a+=2;
        } while (true);
    }
}
