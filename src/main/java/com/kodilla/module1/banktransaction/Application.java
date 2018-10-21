package com.kodilla.module1.banktransaction;

class Application {

    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
        //////////////////////////////////////////////////////////////////////////////////
        ProductSalaryEmployee employee2 = new ProductSalaryEmployee(500, 5.0);
        BonusSalaryEmployee employee3 = new BonusSalaryEmployee(2000, 0.2);
        ///////////////////////////////////////////////////////////////////////////////////

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee1);
        processor.processPayout();

        ///////////////////////////////////////////////////////////////////////////////////
        SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(employee2);
        processor2.processPayout();
        SalaryPayoutProcessor processor3 = new SalaryPayoutProcessor(employee3);
        processor3.processPayout();
        ///////////////////////////////////////////////////////////////////////////////////
    }

}
