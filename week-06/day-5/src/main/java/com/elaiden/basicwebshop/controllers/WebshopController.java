package com.elaiden.basicwebshop.controllers;

import com.elaiden.basicwebshop.models.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebshopController {

  ArrayList<ShopItem> demoShop = new ArrayList<>();

  public WebshopController() {
    demoShop.add(new ShopItem("Running shoes", "Nike running shoes for every day sport",
        1000, 5));
    demoShop.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
    demoShop.add(new ShopItem("Coca-cola", "0.5l standard coke", 25, 0));
    demoShop.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
    demoShop.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1));
  }

  @GetMapping(value = "/webshop")
  public String webshopList(Model model) {
    model.addAttribute("wares", demoShop);
    return "index";
  }

  @GetMapping(value = "/only-available")
  public String onlyAvailable(Model model) {
    List<ShopItem> availableItems = demoShop.stream()
        .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
    model.addAttribute("wares", availableItems);
    return "index";
  }

  @GetMapping(value = "/cheapest-first")
  public String cheapestFirst(Model model) {
    List<ShopItem> ascendingByPrice = demoShop.stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("wares", ascendingByPrice);
    return "index";
  }

  @GetMapping(value = "/contains-nike")
  public String containsNike(Model model) {
    List<ShopItem> containsNike = demoShop.stream()
        .filter(shopItem -> shopItem.getDescription().toLowerCase().contains("nike") || shopItem
            .getName().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("wares", containsNike);
    return "index";
  }

  @GetMapping(value = "/average-stock")
  public String averageStock(Model model) {
    int totalQuantity = demoShop.stream()
        .mapToInt(ShopItem::getQuantityOfStock)
        .sum();
    double averageQuantity = (double) totalQuantity / (double) demoShop.stream()
        .count();
    model.addAttribute("queried", "Average stock: " + averageQuantity);
    return "indexTextOnly";
  }

  @GetMapping(value = "/most-expensive")
  public String mostExpensive(Model model) {
    String mostExpensive = demoShop.stream()
        .max(Comparator.comparing(ShopItem::getPrice))
        .get()
        .getName();
    model.addAttribute("queried", mostExpensive);
    return "indexTextOnly";
  }

  @PostMapping(value = "/search")
  public String searchBar(@RequestParam String searchBox, Model model) {
    List<ShopItem> itemsSearchedFor = demoShop.stream()
        .filter(
            shopItem -> shopItem.getName().toLowerCase().contains(searchBox.toLowerCase()) || shopItem
                .getDescription().toLowerCase().contains(searchBox.toLowerCase()))
        .collect(Collectors.toList());
    model.addAttribute("wares", itemsSearchedFor);
    return "index";
  }
}
