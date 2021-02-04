public class Main {

    public static void main(String[] args) {
        System.out.println(  isCatPlaying(true,36));

    }
    public static boolean isCatPlaying(boolean summer,int temperature){
        if(temperature<25||temperature>45 && temperature>35){
            return summer=false;}
        else {
            return true;
        }
    }
}
