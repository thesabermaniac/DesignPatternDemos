package BuilderPattern;

/**
 * Builder object for the FantasyTeam class. This allows the user to build a
 * FantasyTeam object piece-by-piece without instantiating the object until
 * its' design is completed.
 */
public class TeamBuilder implements Builder{
    String Quarterback;
    String RunningBack;
    String WideReceiver;
    String TightEnd;
    String Kicker;

    public TeamBuilder setQuarterback(String qb){
        Quarterback = qb;
        return this;
    }

    public TeamBuilder setRunningBack(String rb){
        RunningBack = rb;
        return this;
    }

    public TeamBuilder setWideReceiver(String wr){
        WideReceiver = wr;
        return this;
    }

    public TeamBuilder setTightEnd(String te){
        TightEnd = te;
        return this;
    }

    public TeamBuilder setKicker(String k){
        Kicker = k;
        return this;
    }

    @Override
    public FantasyTeam build() {
        return new FantasyTeam(this);
    }
}
