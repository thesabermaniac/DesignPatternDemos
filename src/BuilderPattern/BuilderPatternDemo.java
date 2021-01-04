package BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        TeamBuilder builder = new TeamBuilder();
        builder.setQuarterback("Lamar Jackson")
                .setRunningBack("Derrick Henry")
                .setWideReceiver("Stefon Diggs")
                //Notice how you can easily change on of the variables without changing the FantasyTeam object (since it hasn't been built yet)
                .setQuarterback("Patrick Mahomes")
                .setTightEnd("Travis Kelce")
                .setKicker("Justin Tucker");
        FantasyTeam team = builder.build();
        System.out.println(team.toString());
    }
}
