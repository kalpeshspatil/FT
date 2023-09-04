package order.controller;

import order.dto.CreateSellDto;
import order.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "order")
public class SellController {

@Autowired
SellService sellService;

    @PostMapping("registerSellOrderFromRetailers")
    public boolean registerSellOrderFromRetailers(@RequestBody CreateSellDto orderDto)
    {
        sellService.sellOrderFromRetailers(orderDto);
        return true;
    }
}
