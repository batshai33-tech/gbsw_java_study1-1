package WEEK;

public enum Week {
    Monday("월요일"),      //생성자 호출
    Tuesday("화요일"),
    Wednesday("수요일"),
    Thursday("목요일"),
    Friday("금요일"),
    Saturday("토요일"),
    Sunda("일요일");

    private String week;

    Week(String dayofweek){
        this.week = dayofweek;
    }

    public String getWeek() {
        return this.week;
    }
}
