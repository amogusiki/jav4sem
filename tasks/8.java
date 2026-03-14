// 1)
public class Main {
    public static void main(String[] args) {
        int i=0;
        int a = 1;
        String b = "aboba";
        switch(a){
            case 0: i+=0;
            case 1: i+=1;
        }
        switch(b){
            case "bebra": i++;
            case "aboba": i+=2;
        }
        System.out.println(i);
    }
}
// 2) следующий кейс после правильного тоже выполнится
