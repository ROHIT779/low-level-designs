package lld.adapter;

// Class adapter, also called Two-way adapter
public class EmployeeClassAdapter extends Employee implements Customer{

    @Override
    public String getName() {
        return this.getFulName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
