# HolidayTravelVehicles
ITCS382 minicase

Minicase practice consists 7 classes in total(including main for testing system.)
- Vehicle: 6 owned attributes and 2 attributes from association relationship(Customer, Invoice)
- Customer: 4 owned attributes and 2 attributes from association relationship(Vehicle, Invoice)
- Option: 3 owned attributes and 1 attribute from association relationship(Invoice)
- Salesperson: 2 owned attributes and 1 attribute from association relationship(Invoice)
- invoice: 8 owned attributes and 5 attributes from association relationship(Customer, Salesperson, Vehicle, Option, TradeInAllowance)
- TradeInAllowance: 4 owned attributes and 1 attribute from association relationship(Invoice)
- Test: Show by create Customer c1 object and Invoice iv1 object, then add both into vehicle v1 object as attribute. And print it.
