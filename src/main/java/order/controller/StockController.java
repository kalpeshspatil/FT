package order.controller;

import order.dto.CreateStockDto;
import order.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class StockController {

    @Autowired
    StockService orderToProviderService;


    @PostMapping("registerStock")
    public boolean registerStock(@RequestBody CreateStockDto orderDto)
    {
        orderToProviderService.registerStock(orderDto);
        return true;
    }
}
