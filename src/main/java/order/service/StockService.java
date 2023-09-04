package order.service;

import order.dto.CreateStockDto;
import org.springframework.stereotype.Service;

public interface StockService {
    void registerStock(CreateStockDto orderDto);
}
