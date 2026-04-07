@Test
void testException_ValidCapacityCreation() throws Exception {
    Bogie b = new Bogie("Sleeper", 50);
    assertEquals(50, b.getCapacity());
}

@Test
void testException_NegativeCapacityThrowsException() {
    assertThrows(InvalidCapacityException.class, () -> {
        new Bogie("Sleeper", -10);
    });
}

@Test
void testException_ZeroCapacityThrowsException() {
    assertThrows(InvalidCapacityException.class, () -> {
        new Bogie("Sleeper", 0);
    });
}

@Test
void testException_ExceptionMessageValidation() {
    Exception e = assertThrows(InvalidCapacityException.class, () -> {
        new Bogie("Sleeper", 0);
    });
    assertEquals("Capacity must be greater than zero", e.getMessage());
}