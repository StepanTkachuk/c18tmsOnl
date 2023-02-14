package by.tms.model;

public interface ChooseCashBoxStrategy {
    CashBox chooseCashBox(String customerName, CashBox[] cashBoxes);
}
