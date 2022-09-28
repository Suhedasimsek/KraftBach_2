package day_37;

import javax.naming.Name;

public class SoftwareDvelopmentTeam extends Person{
    private String teamName;
   private String domain;
    int numberOfPersonel;
    private String personalName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getNumberOfPersonel() {
        return numberOfPersonel;
    }

    public void setNumberOfPersonel(int numberOfPersonel) {
        this.numberOfPersonel = numberOfPersonel;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }
}
