package edu.kamase.midterm;

public class Boat {
    private int onboardCnt = 3;

    public Boat(){
        // DO NOTHING
    }

    public Boat(int peopleCnt){
        onboardCnt = peopleCnt;
    }

    public double getPeopleWeight(){
        return(onboardCnt * 200.0);
    }

    public static double computePeopleWeight(int cnt){
        return(cnt * 200.0);
    }
    
}
