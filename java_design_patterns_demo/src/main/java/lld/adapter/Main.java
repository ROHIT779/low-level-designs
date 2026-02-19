package lld.adapter;

public class Main {

    public static void main(String[] args){
        // Class adapter
        System.out.println("***** Class Adapter *****");
        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
        populateEmployeeData(classAdapter);
        BusinessCardDesigner cardDesigner = new BusinessCardDesigner();
        String card = cardDesigner.designCard(classAdapter);
        System.out.println(card);

        System.out.println("********** ************");

        // Object adapter
        System.out.println("***** Object Adapter *****");
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        String newCard = cardDesigner.designCard(objectAdapter);
        System.out.println(newCard);
    }

    private static void populateEmployeeData(Employee employee){
        employee.setFulName("Rohit Sharma");
        employee.setJobTitle("Lead Engineer - Platform");
        employee.setOfficeLocation("48, Brookfield, Bangalore, 543314");
    }
}
