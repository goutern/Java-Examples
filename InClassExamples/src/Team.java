public class Team {
    String teamName;
    String name1, name2, name3, name4;
    Competition competition1, competition2;

    public Team() {
    }

    public Team(String teamName, String name1, String name2, String name3, String name4, Competition competition1, Competition competition2) {
        this.teamName = teamName;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.competition1 = competition1;
        this.competition2 = competition2;
    }

    public void print() {

        System.out.format("\n%-15s%-15s%-15s%-15s%-15s\n",
                "Team Name", "Competitor 1", "Competitor 2", "Competitor 3", "Competitor 4");

        System.out.format("%-15s%-15s%-15s%-15s%-15s\n\n",
                this.teamName, this.name1, this.name2, this.name3, this.name4);

        System.out.format("%-15s%-15s%-15s%-15s\n",
                "Competed in", "Winning Team", "Runner-Up", "Year");

        competition1.print();
        competition2.print();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public Competition getCompetition1() {
        return competition1;
    }

    public void setCompetition1(Competition competition1) {
        this.competition1 = competition1;
    }

    public Competition getCompetition2() {
        return competition2;
    }

    public void setCompetition2(Competition competition2) {
        this.competition2 = competition2;
    }

}
