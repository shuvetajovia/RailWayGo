@Test
void testGrouping_BogiesGroupedByType() {
    List<Bogie> bogies = Arrays.asList(
            new Bogie("Sleeper", 72),
            new Bogie("Sleeper", 80),
            new Bogie("AC Chair", 60)
    );

    Map<String, List<Bogie>> result =
            UC9GroupBogiesByTypeApp.groupBogiesByType(bogies);

    assertTrue(result.containsKey("Sleeper"));
    assertEquals(2, result.get("Sleeper").size());
}

@Test
void testGrouping_DifferentBogieTypes() {
    List<Bogie> bogies = Arrays.asList(
            new Bogie("Sleeper", 72),
            new Bogie("AC Chair", 60),
            new Bogie("First Class", 50)
    );

    Map<String, List<Bogie>> result =
            UC9GroupBogiesByTypeApp.groupBogiesByType(bogies);

    assertEquals(3, result.size());
}

@Test
void testGrouping_EmptyBogieList() {
    List<Bogie> bogies = new ArrayList<>();

    Map<String, List<Bogie>> result =
            UC9GroupBogiesByTypeApp.groupBogiesByType(bogies);

    assertTrue(result.isEmpty());
}