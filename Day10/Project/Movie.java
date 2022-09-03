public class Movie {
    String name;
    double rating;
    int total_vote = 3;
    int total_rate = 10;

    Movie(){
        this.name = "제작중";
    }
    Movie(String name){
        this.name = name;
    }
    public double getRating(){
        if(total_vote==0){
            return 0.0;
        }

        //Math.round(값)
        //total_rate를 total_vote로 나눈 결과를 return
        //double rate = total_rate/total_vote;
        //return rate;
        return Math.round((double)total_rate/total_vote*10)/10.0;
    }
    //영화의 이름을 return
    public String getName(){    
        return name;
    }
    //영화의 투표수(total_vote) return
    public int getVote(){
        return total_vote;
    }

    public void vote(int rate) throws Exception{
        // 총 투표수 증가
        total_vote += 1;
        // 총 점수 증가
        total_rate += rate;
        // 총 투표수가 1000에 도달하면 Exception 발생
        if(total_vote>=1000) throw new Exception("Total_vote cannot over 1000");
    }
}
