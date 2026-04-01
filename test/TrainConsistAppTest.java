@Test
void testGroupbogiesByType() {

    List<bogie> bogies = Arrays.asList(
            new bogie("Sleeper", 72, "Passenger"),
            new bogie("AC Chair", 60, "Passenger"),
            new bogie("Cargo", 100, "Goods")
    );

    Map<String, List<bogie>> result = bogies.stream()
            .collect(Collectors.groupingBy(Bogie::getType));

    // Check Passenger group
    assertEquals(2, result.get("Passenger").size());

    // Check Goods group
    assertEquals(1, result.get("Goods").size());
}