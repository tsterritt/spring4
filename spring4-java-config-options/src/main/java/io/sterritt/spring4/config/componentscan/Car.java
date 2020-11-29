package io.sterritt.spring4.config.componentscan;

public abstract class Car {

    private TrimPackage trimPackage;

    private EngineOption engineOption;

    private NavigationSystemOption navigationSystemOption;

    public Car(TrimPackage trimPackage, EngineOption engineOption) {
        this.trimPackage = trimPackage;
        this.engineOption = engineOption;
    }

    public TrimPackage getTrimPackage() {
        return trimPackage;
    }

    public void setTrimPackage(TrimPackage trimPackage) {
        this.trimPackage = trimPackage;
    }

    public EngineOption getEngineOption() {
        return engineOption;
    }

    public void setEngineOption(EngineOption engineOption) {
        this.engineOption = engineOption;
    }

    public NavigationSystemOption getNavigationSystemOption() {
        return navigationSystemOption;
    }

    public void setNavigationSystemOption(NavigationSystemOption navigationSystemOption) {
        this.navigationSystemOption = navigationSystemOption;
    }
}
