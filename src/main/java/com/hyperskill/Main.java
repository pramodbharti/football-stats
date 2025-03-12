package com.hyperskill;

import com.hyperskill.ui.SportsStatisticsInterface;

public class Main {
    public static void main(String[] args) {
        // todo : create database object and pass it to interface
        SportsStatisticsInterface sportsStatisticsInterface = new SportsStatisticsInterface();
        sportsStatisticsInterface.start();
    }
}