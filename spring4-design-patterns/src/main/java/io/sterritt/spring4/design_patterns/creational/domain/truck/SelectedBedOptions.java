package io.sterritt.spring4.design_patterns.creational.domain.truck;

import java.util.ArrayList;
import java.util.List;

public class SelectedBedOptions {
    private List<EBedOptions> bedOptions;

    public SelectedBedOptions() {
        this.bedOptions = new ArrayList<EBedOptions>();
    }

    public void setBedCover() {
        this.bedOptions.add(EBedOptions.BED_COVER);
    }

    public void setBedShell() {
        this.bedOptions.add(EBedOptions.BED_SHELL);
    }

    public void setToolBox() {
        this.bedOptions.add(EBedOptions.TOOL_BOX);
    }

    public List<EBedOptions> getOptions() {
         return bedOptions;
    }
}
