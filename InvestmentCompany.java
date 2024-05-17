import java.util.ArrayList;

public class InvestmentCompany {
    private ArrayList<Project> projects;

    public InvestmentCompany() {
        this.projects = new ArrayList<>();
    }

    public void add(Project p) {
        projects.add(p);
    }

    public Project getBestInvestment() {
        if (projects.isEmpty()) {
            return null;
        }
        Project bestProject = projects.get(0);
        for (Project project : projects) {
            if (project.getRisk() < bestProject.getRisk()) {
                bestProject = project;
            }
        }
        return bestProject;
    }

    public static void main(String[] args) {
        Member manager1 = new Member("Ana", 35);
        Member manager2 = new Member("Maria", 40);
        Member member1 = new Member("Alex", 25);
        Member member2 = new Member("Dani", 30);

        CommercialProject cp = new CommercialProject("Commercial", "Develop a commercial ", 1000000, manager1, "2023-12-31", 5);
        cp.addMember(member1);
        cp.addMember(member2);

        MilitaryProject mp = new MilitaryProject("Military", "Develop military ", 2000000, manager2, "2024-06-30", "secret123");
        mp.addMember(member1);

        OpenSourceProject osp = new OpenSourceProject("Open Source", "Develop an open source ", 500000, manager1, "opensource@example.com");
        osp.addMember(member2);

        InvestmentCompany company = new InvestmentCompany();
        company.add(cp);
        company.add(mp);
        company.add(osp);

        Project bestInvestment = company.getBestInvestment();
        if (bestInvestment != null) {
            System.out.println("The best project is: " + bestInvestment.getTitle());
        } else {
            System.out.println("No projects.");
        }
    }
}
