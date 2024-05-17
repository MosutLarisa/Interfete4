
public class CommercialProject extends Project {
	
    private String deadline;
    private int nr;
    private long marketingFunds;
    private static final int MAX_MEMBERS = 15;

    public CommercialProject(String title, String objective, long funds, Member manager, String deadline, int nr) {
        super(title, objective, funds, manager);
        this.deadline = deadline;
        this.nr = nr;
        this.marketingFunds = funds / 2;
    }

    public String getDeadline() {
		return deadline;
	}

	@Override
    public double getRisk() {
        return (nr * 3.0 / getMembers().size()) / getFunds() - marketingFunds;
    }

    @Override
    public void addMember(Member m) {
        if (getMembers().size() < MAX_MEMBERS) {
            super.addMember(m);
        } else {
            System.out.println("Numarul maxim a fost atins.");
        }
    }
}