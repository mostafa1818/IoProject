package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main   {




    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        for(int CounterA=0;CounterA<3;CounterA++)
        {
            System.out.println("Input  Integer: ");
            int InputB = Scan.nextInt();
            System.out.println("Input String: ");
            String InputA= Scan.next();
            System.out.printf("%-15s %03d\n", InputA, InputB);
        }


    }
}
