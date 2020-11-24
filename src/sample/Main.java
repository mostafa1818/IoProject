package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

public class Main   {

    public static void main(String[] args) {


            Properties  Input =new Properties();
        for(int CounterA=0;CounterA<6;CounterA +=2)
        {

            Scanner Scan = new Scanner(System.in);
            String InputA;
            int InputB;
            while(true) {
                System.out.println("Input String: ");
                  InputA = Scan.next();
                if(InputA.length()<=5){break;}else {System.out.print("re");}
            }
            while(true) {
                System.out.println("Input  Integer: ");
                InputB = Scan.nextInt( 3);

                if(InputB<= 999 && InputB>=0){break;}else {System.out.print("re");}
            }


            Input.put(String.valueOf(CounterA),InputA);
            Input.put(String.valueOf(CounterA+1),String.valueOf(InputB));

        }

            try(FileOutputStream Output = new FileOutputStream("save. Properties"); )
            {

                Input.store(Output,null);
                for(int CounterA=0;CounterA<6;CounterA +=2) {
                    System.out.printf("%-15s%03d\n",
                            Input.getProperty(String.valueOf(CounterA)),
                            Integer.valueOf(Input.getProperty(String.valueOf(CounterA+1))));

                }




            }catch(Exception e){System.out.println("  "+e );}









    }
}
