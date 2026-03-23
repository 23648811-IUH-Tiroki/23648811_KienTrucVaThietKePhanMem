package observer;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(double status) {
        System.out.println(name + " nhận update task: trạng thái = " + status);
    }
}