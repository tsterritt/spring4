package io.sterritt.spring4.design_patterns.creational.domain.interior;

import io.sterritt.spring4.design_patterns.creational.domain.interior.EAvailableInteriorOptions;

import java.util.ArrayList;
import java.util.List;

public class SelectedInteriorOptions {

    private List<EAvailableInteriorOptions> options;

    public SelectedInteriorOptions() {
        options = new ArrayList<EAvailableInteriorOptions>();
    }

    public void setHeatedSeats() {
        options.add(EAvailableInteriorOptions.HEATED_SEATS);
    }

    public void setElectronicAdjustedSeats() {
        options.add(EAvailableInteriorOptions.ELECTRONIC_ADJUSTED_SEATS);
    }

    public void setGPSNavigationSystem() {
        options.add(EAvailableInteriorOptions.GPS_NAV_SYSTEM);
    }

    public void setLeatherTrimmedSeats() {
        options.add(EAvailableInteriorOptions.LEATHER_TRIM);
    }

    public void setCargoAreaCover() {
        options.add(EAvailableInteriorOptions.CARGO_AREA_COVER);
    }

    public List<EAvailableInteriorOptions> getOptions() {
        return options;
    }

}
