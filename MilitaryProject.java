
public class MilitaryProject extends Project {
	
    private String deadline;
    private String password;
    private static final int MAX_MEMBERS = 15;

    public MilitaryProject(String title, String objective, long funds, Member manager, String deadline, String password) {
        super(title, objective, funds, manager);
        this.deadline = deadline;
        this.password = password;
    }

    public String getDeadline() {
		return deadline;
	}

	@Override
    public double getRisk() {
        return getMembers().size() / password.length() / getFunds();
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