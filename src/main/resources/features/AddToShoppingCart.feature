@regression
Feature: user could add different products to Shopping cart
  Scenario: user add product to shopping cart
    When user click on the add to cart button
    And confirm adding to shopping cart
    Then the product is added successfully to the shopping cart