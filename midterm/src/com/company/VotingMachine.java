package com.company;

public class VotingMachine {
    int votesForDemocrat;

    int votesForRepublican;
    public VotingMachine(){
        this.votesForDemocrat = 0;
        this.votesForRepublican = 0;
    }

    public void voteDemocrat(){
        this.votesForDemocrat++;
    }

    public void voteRepublican(){
        this.votesForRepublican++;
    }

    public int getVotesForDemocrat() {
        return votesForDemocrat;
    }

    public int getVotesForRepublican() {
        return votesForRepublican;
    }
}
