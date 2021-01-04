package BuilderPattern;

public class FantasyTeam {
    String Quarterback;
    String RunningBack;
    String WideReceiver;
    String TightEnd;
    String Kicker;

    public FantasyTeam(TeamBuilder builder){
        Quarterback = builder.Quarterback;
        RunningBack = builder.RunningBack;
        WideReceiver = builder.WideReceiver;
        TightEnd = builder.TightEnd;
        Kicker = builder.Kicker;
    }

    public String toString(){
        return "Team:" +
                "\nQB: " + Quarterback +
                "\nRB: " + RunningBack +
                "\nWR: " + WideReceiver +
                "\nTE: " + TightEnd +
                "\nK: " + Kicker;
    }
}
