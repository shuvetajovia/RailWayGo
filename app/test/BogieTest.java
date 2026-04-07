@Test
void testCargo_SafeAssignment() {
    GoodsBogie b = new GoodsBogie("Cylindrical");
    b.assignCargo("Petroleum");
    assertEquals("Petroleum", b.getCargo());
}

@Test
void testCargo_UnsafeAssignmentHandled() {
    GoodsBogie b = new GoodsBogie("Rectangular");

    assertThrows(CargoSafetyException.class, () -> {
        b.assignCargo("Petroleum");
    });
}

@Test
void testCargo_CargoNotAssignedAfterFailure() {
    GoodsBogie b = new GoodsBogie("Rectangular");

    try {
        b.assignCargo("Petroleum");
    } catch (CargoSafetyException e) {
        // ignore
    }

    assertNull(b.getCargo());
}