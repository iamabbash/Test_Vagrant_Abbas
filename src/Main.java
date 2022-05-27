import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();

        Team a = new Team("AAAA",2342);
        List<String> aResult = new ArrayList<>();
        aResult.add("win");
        aResult.add("loss");
        aResult.add("loss");
        aResult.add("win");
        aResult.add("win");
        a.setResults(aResult);


        Team b = new Team("BBBB",123);
        List<String> bResult = new ArrayList<>();
        bResult.add("loss");
        bResult.add("loss");
        bResult.add("win");
        bResult.add("loss");
        bResult.add("win");
        b.setResults(bResult);


        Team c = new Team("CCCC",5555);
        List<String> cResult = new ArrayList<>();
        cResult.add("win");
        cResult.add("win");
        cResult.add("win");
        cResult.add("win");
        cResult.add("win");
        c.setResults(cResult);

        Team d = new Team("DDDD",2345);
        List<String> dResult = new ArrayList<>();
        dResult.add("win");
        dResult.add("loss");
        dResult.add("loss");
        dResult.add("loss");
        dResult.add("loss");
        d.setResults(dResult);

        Team e = new Team("EEEE",1232);
        List<String> eResult = new ArrayList<>();
        eResult.add("win");
        eResult.add("loss");
        eResult.add("win");
        eResult.add("loss");
        eResult.add("win");
        e.setResults(eResult);


        List<Team> allTeams = new ArrayList<>();
        allTeams.add(a);
        allTeams.add(b);
        allTeams.add(c);
        allTeams.add(d);
        allTeams.add(e);

        List<Team> teamsWith3win = operation.fetchTeamsByWinLoss(allTeams,3,"win");
        System.out.println("Teams with 3 Consecutive Win are " + teamsWith3win.toString());
        System.out.println("Average Score for the Teams with 3 Consecutive Win are " + operation.findAverage(teamsWith3win));
        System.out.println();
        System.out.println();


        List<Team> teamsWith2loss = operation.fetchTeamsByWinLoss(allTeams,2,"loss");
        System.out.println("Teams with 2 Loss are " + teamsWith2loss);
        System.out.println("Average Score for the Teams with 2 Consecutive Loss are " + operation.findAverage(teamsWith2loss));
        System.out.println();
        System.out.println();

        List<Team> teamsWith4loss = operation.fetchTeamsByWinLoss(allTeams,4,"loss");
        System.out.println("Teams with 4 Loss are " + teamsWith4loss);
        System.out.println("Average Score for the Teams with 4 Consecutive Loss are " + operation.findAverage(teamsWith4loss));
        System.out.println();
        System.out.println();
    }
}
