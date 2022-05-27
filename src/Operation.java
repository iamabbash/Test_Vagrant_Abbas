import java.util.ArrayList;
import java.util.List;

public class Operation {

    public List<Team> fetchTeamsByWinLoss(List<Team> teams,int nConsecutiveWinsOrLoss, String winOrLoss){
        List<Team> result = new ArrayList<>();
        for(Team team : teams){
            for(int i=0; i<team.getResults().size(); i++){
                int total = 0;
                if(team.getResults().get(i).equals(winOrLoss)){
                    total++;
                    while(total < nConsecutiveWinsOrLoss && (i+1) < team.getResults().size() &&
                            team.getResults().get(i+1).equals(winOrLoss)){
                        total++;
                        i++;
                    }
                }
                if(total == nConsecutiveWinsOrLoss){
                    result.add(team);
                }
            }
        }
        return result;
    }
    public float findAverage(List<Team> teams){
        long sum = 0;
        if(teams.size() == 0){
            return 0;
        }
        for(Team team : teams){
            sum +=team.getPoints();
        }
        return (float) sum/teams.size();
    }
}
