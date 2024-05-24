package expense.manager.currency.util;

import expense.manager.currency.entity.CurrencyEntity;
import expense.manager.currency.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class CurrencyMasterData {
    @Autowired
    private CurrencyRepository currencyRepository;

    @EventListener
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent event) {
        CurrencyEntity rupee = new CurrencyEntity(1, "India Rupee", "www.google.com");
        addCurrency(rupee);

        CurrencyEntity pound = new CurrencyEntity(2, "Pound", "www.google.com");
        addCurrency(pound);
    }

    @Transactional
    private void addCurrency(CurrencyEntity currencyEntity) {
        currencyRepository.save(currencyEntity);
    }
}
