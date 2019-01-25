package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getCargoVolume(10.5, 12.5, 15.5, true));
        System.out.println(getCargoVolume(10, 12, 15, false));


    }

    private static double getCargoVolume(double x, double y, double z, boolean heavyDuty)
    {
        double thickness = .25;

        if (heavyDuty)
        {
            thickness = thickness * 2;
        }
        double thicknessx2 = 2 * thickness;
        double interiorVolume = (x - thicknessx2) * (y - thicknessx2) * (z - thicknessx2);
        return interiorVolume;


    }
}
