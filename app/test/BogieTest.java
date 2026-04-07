@Test
void testReduce_TotalSeatCalculation() {
    List<Bogie> bogies = Arrays.asList(
            new Bogie("Sleeper", 70),
            new Bogie("AC", 50)
    );

    int total = UC10TotalSeatCapacityApp.calculateTotalCapacity(bogies);

    assertEquals(120, total);
}

@Test
void testReduce_EmptyBogieList() {
    List<Bogie> bogies = new ArrayList<>();

    int total = UC10TotalSeatCapacityApp.calculateTotalCapacity(bogies);

    assertEquals(0, total);
}

@Test
void testReduce_SingleBogieCapacity() {
    List<Bogie> bogies = Arrays.asList(
            new Bogie("Sleeper", 80)
    );

    int total = UC10TotalSeatCapacityApp.calculateTotalCapacity(bogies);

    assertEquals(80, total);
}