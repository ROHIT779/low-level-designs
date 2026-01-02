package lld.adapter;

//Object adapter, Using Composition to translate interface
public class EmployeeObjectAdapter implements Customer{

    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return adaptee.getFulName();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }
}
