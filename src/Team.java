import java.util.List;

public class Team {
    String name;
    long points;
    List<String> results;

    public Team(String name, long points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", results=" + results +
                '}';
    }
}
