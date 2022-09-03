import java.util.*;

public class MovieMain {
    public static void main(String[] args) {
        Movie mov1 = new Movie("007 No Time to Die");
        Movie mov2 = new Movie("Venom2");
        Movie mov3 = new Movie("Ant");
        Movie mov4 = new Movie("Matrix");
        Movie mov5 = new Movie("MI:6");
        //System.out.println(mov1.getRating());
        Random rd = new Random();
        //무작위로 다섯개의 영화중 하나를 선정하여 투표를 한다.
        //점수는 1~5까지의 점수 중 랜덤
        //익셉션이 발생할때까지 수행

        while(true){
            int i = rd.nextInt(5);
            int rate = rd.nextInt(5) + 1;
            try{
            if(i==0)
                mov1.vote(rate);
            else if(i==1)
                mov2.vote(rate);
            else if(i==2)
                mov3.vote(rate);
            else if(i==3)
                mov4.vote(rate);
            else
                mov5.vote(rate);
            }
            catch(Exception e){
                e.printStackTrace();
                break;
            }
        }

        //ArrayList에 Movie들을 넣는다.
        ArrayList al = new ArrayList<>();
        al.add(mov1);
        al.add(mov2);
        al.add(mov3);
        al.add(mov4);
        al.add(mov5);

        PrintResult.print(al);
    }
}
class PrintResult {
    public static void print(ArrayList al){
        //al에서 하나씩 꺼내서 영화이름, 총투표수, 평점을 display
        for(int i=0; i<al.size(); i++){
            Movie mv = (Movie)al.get(i);
            System.out.println("\"" + mv.getName() + "\" Votes : " + mv.getVote() + " Rating : " + mv.getRating());
        }
    }
}
