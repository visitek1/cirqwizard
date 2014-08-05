package org.cirqwizard.settings;

/**
 * Created by simon on 05/08/14.
 */
public class ContourMillingSettings extends SettingsGroup
{
    @PersistentPreference
    @PreferenceGroup(name = "Feeds")
    private UserPreference<Integer> feedXY = new UserPreference<>("X and Y axes", 300_000, "mm/min");

    @PersistentPreference
    @PreferenceGroup(name = "Feeds")
    private UserPreference<Integer> feedZ = new UserPreference<>("X axis", 200_000, "mm/min");

    @PersistentPreference
    @PreferenceGroup(name = "Feeds")
    private UserPreference<Integer> feedArcs = new UserPreference<>("Arcs", 50, "%", PreferenceType.PERCENT);

    @PersistentPreference
    @PreferenceGroup(name = "Speed")
    private UserPreference<Integer> speed = new UserPreference<>("Tool speed", 1390, "µs", PreferenceType.INTEGER);

    @PersistentPreference
    @PreferenceGroup(name = "Heights")
    private UserPreference<Integer> clearance = new UserPreference<>("Clearance", 5_000, "mm");

    @PersistentPreference
    @PreferenceGroup(name = "Heights")
    private UserPreference<Integer> safetyHeight = new UserPreference<>("Safety height", 2_000, "mm");

    @PersistentPreference
    @PreferenceGroup(name = "Heights")
    private UserPreference<Integer> zOffset = new UserPreference<>("Z offset", null, "mm");

    @PersistentPreference
    @PreferenceGroup(name = "Heights")
    private UserPreference<Integer> workingHeight = new UserPreference<>("Working height", -1_800, "mm");

    @Override
    public String getName()
    {
        return "Contour milling";
    }

    @Override
    public String getPreferencesPrefix()
    {
        return "contour-milling";
    }

    public UserPreference<Integer> getFeedXY()
    {
        return feedXY;
    }

    public void setFeedXY(UserPreference<Integer> feedXY)
    {
        this.feedXY = feedXY;
    }

    public UserPreference<Integer> getFeedZ()
    {
        return feedZ;
    }

    public void setFeedZ(UserPreference<Integer> feedZ)
    {
        this.feedZ = feedZ;
    }

    public UserPreference<Integer> getFeedArcs()
    {
        return feedArcs;
    }

    public void setFeedArcs(UserPreference<Integer> feedArcs)
    {
        this.feedArcs = feedArcs;
    }

    public UserPreference<Integer> getSpeed()
    {
        return speed;
    }

    public void setSpeed(UserPreference<Integer> speed)
    {
        this.speed = speed;
    }

    public UserPreference<Integer> getClearance()
    {
        return clearance;
    }

    public void setClearance(UserPreference<Integer> clearance)
    {
        this.clearance = clearance;
    }

    public UserPreference<Integer> getSafetyHeight()
    {
        return safetyHeight;
    }

    public void setSafetyHeight(UserPreference<Integer> safetyHeight)
    {
        this.safetyHeight = safetyHeight;
    }

    public UserPreference<Integer> getZOffset()
    {
        return zOffset;
    }

    public void setZOffset(UserPreference<Integer> zOffset)
    {
        this.zOffset = zOffset;
    }

    public UserPreference<Integer> getWorkingHeight()
    {
        return workingHeight;
    }

    public void setWorkingHeight(UserPreference<Integer> workingHeight)
    {
        this.workingHeight = workingHeight;
    }
}
