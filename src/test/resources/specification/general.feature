Feature: General business rules

  Scenario: Item degrades by one per day
    Given an item with quality 10 and sell by date tomorrow
    When 1 day passed
    Then the item has quality 9
    And the item has sell by date today

  Scenario: Item degrades twice as fast after sell by date has passed
    Given an item with quality 2 and sell by date today
    When 1 day passed
    Then the item has quality 0
    And the item has sell by date yesterday

  Scenario: Item quality is never negative
    Given an item with quality 0 and sell by date today
    When 1 day passed
    Then the item has quality 0
    And the item has sell by date yesterday

  Scenario: Item "Aged Brie" increases in Quality per day
    Given an item named Aged Brie with quality 5 and sell by date tomorrow
    When 1 day passed
    Then the item has quality 6
    And the item has sell by date today

  Scenario: Item "Aged Brie" increases in Quality twice as fast per day after sell by date has passed
    Given an item named Aged Brie with quality 5 and sell by date today
    When 1 day passed
    Then the item has quality 7
    And the item has sell by date yesterday
    
  Scenario: An item cant have more than 50 quality
    Given an item named Aged Brie with quality 50 and sell by date today
    When 1 day passed
    Then the item has quality 50
    And the item has sell by date yesterday

  Scenario: Item "Sulfuras, Hand of Ragnaros" never decreases quality and its never sold
    Given an item named Sulfuras, Hand of Ragnaros with quality 80 and sell by date never
    When 1 day passed
    Then the item has quality 80
    And the item has sell by date never

  Scenario: Item "Backstage passes to a TAFKAL80ETC concert" increases in Quality per day
    Given an item named Backstage passes to a TAFKAL80ETC concert with quality 5 and sell by date 20 days
    When 1 day passed
    Then the item has quality 6
    And the item has sell by date 19 days

  Scenario: 10 days before the sell by date the item "Backstage passes to a TAFKAL80ETC concert" increase quality per 2
    Given an item named Backstage passes to a TAFKAL80ETC concert with quality 8 and sell by date 10 days
    When 1 day passed
    Then the item has quality 10
    And the item has sell by date 9 days

  Scenario: 5 days before the sell by date the item "Backstage passes to a TAFKAL80ETC concert" increase quality per 3
    Given an item named Backstage passes to a TAFKAL80ETC concert with quality 7 and sell by date tomorrow
    When 1 day passed
    Then the item has quality 10
    And the item has sell by date today

  Scenario: After the sell by date the item "Backstage passes to a TAFKAL80ETC concert" quality drops to 0
    Given an item named Backstage passes to a TAFKAL80ETC concert with quality 30 and sell by date today
    When 1 day passed
    Then the item has quality 0
    And the item has sell by date yesterday