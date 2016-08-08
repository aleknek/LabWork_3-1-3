import java.io.File;

public class Main {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{

        MyFileCopy myFileCopy = new MyFileCopy();
        try {
            myFileCopy.copyFile(args[0], args[1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }

    }

}
