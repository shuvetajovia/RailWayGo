@Test
void testSafety_AllBogiesValid() {
    List<GoodsBogie> bogies = Arrays.asList(
            new GoodsBogie("Cylindrical", "Petroleum"),
            new GoodsBogie("Open", "Coal")
    );

    assertTrue(UC12SafetyComplianceApp.isTrainSafe(bogies));
}

@Test
void testSafety_CylindricalWithInvalidCargo() {
    List<GoodsBogie> bogies = Arrays.asList(
            new GoodsBogie("Cylindrical", "Coal")
    );

    assertFalse(UC12SafetyComplianceApp.isTrainSafe(bogies));
}

@Test
void testSafety_EmptyBogieList() {
    List<GoodsBogie> bogies = new ArrayList<>();

    assertTrue(UC12SafetyComplianceApp.isTrainSafe(bogies));
}