import java.util.ArrayList;

public abstract class Project implements Risky {
    private String title;
    private String objective;
    private long funds;
    private Member manager;
    private ArrayList<Member> members;

    public Project(String title, String objective, long funds, Member manager) {
        this.title = title;
        this.objective = objective;
        this.funds = funds;
        this.manager = manager;
        this.members = new ArrayList<>();
    }

    public void addMember(Member m) {
        members.add(m);
    }

    public String getTitle() {
        return title;
    }

    public String getObjective() {
        return objective;
    }

    public long getFunds() {
        return funds;
    }

    public Member getManager() {
        return manager;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }
}
