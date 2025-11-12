package HW;

import HW.taxes.TaxFromDebit;
import HW.taxes.TaxFromDebitMinusCredit;
import HW.taxes.TaxSystem;

public class HW_2 {
    public static void main(String[] args) {

        TaxSystem taxSystem1 = new TaxFromDebit();
        TaxSystem taxSystem2 = new TaxFromDebitMinusCredit();
        Company Apple = new Company("Apple", taxSystem1);

        Apple.shiftMoney(1000);
        Apple.payTaxes();
        Apple.setTaxSystem(taxSystem2);
        Apple.shiftMoney(1000);
        Apple.payTaxes();
        Apple.shiftMoney(-1000);
        Apple.payTaxes();
    }
}