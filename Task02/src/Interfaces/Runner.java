package Interfaces;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Runner {
    public static void main(String[] args) {
        Serialize serial=new Serialize( "Benz","SUV", "4 by 4", "Patrol", 5);
        try {
            FileOutputStream fout = new FileOutputStream("output.ser");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(serial);
            out.flush();
            out.close();
            System.out.println("success");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

