package io.sterritt.spring4.design_patterns.creational.domain.performance;

import io.sterritt.spring4.design_patterns.creational.domain.performance.EAvailablePerformanceOptions;

import java.util.ArrayList;
import java.util.List;

public class SelectedPerformanceOptions {

    private List<EAvailablePerformanceOptions> options;

    public SelectedPerformanceOptions() {
        this.options = new ArrayList<EAvailablePerformanceOptions>();
    }

    public void setPaddleShifters() {
        options.add(EAvailablePerformanceOptions.PADDLE_SHIFTERS);
    }
    public void setPerformanceTires() {
        options.add(EAvailablePerformanceOptions.PERFORMANCE_TIRES);
    }
    public void setPerformanceShocks(){
        options.add(EAvailablePerformanceOptions.PERFORMANCE_SHOCKS);
    }
    public List<EAvailablePerformanceOptions> getOptions() {
        return options;
    }
}
