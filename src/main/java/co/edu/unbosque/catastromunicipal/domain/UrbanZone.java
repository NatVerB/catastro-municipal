package co.edu.unbosque.catastromunicipal.domain;

import java.util.List;

public class UrbanZone {
    private String zoneName;
    private String zoneOd;
    private List<Housing> housings;

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getZoneOd() {
        return zoneOd;
    }

    public void setZoneOd(String zoneOd) {
        this.zoneOd = zoneOd;
    }

    public List<Housing> getHousings() {
        return housings;
    }

    public void setHousings(List<Housing> housings) {
        this.housings = housings;
    }
}
