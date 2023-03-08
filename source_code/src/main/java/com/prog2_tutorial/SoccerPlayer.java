package com.prog2_tutorial;

public class SoccerPlayer {

    public static int teamNumber = 1;
    public String name;
    public int age;
    public int shirtNumber;
    public String team;
    public SoccerPlayer teamRival;

    public SoccerPlayer(String name, int age) {
        this.name = name;
        this.age = age;
        this.shirtNumber = teamNumber;
        teamNumber++;
    }

    public SoccerPlayer(String name, int age, SoccerPlayer teamRival) {
        this.name = name;
        this.age = age;
        this.shirtNumber = teamNumber;
        teamNumber++;

        this.teamRival = teamRival;
    }

    public int ageDifference(int age) {
        return Math.abs(age - this.age);
    }

    public boolean hasNoRival() {
        if (this.teamRival == null)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {

        if (this.teamRival == null)
            return this.name + ", shirt number: " + this.shirtNumber;
        else
            return this.name + ", shirt number: " + this.shirtNumber + ", rival: " + this.teamRival.name;
    }

    public static void main(String[] args) {

        SoccerPlayer mueller;
        mueller = new SoccerPlayer("Thomas Mueller", 32);
        SoccerPlayer sane = new SoccerPlayer("Leroy Sane", 26, mueller);
        SoccerPlayer lewandowski = new SoccerPlayer("Robert Lewandowski", 33, mueller);

        System.out.println(mueller);
        System.out.println(sane);
        System.out.println(lewandowski);

    }

}