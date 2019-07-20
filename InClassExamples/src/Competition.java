public class Competition {
    String name, winningTeam, runnerUp;
    int year;

    public Competition() {
    }

    public Competition(String name, String winningTeam, String runnerUp, int year) {
        this.name = name;
        this.winningTeam = winningTeam;
        this.runnerUp = runnerUp;
        this.year = year;
    }

    public void print() {
//        System.out.format("%-15s%-15s%-15s%-15s\n", "Competition","Winning Team", "Runner Up", "Year 3");

        System.out.format("%-15s%-15s%-15s%-15s\n",
                this.name, this.winningTeam, this.runnerUp, this.year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(String winningTeam) {
        this.winningTeam = winningTeam;
    }

    public String getRunnerUp() {
        return runnerUp;
    }

    public void setRunnerUp(String runnerUp) {
        this.runnerUp = runnerUp;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
