package core.basesyntax.service.handlers;

import core.basesyntax.db.Warehouse;
import core.basesyntax.model.Fruit;
import core.basesyntax.model.Transaction;

public class BalanceOperationHandler implements OperationHandler {
    @Override
    public void processOperation(Transaction.Operation operation, Fruit fruit, Integer quantity) {
        Warehouse.getWarehouse().put(fruit, quantity);
    }
}
