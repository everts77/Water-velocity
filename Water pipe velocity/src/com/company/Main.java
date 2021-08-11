package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Pipe water velocity calculation:");

        double Q; // расход воды, м3/с
        double D; // внутренний диаметр трубы, м
        double V; // скорость течения теплоносителя, м/сек

        Scanner flow = new Scanner(System.in);
        System.out.print("Enter water flow, m3/h: ");
        double Qwater = flow.nextDouble();

        Q = Qwater/3600;

        Scanner dia = new Scanner(System.in);
        System.out.print("Enter pipe diameter, mm: ");
        double diametr = dia.nextDouble();

        D = diametr/1000;

        V = (4*Q)/(Math.PI*D*D);
        System.out.printf("Water velocity is: %.2f m/sec", V);
    }
}
