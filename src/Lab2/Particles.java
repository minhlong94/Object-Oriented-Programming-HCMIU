package Lab2;
import java.util.ArrayList;

public class Particles{

    private ArrayList<Integer> listOfX = new ArrayList<>();
    private ArrayList<Integer> listOfY = new ArrayList<>();

    private int width = Box.getWidth();
    private int height = Box.getHeight();
    public Particles(){
    }

    public ArrayList<Integer> createParticleX(int i){
        for (int j = 1; j<=i;j++){
            listOfX.add(getRandom.Random(1,width-2));
        }
        return listOfX;
        }

    public ArrayList<Integer> createParticleY(int i){
        for (int j = 1; j<=i;j++){
            listOfY.add(getRandom.Random(1,height-2));
        }
        return listOfY;
    }

//    public static void clearScreen() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }

}
