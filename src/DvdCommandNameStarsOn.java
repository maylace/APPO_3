/**
 * Created by Dorin Luca on 26.05.2017.
 */
public class DvdCommandNameStarsOn extends CommandAbstract{
    private DvdName dvdName;

    public DvdCommandNameStarsOn(DvdName dvdNameIn) {
        this.dvdName = dvdNameIn;
    }
    public void execute() {
        this.dvdName.setNameStarsOn();
    }
}
