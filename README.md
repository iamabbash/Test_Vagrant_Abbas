Main Class
____

Main class is a driver class where I have added few team with static value. We can use scanner to Insert the value from the user input too. 
From this class we call the function like fetchTeamsByWinLoss with parameter as nConsecitiveWinOrLoss number and type as win/loss, it return list of team that matches the criteria also created another fucnction to find the average score of the filtered list.


Team:
___

Holds the data of team like Name, Points and Results


Operation:
____

This class majorly perform different operation like fetchTeamsByWinLoss and findAverage on list of teams.



Sample Input:
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


Sample Output:

Teams with 3 Consecutive Win are [Team{name='CCCC', points=5555, results=[win, win, win, win, win]}]
Average Score for the Teams with 3 Consecutive Win are 5555.0


Teams with 2 Loss are [Team{name='AAAA', points=2342, results=[win, loss, loss, win, win]}, Team{name='BBBB', points=123, results=[loss, loss, win, loss, win]}, Team{name='DDDD', points=2345, results=[win, loss, loss, loss, loss]}, Team{name='DDDD', points=2345, results=[win, loss, loss, loss, loss]}]
Average Score for the Teams with 2 Consecutive Loss are 1788.75


Teams with 4 Loss are [Team{name='DDDD', points=2345, results=[win, loss, loss, loss, loss]}]
Average Score for the Teams with 4 Consecutive Loss are 2345.0